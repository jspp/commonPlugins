package com.jf.apps.elasticSearch;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * ouyangjie
 * 2019/1/24
 * 18:39
 */
@Service
public class ElasticCurd {

    @Resource
    private GameDataRepository gameDataRepository;
    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;




    public void save(){
        GameBean gameBean = new GameBean();
        gameBean.setId(RandomUtils.nextInt(100000));
        gameBean.setGameName("我爱玩天龙八部，这个游戏牛逼很好玩的");
        gameBean.setAddTime(new Date());
        gameBean.setGameSize(RandomUtils.nextDouble());
        gameBean.setGameDesc(RandomStringUtils.randomNumeric(5));
        gameDataRepository.save(gameBean);
    }
    public void ShowAll(){
        Iterable<GameBean> rs = gameDataRepository.findAll();
        Optional.ofNullable(rs).ifPresent(rss->{
            rss.forEach(gameBean1 -> {
                System.out.println(gameBean1);
            });
        });
    }
    public void  findByGameId(){
        System.out.println(gameDataRepository.queryGameBeanById(794));
    }
    /**
     * 修改
     */
    public void  updateGameInfo(){
        GameBean gameBean = gameDataRepository.queryGameBeanById(794);
        gameBean.setGameDesc(RandomStringUtils.randomNumeric(5));
        gameBean.setAddTime(new Date());
        gameDataRepository.save(gameBean);
    }
    /**
     * 删除
     */
    public void  deleteById(){
        gameDataRepository.deleteById(145);
    }
    /**
     * 模糊查询
     */
    public void  findGameBeanByGameNameContaining(){
        System.out.println(gameDataRepository.findGameBeanByGameNameContaining("游戏"));
    }

    /**
     * 模糊查询
     */
    public void  findGameBeanByGameNameContaining02(){
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        //builder下有must、should以及mustNot 相当于sql中的and、or以及not
        //设置模糊搜索,博客的简诉中有学习两个字
        builder.must(QueryBuilders.fuzzyQuery("sumary", "游戏"));

        SearchQuery searchQuery = new NativeSearchQueryBuilder().withIndices("game_database_ik06")
                .withTypes("games").withQuery(builder).build();

        List<GameBean> sellingCarInfos = elasticsearchTemplate.queryForList(searchQuery, GameBean.class);
        for (GameBean symentry : sellingCarInfos) {
              System.err.println(symentry);
        }

    }


}
