package com.jf.apps.query;

import com.jf.common.db.Query;
import com.jf.common.dbPro.QueryPro;
import com.jf.common.taglib.Paging;

/**
 * sun
 * 2018/8/3
 * 11:08
 */
public class QueryProDemo {


    public static void main(String[] args) {
        QueryPro query = new QueryPro();
        query.where("name").notNull();
        query.where("sex").like("女");
        System.out.println(query.getAndSQL());

        Paging paging = new Paging();
        paging.getWm().put("gg@NAME",123);
        paging.getWm().put("gg@SEX",123);
        System.out.println(paging.getAndSQL());

    }

}
