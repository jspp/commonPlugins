package com.jf.apps.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 序列号
 */

@XStreamAlias("sno")
public class SnoConfig {

    /**
     * 序列号
     */
    @XStreamAsAttribute
    public int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
}
