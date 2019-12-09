package com.karl.test.bean;

import com.karl.test.bean.beanfactorypostprocessor.MyBeanFactoryProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述:  Bean 工厂 测试类
 *
 * @author mh
 * @create 2019-11-15 17:58
 */
public class BeanFactoryTest {

	public static void main(String[] args) {
		// 需要注意的点: 我们要想了解spring bean 加载的过程
		// 首先我们要对 BeanDefinition 进行了解

//		//01 场景1 直接加载配置文件
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
//		MyTestBean bean = annotationConfigApplicationContext.getBean(MyTestBean.class);
//		System.out.println("bean = " + bean);

		//02 场景2 将场景1的分开执行也能达到预期效果
		AnnotationConfigApplicationContext annotationConfigApplicationContext2 = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext2.register(Appconfig.class);
		annotationConfigApplicationContext2.refresh();
		MyTestBean bean2 = annotationConfigApplicationContext2.getBean(MyTestBean.class);


//		/**
//		 * 场景03
//		 * 干预bean factory bean的属性
//		 * 预期结果: hashcode  不同
//		 * @see MyBeanFactoryProcessor
//		 *
//		 */
//		AnnotationConfigApplicationContext annotationConfigApplicationContext3 = new AnnotationConfigApplicationContext();
//		annotationConfigApplicationContext3.register(Appconfig.class);
//		annotationConfigApplicationContext3.refresh();
//		MyTestBean bean3 = annotationConfigApplicationContext3.getBean(MyTestBean.class);
//		System.out.println("bean3 hashcode :" + bean3.hashCode());
//		MyTestBean bean4 = annotationConfigApplicationContext3.getBean(MyTestBean.class);
//		System.out.println("bean3 hashcode :" + bean4.hashCode());


	}
}