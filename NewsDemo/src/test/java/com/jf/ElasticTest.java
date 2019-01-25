package com.jf;

import com.jf.apps.Application;
import com.jf.apps.autoProxy.Test2Service;
import com.jf.apps.autoProxy.TestService;
import com.jf.apps.elasticSearch.ElasticCurd;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ElasticTest {

    @Resource
    private ElasticCurd elasticCurd;

    /**
     * 测试 自动代理类是否可以访问
     */
    @Test
    public void show() {
        elasticCurd.save();
    }
}
