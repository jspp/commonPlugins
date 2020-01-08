package com.jf.apps.autoProxy;

import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理
 * ouyangjie
 * 2019/1/12
 * 11:17
 */
public class JfServiceInvocationHandler implements InvocationHandler {

    static final Logger logger = LoggerFactory.getLogger(JfServiceInvocationHandler.class);


    private Object target;

    public JfServiceInvocationHandler(Object target) {
        this.target = target;
    }
    public JfServiceInvocationHandler() {

    }


    /**
     * 调用
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("toString")) {
            return AopUtils.getTargetClass(proxy).toString();
        }
        if (method.getName().equals("equals")) {
            return method.invoke(AopUtils.getTargetClass(proxy), args);
        }
        if (method.getName().equals("hashCode")) {
            return AopUtils.getTargetClass(proxy).hashCode();
        }
        logger.info("{}.{}({})",AopUtils.getTargetClass(proxy).getInterfaces()[0],method.getName(), args);
        Long timestamp = System.currentTimeMillis();
        Object rs = method.invoke(target,args);
        logger.info("{}.{}  耗时：{} ms",AopUtils.getTargetClass(proxy).getInterfaces()[0],method.getName(),System.currentTimeMillis()-timestamp);
        return rs;
    }



}
