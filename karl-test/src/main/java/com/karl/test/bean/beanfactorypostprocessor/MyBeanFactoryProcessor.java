package com.karl.test.bean.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 描述:  BeanFactoryProcessor test
 *
 * @author mh
 * @create 2019-12-09 21:24
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition) beanFactory.getBeanDefinition("myTestBean");
		System.out.println(" 执行了 postProcessBeanFactory");
		// 干预spring bean factory 由于默认生成的bean都是单例的
		// 我们可以通过实现BeanFactoryPostProcessor 接口来强行修改bean 的属性
		annotatedBeanDefinition.setScope("prototype");
	}
}