package com.jf.apps.elasticSearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * ouyangjie
 * 2019/1/24
 * 18:37
 */
public interface GameDataRepository extends ElasticsearchRepository<GameBean,Integer> {

    GameBean queryGameBeanById(Integer id);

    List<GameBean> findByIdGreaterThan(Integer id);

    void deleteById(Integer id);

    GameBean findGameBeanByGameNameContaining(String nameStr);





}
