package com.jf.apps.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;


@XStreamAlias("CabinetConfig")
public class CabinetConfig
{
    /**
     * 柜子编号
     */
    @XStreamAsAttribute()
    public String code;
    /**
     * 柜子描述
     */
    @XStreamAsAttribute()
    public String desc;

    @XStreamImplicit(itemFieldName = "CabinetGrid")
    public List<CabinetGridConfig> CabinetGrid;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<CabinetGridConfig> getCabinetGrid() {
        return CabinetGrid;
    }

    public void setCabinetGrid(List<CabinetGridConfig> cabinetGrid) {
        CabinetGrid = cabinetGrid;
    }
}
