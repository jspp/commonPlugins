package com.jf.apps.autoProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;

/**
 * ouyangjie
 * 2019/1/12
 * 13:53
 */
public class JfServiceCreator {
    static final Logger logger = LoggerFactory.getLogger(JfServiceInvocationHandler.class);


    /**
     * 对应的接口
     */
    private Class<?> interfaceClass;
    /**
     * 创建
     * @param cls
     * @return
     */
    public Object createProxyInstance(Class<?> interfaces) {
        this.interfaceClass = interfaces;
        if(interfaces!=null){
            logger.info("----- [JfService]-----  createProxyInstance  for interface :{} ",interfaces.getName());
        }
        return Proxy.newProxyInstance(interfaces.getClassLoader(), new Class[] {interfaceClass}, new JfServiceInvocationHandler(new ParentImpl()));
    }

}
