package com.wjx.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * <b>BeanFactory</b>
 * </p>
 *
 * @author Wjx
 * @Description: TODO
 * @since 2021/11/23
 */
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }

    public Object getBean(String name){
        return  beanDefinitionMap.get(name).getBean();
    }
}
