package com.jf.apps.elasticSearch;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

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

  @Field
  private String addTime;

  @Field
  private String gameDesc;

  @Field
  private Double gameSize;


}
