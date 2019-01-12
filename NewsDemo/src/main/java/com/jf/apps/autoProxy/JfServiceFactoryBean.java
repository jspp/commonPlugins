package com.jf.apps.autoProxy;

import org.springframework.beans.factory.FactoryBean;

/**
 * 自动创建 接口实现类 工厂bean
 * ouyangjie
 * 2019/1/12
 * 11:10
 */
public class JfServiceFactoryBean<T> implements FactoryBean<T> {

    private Class<T> interfaceClass;
    public Class<T> getInterfaceClass() {
        return interfaceClass;
    }
    public void setInterfaceClass(Class<T> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    @Override
    public T getObject() throws Exception {
        return (T)new JfServiceCreator().createProxyInstance(interfaceClass);
    }

    @Override
    public Class<?> getObjectType() {
        return interfaceClass;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
