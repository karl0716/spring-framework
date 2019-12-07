package com.karl.test.bean;

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

		//01 场景1 直接加载配置文件
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		MyTestBean bean = annotationConfigApplicationContext.getBean(MyTestBean.class);
		System.out.println("bean = " + bean);

		//02 场景2 将场景1的分开执行也能达到预期效果
		AnnotationConfigApplicationContext annotationConfigApplicationContext2 = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext2.register(Appconfig.class);
		//初始化spring的环境
		annotationConfigApplicationContext2.refresh();
		MyTestBean bean2 = annotationConfigApplicationContext2.getBean(MyTestBean.class);
		System.out.println("bean = " + bean2);

		//03




	}
}