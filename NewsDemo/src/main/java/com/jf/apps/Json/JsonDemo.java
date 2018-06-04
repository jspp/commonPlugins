package com.jf.apps.Json;

import lombok.extern.java.Log;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Json 示例
 * 基于：
 * net.sf.json-lib
 */
@Log
public class JsonDemo {


    public static void main( String[] args ) {

        String params = "{\"code\":\"1\",\"msg\":\"获取成功\",\"data\":{\"dataList\":[{\"gameId\":80069,\"gameName\":\"战国志\",\"gameIcon\":\"http://imgcdn.3yx.com/other/sdkgameicon20180523110420047765.png\",\"downNum\":\"2.3\",\"packageSizeByte\":987152727,\"packageName\":\"com.netease.zgz.jfandriod\",\"gameScore\":9.0,\"gameImgPath\":\"http://imgcdn.3yx.com/other/sdkgameimg20180514180903213131.jpg\",\"smallTypeName\":\"MMOPRPG\",\"bigTypeId\":1,\"gameShotInfo\":\"开放式3D战争手游 即时MMO力作\",\"fineGameImgPath\":\"http://imgcdn.3yx.com/other/sdkfineimg20180514180903648356.jpg\",\"market_flag\":35,\"packageDownUrl\":\"https://imgcdn.juefeng.com/sdks/298/298_zgz_80069.apk\",\"packageSize\":\"941MB\",\"updateTime\":\"2018-05-23 11:04:21\",\"totalSpace\":0,\"totalInital\":5},{\"gameId\":80073,\"gameName\":\"天下第一剑客传\",\"gameIcon\":\"http://imgcdn.3yx.com/other/sdkgameicon20180525174515635200.png\",\"downNum\":\"0.3\",\"packageSizeByte\":609766903,\"packageName\":\"com.feiliu.sh.sw.jfandriod\",\"gameScore\":8.0,\"gameImgPath\":\"http://imgcdn.3yx.com/other/sdkgameimg20180525174516382747.jpg\",\"smallTypeName\":\"武侠\",\"bigTypeId\":6,\"gameShotInfo\":\"格斗游戏的要义，就是公平竞技。\",\"fineGameImgPath\":\"http://imgcdn.3yx.com/other/sdkfineimg20180525174516758542.jpg\",\"market_flag\":35,\"packageDownUrl\":\"https://imgcdn.juefeng.com/sdks/298/298_txdyjkc_80073.apk\",\"packageSize\":\"581MB\",\"updateTime\":\"2018-05-30 10:53:08\",\"totalSpace\":1,\"totalInital\":4},{\"gameId\":80067,\"gameName\":\"天庭恋爱记\",\"gameIcon\":\"http://imgcdn.3yx.com/other/sdkgameicon20180521173509456813.png\",\"downNum\":\"1.4\",\"packageSizeByte\":127128611,\"packageName\":\"com.ml.ttlaj.jfandroid\",\"gameScore\":8.0,\"gameImgPath\":\"http://imgcdn.3yx.com/other/sdkgameimg20180521173415644226.jpg\",\"smallTypeName\":\"养成\",\"bigTypeId\":3,\"gameShotInfo\":\"养成界的泥石流，玩法简单粗暴一看就懂\",\"fineGameImgPath\":\"http://imgcdn.3yx.com/other/sdkfineimg20180521173416332870.jpg\",\"market_flag\":35,\"packageDownUrl\":\"https://imgcdn.juefeng.com/sdks/298/298_ttlaj_80067.apk\",\"packageSize\":\"121MB\",\"updateTime\":\"2018-05-29 10:30:20\",\"totalSpace\":1,\"totalInital\":4},{\"gameId\":80062,\"gameName\":\"诛仙\",\"gameIcon\":\"http://imgcdn.3yx.com/other/sdkgameicon20180509172205681108.png\",\"downNum\":\"5.6\",\"packageSizeByte\":1283982941,\"packageName\":\"com.wanmei.zhuxian.jfandriod\",\"gameScore\":9.7,\"gameImgPath\":\"http://imgcdn.3yx.com/other/sdkgameimg20180511155853441673.jpg\",\"smallTypeName\":\"MMOPRPG\",\"bigTypeId\":1,\"gameShotInfo\":\"超人气唯美仙恋大作—新《诛仙手游》！\",\"fineGameImgPath\":\"http://imgcdn.3yx.com/other/sdkfineimg20180508172010182312.jpg\",\"market_flag\":35,\"packageDownUrl\":\"https://imgcdn.juefeng.com/sdks/298/298_zx_80062.apk\",\"packageSize\":\"1224MB\",\"updateTime\":\"2018-05-24 09:49:31\",\"totalSpace\":0,\"totalInital\":5},{\"gameId\":80077,\"gameName\":\"犬夜叉\",\"gameIcon\":\"http://imgcdn.3yx.com/other/sdkgameicon20180525111028866758.png\",\"downNum\":\"0.2\",\"packageSizeByte\":224269764,\"packageName\":\"com.heitao.qyckp.jfandriod\",\"gameImgPath\":\"http://imgcdn.3yx.com/other/sdkgameimg20180525111028604742.jpg\",\"smallTypeName\":\"回合\",\"bigTypeId\":1,\"gameShotInfo\":\"高度自由的MMO卡牌角色扮演游戏\",\"fineGameImgPath\":\"http://imgcdn.3yx.com/other/sdkfineimg20180525111029524286.jpg\",\"market_flag\":35,\"packageDownUrl\":\"https://imgcdn.juefeng.com/sdks/298/298_qyc_80077.apk\",\"packageSize\":\"213MB\",\"updateTime\":\"2018-05-30 18:48:31\",\"totalSpace\":5,\"totalInital\":0},{\"gameId\":80058,\"gameName\":\"问道\",\"gameIcon\":\"http://imgcdn.3yx.com/other/sdkgameicon20180509171152458811.png\",\"downNum\":\"5.5\",\"packageSizeByte\":593478901,\"packageName\":\"com.gbits.atm.qihoo.juhe.jfandriod\",\"gameScore\":9.0,\"gameImgPath\":\"http://imgcdn.3yx.com/other/sdkgameimg20180511160102718338.jpg\",\"smallTypeName\":\"回合\",\"bigTypeId\":1,\"gameShotInfo\":\"端游原班团队倾力打造经典《问道》手游\",\"fineGameImgPath\":\"http://imgcdn.3yx.com/other/sdkfineimg20180508163338412056.jpg\",\"market_flag\":35,\"packageDownUrl\":\"https://imgcdn.juefeng.com/sdks/298/298_wd_80058.apk\",\"packageSize\":\"565MB\",\"updateTime\":\"2018-05-15 17:03:31\",\"totalSpace\":0,\"totalInital\":5}]}}";

        /**
         * 简单数据类型
         */
        JSONObject jsonObject = JSONObject.fromObject(params);
        System.out.println(jsonObject.getString("code"));

        /**
         * 容器/集合
         */
        JSONObject data = jsonObject.getJSONObject("data");
        JSONArray array = data.getJSONArray("dataList");
        System.out.println(array.size());


        /**
         * Json 转Java对象
         */
        Object[]  oarr = data.getJSONArray("dataList").toArray();
        List<Object> jsonList =  Arrays.asList(oarr);
        jsonList.stream()
                .forEach((x)->{
                        JSONObject map = JSONObject.fromObject(x);
                        System.out.println(map.getString("gameName"));
                        //log.info(x.toString());  1
                       });
		System.out.println("git");

    }

}
