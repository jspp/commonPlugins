package com.jf.apps.transaction;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CWebMedia entity.
 * @author 
 * @param 2021-8-5 13:22:21
 * @desc  
 */
@Entity
@Table(name="c_web_media")
public class CWebMedia implements Serializable {

   /**
     * 媒体ID
     */
  	@Id
	@GeneratedValue
 	@Column(name = "id")
	private Integer id; 
	       
   /**
     * 媒体名称
     */
 	@Column(name = "name")
	private String name; 
	       
   /**
     * 媒体路径
     */
 	@Column(name = "url")
	private String url; 
	       
   /**
     * 媒体图标
     */
 	@Column(name = "icon")
	private String icon; 
	       
   /**
     * 创建时间
     */
 	@Column(name = "create_time")
	private Integer createTime; 
	       
	 /**
     *  seters and getters
     */

	public Integer getId (){
		 return this.id;
	}
	
	public void setId (Integer id){
		 this.id=id;
	}

	public String getName (){
		 return this.name;
	}
	
	public void setName (String name){
		 this.name=name;
	}

	public String getUrl (){
		 return this.url;
	}
	
	public void setUrl (String url){
		 this.url=url;
	}

	public String getIcon (){
		 return this.icon;
	}
	
	public void setIcon (String icon){
		 this.icon=icon;
	}

	public Integer getCreateTime (){
		 return this.createTime;
	}
	
	public void setCreateTime (Integer createTime){
		 this.createTime=createTime;
	}
	
	 
}