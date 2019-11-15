package com.karl.test.bean;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static junit.framework.TestCase.assertEquals;

/**
 * 描述:  Bean 工厂 测试类
 *
 * @author mh
 * @create 2019-11-15 17:58
 */
public class BeanFactoryTest {


	@Test
	public void testSingleLoad() {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("bean/beanTestFactory.xml"));
		MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
		assertEquals("hello bean", myTestBean.getStr());
	}

}