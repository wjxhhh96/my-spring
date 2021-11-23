package com.wjx.springframework;

/**
 * <p>
 * <b>BeanDefinition</b>
 * </p>
 *
 * @author Wjx
 * @Description: TODO
 * @since 2021/11/23
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){this.bean = bean;}

    public Object getBean(){return bean;}
}
