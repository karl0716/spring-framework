package com.karl.test.bean.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * 描述:  BeanPostProcessor test
 * 测试场景: 测试BeanPostProcessor 如何干涉Spring BeanFactory 创建Bean
 *
 * @author mh
 * @create 2019-12-07 21:48
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equalsIgnoreCase("MyTestBean")) {
//			System.out.println("自定义的 postProcessBeforeInitialization 执行了");
		}
		/**
		 * 接下来可以对bean 做处理
		 * spring 代理 就是通过这个方式进行实现的
		 * Proxy.getInvocationHandler()
		 * 对应的Spring容器实现类为  AbstractAutoProxyCreator 实现了spring 代码
		 *
		 */
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equalsIgnoreCase("MyTestBean")) {
//			System.out.println("自定义的 postProcessAfterInitialization 执行了");
		}
		return bean;
	}

}