package com.jf.apps.transaction;

import com.jf.common.db.BaseDao;
import com.jf.common.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestTransaction {

    @Resource
    private BaseDao dao;

    Logger logger = LoggerFactory.getLogger(TestTransaction.class);

    @Transactional
    public void test1(){
        test2();

        CWebMedia webMedia = new CWebMedia();
        webMedia.setName("test1_"+ DateUtil.getCurrentDateTime());
        dao.saveAll(webMedia);


    }

    @Transactional
    public void test2(){
        CWebMedia webMedia = new CWebMedia();
        webMedia.setName("test2_"+ DateUtil.getCurrentDateTime());
        dao.saveAll(webMedia);
        throw  new RuntimeException(" test2  excption");
    }




}
