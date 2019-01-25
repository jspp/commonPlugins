package com.jf.apps.elasticSearch;

import com.jf.common.util.DateUtil;
import com.jf.common.util.RandomUtil;
import net.sf.json.JSONArray;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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


    public void save(){
        GameBean gameBean = new GameBean();
        gameBean.setId(RandomUtils.nextInt(1000));
        gameBean.setGameName(RandomUtil.getRandomChinese(3));
        gameBean.setAddTime(DateUtil.getCurrentDateTime());
        gameDataRepository.save(gameBean);

        List<GameBean> rs = gameDataRepository.findByIdGreaterThan(0);
        Optional.ofNullable(rs).ifPresent(rss->{
            System.out.println(JSONArray.fromObject(rss));
        });



    }




}
