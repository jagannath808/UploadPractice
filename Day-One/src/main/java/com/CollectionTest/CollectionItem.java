package com.CollectionTest;

import java.util.*;

public class CollectionItem {
	
	public CollectionItem() {
		System.out.println("Constructor .....");
	}
	
	List listName;
	Set setNumber;
	Map keyValue;
	
	public void setListName(List listName) {
		this.listName = listName;
	}
	public void setSetNumber(Set setNumber) {
		this.setNumber = setNumber;
	}
	public void setKeyValue(Map keyValue) {
		this.keyValue = keyValue;
	}
	
	public void printItem() {
		
		System.out.println("List of Name print");
		for(Object obj:listName) {
			System.out.println(obj);
		}
		System.out.println("List of Number print");
		for(Object obj:setNumber) {
			System.out.println(obj);
		}
		System.out.println("Key value pair print");
		Set<Map.Entry<Object, Object>> obj= keyValue.entrySet();
		for(Map.Entry<Object,Object> entry:obj) {
			System.out.println(entry.getKey() +" ..."+entry.getValue());
		}
		
	}
	

}
