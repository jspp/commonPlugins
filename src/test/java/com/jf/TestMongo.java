package com.jf;

import com.jf.apps.Application;
import com.jf.apps.mongo.CDayAgentgame;
import com.jf.apps.mongo.ICDayAgentgameService;
import com.jf.common.dbPro.QueryPro;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMongo {
    static  Logger logger = LoggerFactory.getLogger(TestMongo.class);
    @Resource
    private ICDayAgentgameService dayAgentgameService;
    @Resource
    MongoTemplate mongoTemplate;


    @Test
    public void testAdd() {
        QueryPro queryPro = new QueryPro();
        queryPro.where("sum_money").more(100);
        queryPro.limit(100);
        List<CDayAgentgame> data = dayAgentgameService.findList(queryPro);
        logger.info(" 查询数据大小 ------------  data size "+data.size());
        data.forEach(agentgame->{
            mongoTemplate.save(agentgame);
        });
    }



}
