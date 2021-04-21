package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		/*Hello h=new Hello();
		h.show();*/
       ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
      Hello h=(Hello) ctx.getBean("hello");
	   h.show();
	   System.out.println("*******************************************************");
	   
	   Resource r=new ClassPathResource("Beans.xml");
	   BeanFactory bf=new XmlBeanFactory(r);
	   Hello h1=(Hello) bf.getBean("hello");
	   h1.show();
	   
	
	
	}
}
