package com.MainClass;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ModelClass.Hello;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext(new String[] {"ConfigSpring.xml","msgConfig.xml"});
		
		//ApplicationContext context= new ClassPathXmlApplicationContext("msgConfig.xml");
		//ApplicationContext context= new ClassPathXmlApplicationContext("ConfigSpring.xml");
	
		/*Resource r= new ClassPathResource("ConfigSpring.xml");
		BeanFactory context= new XmlBeanFactory(r);*/
		System.out.println("Hi");
					Hello hello =(Hello)context.getBean("helloId");
						hello.getHello("hi");
						hello.getMessage();
					
		

	}

}
