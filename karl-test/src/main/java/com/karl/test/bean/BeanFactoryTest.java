package com.karl.test.bean;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
//		/**
//		 * 1 读取配置文件 beanFactoryTest.xml
//		 * 2 根据beanFactoryTest.xml中的配置找到对应的类配置，并实例化
//		 * 3 调用实例化后的实例
//		 */
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("bean/beanTestFactory.xml"));
//		MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
//		assertEquals("hello bean", myTestBean.getStr());

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		MyTestBean bean = annotationConfigApplicationContext.getBean(MyTestBean.class);
		assertEquals("hello bean", bean.getStr());

	}

}