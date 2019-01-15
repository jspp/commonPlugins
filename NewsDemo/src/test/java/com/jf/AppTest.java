package com.jf;

import com.jf.apps.Application;
import com.jf.apps.autoProxy.Test2Service;
import com.jf.apps.autoProxy.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AppTest {

    @Resource
    private TestService testService;

    @Resource
    private Test2Service test2Service;

    @Resource
    private BeanFactory beanFactory;

    @Test
    public void show() {
        testService.sayhello("123");
        test2Service.sayhello(1230);

        System.out.println(beanFactory.getBean(TestService.class).hashCode());
        System.out.println(beanFactory.getBean(Test2Service.class));

        System.out.println(testService.hashCode());
        System.out.println(test2Service);
    }
}
