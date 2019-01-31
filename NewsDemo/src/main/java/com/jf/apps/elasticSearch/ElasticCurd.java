package com.jf.apps.elasticSearch;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
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
        gameBean.setGameName("11月30日下午，改革开放40周年之际，西安市对外开放暨民营经济发展大会隆重召开。陕西省委常委、西安市委书记王永康，西安市委常委、常务副市长吕健等市委及市政府主要领导、各界代表、专家学者及企业家等出席了本次盛会，绝峰网络创始人兼CEO刘振宇作为年度创业明星受邀参会。");
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
     * 分词查询
     *  ElasticsearchTemplate
     */
    public void  analyzer(){

        BoolQueryBuilder builder = QueryBuilders.boolQuery()
                .must(QueryBuilders.matchQuery("gameName", "西安创业"))
                .must(QueryBuilders.termsQuery("gameDesc","93761"))
                .must(QueryBuilders.idsQuery("id").addIds("95257"));

        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                                        .withIndices("game_database_ik08")
                                        .withTypes("games")
                                        .withQuery(builder).build();

        List<GameBean> games = elasticsearchTemplate.queryForList(searchQuery, GameBean.class);
        for (GameBean game : games) {
              System.err.println(game);
        }

    }


}
