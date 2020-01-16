package com.jf.apps.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("CabinetGrid")
public class CabinetGridConfig {
    /**
     * 柜格类型
     */
    @XStreamAsAttribute()
    public String gridType;
    /**
     * 柜格编号
     */
    @XStreamAsAttribute()
    public String gridId;
    /**
     * 描述
     */
    @XStreamAsAttribute()
    public String desc;
    /**
     * 灯
     */
    @XStreamAsAttribute()
    public lamp lamp;
    /**
     * rfid天线
     */
    @XStreamAsAttribute()
    public rfid rfid;
    /**
     * 开关列表
     */
    @XStreamAsAttribute()
    public switchList switchList;


    public String getGridType() {
        return gridType;
    }

    public void setGridType(String gridType) {
        this.gridType = gridType;
    }

    public String getGridId() {
        return gridId;
    }

    public void setGridId(String gridId) {
        this.gridId = gridId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public com.jf.apps.xstream.lamp getLamp() {
        return lamp;
    }

    public void setLamp(com.jf.apps.xstream.lamp lamp) {
        this.lamp = lamp;
    }

    public com.jf.apps.xstream.rfid getRfid() {
        return rfid;
    }

    public void setRfid(com.jf.apps.xstream.rfid rfid) {
        this.rfid = rfid;
    }

    public com.jf.apps.xstream.switchList getSwitchList() {
        return switchList;
    }

    public void setSwitchList(com.jf.apps.xstream.switchList switchList) {
        this.switchList = switchList;
    }
}


