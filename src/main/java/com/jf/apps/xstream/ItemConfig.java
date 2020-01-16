package com.jf.apps.xstream;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


public class ItemConfig {

    @XStreamAsAttribute()
    public String ip;

    /**
     * 端口号
     */
    @XStreamAsAttribute()
    public int port;

    /**
     * 描述
     */
    @XStreamAsAttribute()
    public String desc ;

    /**
     * 序列号
     */
    @XStreamImplicit(itemFieldName = "sno")
    public List<SnoConfig> sno;


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<SnoConfig> getSno() {
        return sno;
    }

    public void setSno(List<SnoConfig> sno) {
        this.sno = sno;
    }
}
