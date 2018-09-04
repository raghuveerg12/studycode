package com.demoTest.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		/*Map<String, String> map=new HashMap<>();
		map.put("test", "one");
		map.put("test1", "one1");
		map.put("test2", "one2");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getValue()+"<----->"+entry.getKey());
			
		}
		
		map.forEach((s,v)->System.out.println(s+"<--->"+v));
		
		List<String> str=map.keySet().stream().filter(x->!"test2".equalsIgnoreCase(x)).collect(Collectors.toList());
		str.forEach(t->System.out.println("testing---"+t));
		str.stream().filter(e->!"test".equalsIgnoreCase(e)).forEach(s->System.out.println("iii>>>>"+s));*/
		
		Map<String, TestMapSaving> savingMap=new HashMap<String, TestMapSaving>();
		TestMapSaving ts1=new TestMapSaving();
		ts1.setEmpid("123");
		ts1.setName("test");
		TestMapSaving ts2=new TestMapSaving();
		ts2.setEmpid("123");
		ts2.setName("test");
		
		savingMap.put("test", ts1);
		savingMap.put("test2", ts2);
		
		savingMap.forEach((k,v)->System.out.println(v.getName()));
	}

}
