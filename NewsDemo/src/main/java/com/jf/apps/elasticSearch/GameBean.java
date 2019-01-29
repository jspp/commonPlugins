package com.jf.apps.elasticSearch;

import lombok.Data;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * ouyangjie
 * 2019/1/23
 * 11:13
 */
@Document(indexName = "game_database", type = "games")
@Data
public class GameBean {

  @Id
  private Integer id;

  @Field
  private String gameName;

  @Field(type = FieldType.Date ,format = DateFormat.date_time_no_millis )
  private Date addTime;

  @Field
  private String gameDesc;

  @Field
  private Double gameSize;

  @Override
  public String toString() {
    return "GameBean{" +
            "id=" + id +
            ", gameName='" + gameName + '\'' +
            ", addTime=" + DateFormatUtils.format(addTime,"yyyy-MM-dd HH:mm:ss") +
            ", gameDesc='" + gameDesc + '\'' +
            ", gameSize=" + gameSize +
            '}';
  }
}
