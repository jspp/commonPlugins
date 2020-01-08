package com.jf.apps.mongo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CDayAgentgame entity.
 * @author 
 * @param 2020-1-8 11:02:48
 * @desc  
 */
@Document(collection = "day_agentgame" )
@Entity
@Table(name="c_day_agentgame")
@Data
public class CDayAgentgame implements Serializable {

   /**
     *  
     */
  	@Id
	@GeneratedValue
 	@Column(name = "id")
	private Integer id; 
	       
   /**
     * 日期
     */
 	@Column(name = "date")
	private String date; 
	       
   /**
     * 渠道ID
     */
 	@Column(name = "agent_id")
	private Integer agentId; 
	       
   /**
     * 渠道名称
     */
 	@Column(name = "agent_name")
	private String agentName; 
	       
   /**
     * 游戏ID
     */
 	@Column(name = "app_id")
	private Integer appId; 
	       
   /**
     * 游戏名称
     */
 	@Column(name = "app_name")
	private String appName; 
	       
   /**
     * 活跃玩家数量
     */
 	@Column(name = "user_cnt")
	private Integer userCnt; 
	       
   /**
     * 充值金额
     */
 	@Column(name = "sum_money")
	private Double sumMoney; 
	       
   /**
     * 分成金额
     */
 	@Column(name = "share_money")
	private Double shareMoney; 
	       
   /**
     * 当天分成比例
     */
 	@Column(name = "agent_rate")
	private Double agentRate; 
	       
   /**
     * 订单数
     */
 	@Column(name = "order_cnt")
	private Integer orderCnt; 
	       
   /**
     * 注册订单数
     */
 	@Column(name = "reg_order_cnt")
	private Integer regOrderCnt; 
	       
   /**
     * 充值玩家数
     */
 	@Column(name = "pay_user_cnt")
	private Integer payUserCnt; 
	       
   /**
     * 充值新玩家数
     */
 	@Column(name = "reg_pay_cnt")
	private Integer regPayCnt; 
	       
   /**
     * 新玩家充值金额
     */
 	@Column(name = "sum_reg_money")
	private Double sumRegMoney; 
	       
   /**
     * 注册玩家数
     */
 	@Column(name = "reg_cnt")
	private Integer regCnt; 
	       
   /**
     * 二日留存量
     */
 	@Column(name = "day2")
	private Integer day2; 
	       
   /**
     * 三日留存量
     */
 	@Column(name = "day3")
	private Integer day3; 
	       
   /**
     * 四日留存量
     */
 	@Column(name = "day4")
	private Integer day4; 
	       
   /**
     * 五日留存量
     */
 	@Column(name = "day5")
	private Integer day5; 
	       
   /**
     * 六日留存量
     */
 	@Column(name = "day6")
	private Integer day6; 
	       
   /**
     * 七日留存量
     */
 	@Column(name = "day7")
	private Integer day7; 
	       
   /**
     * 15日留存量
     */
 	@Column(name = "day15")
	private Integer day15; 
	       
   /**
     * 30日留存量
     */
 	@Column(name = "day30")
	private Integer day30; 
	       
   /**
     *  
     */
 	@Column(name = "total_money")
	private Double totalMoney; 
	       
   /**
     *  
     */
 	@Column(name = "total_num")
	private Integer totalNum; 
	       
   /**
     * 总支付用户数
     */
 	@Column(name = "total_pay_user_cnt")
	private Integer totalPayUserCnt; 
	       
   /**
     * 用户类型，1:admin ;2:会员;6:主渠道;7:子渠道
     */
 	@Column(name = "user_type")
	private Integer userType; 
	       
   /**
     * 一级渠道ID
     */
 	@Column(name = "one_agent_id")
	private Integer oneAgentId; 
	       
   /**
     * 一级渠道名称
     */
 	@Column(name = "one_agent_name")
	private String oneAgentName; 
	       

	 
}