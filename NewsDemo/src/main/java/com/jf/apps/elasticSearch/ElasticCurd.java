package com.jf.apps.elasticSearch;

import com.jf.common.util.DateUtil;
import com.jf.common.util.RandomUtil;
import net.sf.json.JSONArray;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.math.RandomUtils;
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


    public void save(){
        GameBean gameBean = new GameBean();
        gameBean.setId(RandomUtils.nextInt(100000));
        gameBean.setGameName(RandomUtil.getRandomChinese(3));
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
        System.out.println(gameDataRepository.findGameBeanByGameNameContaining("乱"));
    }


}
