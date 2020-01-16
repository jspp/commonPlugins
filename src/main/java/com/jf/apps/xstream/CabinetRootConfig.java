package com.jf.apps.xstream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * 灯xml配置相关对象
 */
@XStreamAlias("Root")
public class CabinetRootConfig

{
    @XStreamImplicit(itemFieldName = "Cabinet")
    public List<CabinetConfig> Cabinet;



    public List<CabinetConfig> getCabinet() {
        return Cabinet;
    }

    public void setCabinet(List<CabinetConfig> cabinet) {
        Cabinet = cabinet;
    }
}
