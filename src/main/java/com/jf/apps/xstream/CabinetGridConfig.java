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
    @XStreamAlias("lamp")
    public ItemConfig lamp;
    /**
     * rfid天线
     */
    @XStreamAlias("rfid")
    public ItemConfig rfid;
    /**
     * 开关列表
     */
    @XStreamAlias("switchList")
    public ItemConfig switchList;

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

    public ItemConfig getLamp() {
        return lamp;
    }

    public void setLamp(ItemConfig lamp) {
        this.lamp = lamp;
    }

    public ItemConfig getRfid() {
        return rfid;
    }

    public void setRfid(ItemConfig rfid) {
        this.rfid = rfid;
    }

    public ItemConfig getSwitchList() {
        return switchList;
    }

    public void setSwitchList(ItemConfig switchList) {
        this.switchList = switchList;
    }
}


