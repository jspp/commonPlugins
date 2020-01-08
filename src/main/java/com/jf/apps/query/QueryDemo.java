package com.jf.apps.query;

import com.jf.common.db.Query;
import com.jf.common.taglib.Paging;

/**
 * sun
 * 2018/8/3
 * 11:08
 */
public class QueryDemo {


    public static void main(String[] args) {
        Query query = new Query();
        query.put("name","张三").or("group1");
        query.put("sex","男").or("group1");
        System.out.println(query.getAndSQL());

        Paging paging = new Paging();
        paging.getWm().put("gg@NAME",123);
        paging.getWm().put("gg@SEX",123);
        System.out.println(paging.getAndSQL());

    }

}
