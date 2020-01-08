package com.jf.apps.mongo;

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
	       
	 /**
     *  seters and getters
     */

	public Integer getId (){
		 return this.id;
	}
	
	public void setId (Integer id){
		 this.id=id;
	}

	public String getDate (){
		 return this.date;
	}
	
	public void setDate (String date){
		 this.date=date;
	}

	public Integer getAgentId (){
		 return this.agentId;
	}
	
	public void setAgentId (Integer agentId){
		 this.agentId=agentId;
	}

	public String getAgentName (){
		 return this.agentName;
	}
	
	public void setAgentName (String agentName){
		 this.agentName=agentName;
	}

	public Integer getAppId (){
		 return this.appId;
	}
	
	public void setAppId (Integer appId){
		 this.appId=appId;
	}

	public String getAppName (){
		 return this.appName;
	}
	
	public void setAppName (String appName){
		 this.appName=appName;
	}

	public Integer getUserCnt (){
		 return this.userCnt;
	}
	
	public void setUserCnt (Integer userCnt){
		 this.userCnt=userCnt;
	}

	public Double getSumMoney (){
		 return this.sumMoney;
	}
	
	public void setSumMoney (Double sumMoney){
		 this.sumMoney=sumMoney;
	}

	public Double getShareMoney (){
		 return this.shareMoney;
	}
	
	public void setShareMoney (Double shareMoney){
		 this.shareMoney=shareMoney;
	}

	public Double getAgentRate (){
		 return this.agentRate;
	}
	
	public void setAgentRate (Double agentRate){
		 this.agentRate=agentRate;
	}

	public Integer getOrderCnt (){
		 return this.orderCnt;
	}
	
	public void setOrderCnt (Integer orderCnt){
		 this.orderCnt=orderCnt;
	}

	public Integer getRegOrderCnt (){
		 return this.regOrderCnt;
	}
	
	public void setRegOrderCnt (Integer regOrderCnt){
		 this.regOrderCnt=regOrderCnt;
	}

	public Integer getPayUserCnt (){
		 return this.payUserCnt;
	}
	
	public void setPayUserCnt (Integer payUserCnt){
		 this.payUserCnt=payUserCnt;
	}

	public Integer getRegPayCnt (){
		 return this.regPayCnt;
	}
	
	public void setRegPayCnt (Integer regPayCnt){
		 this.regPayCnt=regPayCnt;
	}

	public Double getSumRegMoney (){
		 return this.sumRegMoney;
	}
	
	public void setSumRegMoney (Double sumRegMoney){
		 this.sumRegMoney=sumRegMoney;
	}

	public Integer getRegCnt (){
		 return this.regCnt;
	}
	
	public void setRegCnt (Integer regCnt){
		 this.regCnt=regCnt;
	}

	public Integer getDay2 (){
		 return this.day2;
	}
	
	public void setDay2 (Integer day2){
		 this.day2=day2;
	}

	public Integer getDay3 (){
		 return this.day3;
	}
	
	public void setDay3 (Integer day3){
		 this.day3=day3;
	}

	public Integer getDay4 (){
		 return this.day4;
	}
	
	public void setDay4 (Integer day4){
		 this.day4=day4;
	}

	public Integer getDay5 (){
		 return this.day5;
	}
	
	public void setDay5 (Integer day5){
		 this.day5=day5;
	}

	public Integer getDay6 (){
		 return this.day6;
	}
	
	public void setDay6 (Integer day6){
		 this.day6=day6;
	}

	public Integer getDay7 (){
		 return this.day7;
	}
	
	public void setDay7 (Integer day7){
		 this.day7=day7;
	}

	public Integer getDay15 (){
		 return this.day15;
	}
	
	public void setDay15 (Integer day15){
		 this.day15=day15;
	}

	public Integer getDay30 (){
		 return this.day30;
	}
	
	public void setDay30 (Integer day30){
		 this.day30=day30;
	}

	public Double getTotalMoney (){
		 return this.totalMoney;
	}
	
	public void setTotalMoney (Double totalMoney){
		 this.totalMoney=totalMoney;
	}

	public Integer getTotalNum (){
		 return this.totalNum;
	}
	
	public void setTotalNum (Integer totalNum){
		 this.totalNum=totalNum;
	}

	public Integer getTotalPayUserCnt (){
		 return this.totalPayUserCnt;
	}
	
	public void setTotalPayUserCnt (Integer totalPayUserCnt){
		 this.totalPayUserCnt=totalPayUserCnt;
	}

	public Integer getUserType (){
		 return this.userType;
	}
	
	public void setUserType (Integer userType){
		 this.userType=userType;
	}

	public Integer getOneAgentId (){
		 return this.oneAgentId;
	}
	
	public void setOneAgentId (Integer oneAgentId){
		 this.oneAgentId=oneAgentId;
	}

	public String getOneAgentName (){
		 return this.oneAgentName;
	}
	
	public void setOneAgentName (String oneAgentName){
		 this.oneAgentName=oneAgentName;
	}
	
	 
}