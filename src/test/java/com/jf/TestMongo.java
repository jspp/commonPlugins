package com.jf;

import com.google.gson.Gson;
import com.jf.apps.Application;
import com.jf.apps.mongo.CDayAgentgame;
import com.jf.apps.mongo.ICDayAgentgameService;
import com.jf.common.dbPro.QueryPro;
import com.mongodb.client.result.UpdateResult;
import org.apache.commons.lang.math.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
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
        logger.info(" ★★★★★★★★★★★★★★★★ testAdd 查询数据大小 ------------  data size "+data.size());
        data.forEach(agentgame->{
            mongoTemplate.save(agentgame);
        });
    }

    @Test
    public void testSimpleQuery(){
        Query query = new Query();
        Criteria criteria = Criteria.where("appId").is(80002);
        criteria.and("_id").gte(341868);
        query.addCriteria(criteria);
        query.limit(10);
        List<CDayAgentgame> cDayAgentgames = mongoTemplate.find(query, CDayAgentgame.class);
        logger.info(" ★★★★★★★★★★★★★★★★ testSimpleQuery 查询数据大小 ------------  cDayAgentgames size "+cDayAgentgames.size());
        cDayAgentgames.forEach(agentgame->{
            System.out.println(new Gson().toJson(agentgame));
        });
    }

    @Test
    public void testUpdate(){
        Query query = new Query(Criteria.where("_id").is(341868));
        Update update = new Update();
        update.set("shareMoney", RandomUtils.nextInt(10000));
        UpdateResult updateResult = mongoTemplate.updateFirst(query, update, CDayAgentgame.class);
        logger.info(" ★★★★★★★★★★★★★★★★ testUpdate   "+ updateResult.getModifiedCount());
        List<CDayAgentgame> cDayAgentgames = mongoTemplate.find(query, CDayAgentgame.class);
        logger.info(" ★★★★★★★★★★★★★★★★ testUpdate query  "+ cDayAgentgames);
    }

    @Test
    public void testDel(){
        Query query = new Query(Criteria.where("_id").is(344911));
        System.out.println(mongoTemplate.remove(query, CDayAgentgame.class).getDeletedCount());
        List<CDayAgentgame> cDayAgentgames = mongoTemplate.find(query, CDayAgentgame.class);
        logger.info(" ★★★★★★★★★★★★★★★★ testDel query  "+ cDayAgentgames);
    }


}
