package com.karl.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:  测试类
 *
 * @author mh
 * @create 2019-11-15 16:11
 */
public class Mytest01 {
	public static void main(String[] args) {

	}


	@Test
	public void test01(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person= (Person) context.getBean("person");
		Assert.assertEquals("luozhou",person.getName());
	}

}