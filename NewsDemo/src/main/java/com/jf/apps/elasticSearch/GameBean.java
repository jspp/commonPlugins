package com.jf.apps.elasticSearch;

import lombok.Data;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.elasticsearch.index.analysis.IndexAnalyzers;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.util.Date;

/**
 * ouyangjie
 * 2019/1/23
 * 11:13
 */
@Document(indexName = "game_database_ik08", type = "games")
@Data
public class GameBean {

  @Id
  private Integer id;

  @Field(type = FieldType.Text, analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
  private String gameName;

  @Field(type = FieldType.Date ,format = DateFormat.date_time_no_millis )
  private Date addTime;

  @Field(type = FieldType.Text, analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
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
