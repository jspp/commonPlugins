package com.jf.apps.forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * 并行计算
 * Fork/Join
 * 2018/5/17
 * 17:24
 */
public class CaculatorForkAndJoin extends RecursiveTask<Long> {


private long start;
private long end;
private static final long THURSHOLD=10000L;  //临界值

    CaculatorForkAndJoin(long start, long end){
        this.start=start;
        this.end=end;
    }

    //重写方法
    @Override
    protected Long compute(){

            long length=end-start;
            System.out.println("======="+length);
            if(length<=THURSHOLD){
               System.out.println("=======开始计算");
               long sum=new Long(0);

               for(long i=start;i<=end;i++){
                   sum+=i;
               }
               return sum;
            }else{
                //中间值
                long mid=(start+end)/2;

                CaculatorForkAndJoin left=new CaculatorForkAndJoin(start,mid);
                left.fork();//进行拆分，同时压入现线程队列

                CaculatorForkAndJoin right=new CaculatorForkAndJoin(mid+1,end);
                right.fork();//进行拆分，同时压入现线程队列

                return left.join()+right.join();
            }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //创建 线程池
        ForkJoinPool pool = new ForkJoinPool(20);
        //创建任务
        CaculatorForkAndJoin task = new CaculatorForkAndJoin(0L,100000000L);

        //添加任务到线程池，获得返回值
        long sum = pool.invoke(task);

        long end = System.currentTimeMillis();
        System.out.println(sum+"  spend: "+(end - start)+" 毫秒");
    }

 }