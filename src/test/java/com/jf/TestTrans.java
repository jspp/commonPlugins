package com.jf;

import com.jf.apps.Application;
import com.jf.apps.autoProxy.Test2Service;
import com.jf.apps.autoProxy.TestService;
import com.jf.apps.transaction.TestTransaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 测试事务 回滚
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestTrans {

    @Resource
    private TestTransaction testTransaction;


    @Test
    public void testRollBack() {
        testTransaction.test2();
    }


    @Test
    public void testNoRollBack() {
        testTransaction.test1();
    }
}
