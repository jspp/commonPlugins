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

    @Test
    public void testSave() {
        elasticCurd.save();
    }
    @Test
    public void testShowAll() {
        elasticCurd.ShowAll();
    }
    @Test
    public void testFindByGameId() {
        elasticCurd.findByGameId();
    }
    @Test
    public void testUpdateGameInfo() {
        elasticCurd.updateGameInfo();
    }
    @Test
    public void testDeleteById() {
        elasticCurd.deleteById();
    }
    @Test
    public void testFindGameBeanByGameNameContaining() {
        elasticCurd.findGameBeanByGameNameContaining();
    }
    @Test
    public void testAnalyzer() {
        elasticCurd.analyzer();
    }
}
