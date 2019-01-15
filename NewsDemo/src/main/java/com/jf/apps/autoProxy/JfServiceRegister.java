package com.jf.apps.autoProxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * 注册自动生成的代理类
 * ouyangjie
 * 2019/1/12
 * 13:11
 */
@Component
public class JfServiceRegister  implements ApplicationContextAware, BeanDefinitionRegistryPostProcessor , EnvironmentAware, ResourceLoaderAware {

    private ApplicationContext ctx;

    private String scanPath="com.jf.apps";

    private Environment environment;

    private ResourceLoader resourceLoader;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        // 需要被代理的接口
        ClassPathScanningCandidateComponentProvider scanner = getScanner();
        // 扫码规则
        scanner.addIncludeFilter(new AnnotationTypeFilter(JfServicer.class,true,true));
        // 获取扫码结果
        Set<BeanDefinition> targets = scanner.findCandidateComponents(scanPath);
        System.out.println(" 扫码发现目标个数 ："+targets.size());
        // 注入
        if(targets!=null){
            for (BeanDefinition target:targets){

                BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(target.getBeanClassName());
                GenericBeanDefinition definition = (GenericBeanDefinition) builder.getRawBeanDefinition();
                definition.getPropertyValues().add("interfaceClass", target.getBeanClassName());
                definition.setBeanClass(JfServiceFactoryBean.class);
                definition.setAutowireMode(GenericBeanDefinition.AUTOWIRE_BY_TYPE);
                beanDefinitionRegistry.registerBeanDefinition(target.getBeanClassName(), definition);
            }
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }


    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    /**
     * 自定义扫描
     * @return
     */
    protected ClassPathScanningCandidateComponentProvider getScanner() {
        return new ClassPathScanningCandidateComponentProvider(false, this.environment) {
            @Override
            protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
                boolean isCandidate = false;
                if (beanDefinition.getMetadata().isIndependent()) {
                    if (!beanDefinition.getMetadata().isAnnotation()) {
                        isCandidate = true;
                    }
                }
                return isCandidate;
            }
        };
    }
}
