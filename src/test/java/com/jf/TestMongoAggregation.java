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
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 聚合 统计查询
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMongoAggregation {
    static  Logger logger = LoggerFactory.getLogger(TestMongoAggregation.class);
    @Resource
    private ICDayAgentgameService dayAgentgameService;
    @Resource
    MongoTemplate mongoTemplate;



    @Test
    public void testTypedAggregation(){
        AggregationOperation  andAg = Aggregation.match(Criteria.where("_id").gte(345455));
        // 多条件
        AggregationOperation  groupBy = Aggregation.group("appId");
        Aggregation aggregation = Aggregation.newAggregation(andAg,groupBy);
        AggregationResults<CDayAgentgame> rss = mongoTemplate.aggregate(aggregation, "day_agentgame",CDayAgentgame.class);
        logger.info(" ★★★★★★★★★★★★★★★★ testTypedAggregation = "+ new Gson().toJson(rss) );

    }

}
