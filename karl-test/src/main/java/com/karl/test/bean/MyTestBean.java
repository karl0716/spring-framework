package com.karl.test.bean;

import org.springframework.stereotype.Component;

/**
 * 描述:  MyTestBean
 *
 * @author mh
 * @create 2019-11-15 17:54
 */
@Component
public class MyTestBean {


	private String str = "hello bean";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}