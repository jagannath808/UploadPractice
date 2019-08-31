package com.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.CollectionTest.CollectionItem;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ColConfig.xml");
			CollectionItem col= (CollectionItem)context.getBean("listId");
				col.printItem();

	}

}
