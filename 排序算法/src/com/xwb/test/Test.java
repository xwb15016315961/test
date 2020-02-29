package com.xwb.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		
		m.put("name", "zhangsan");
		m.put("name","lisi");
		System.out.println(m);
		
		Set<String> s = new HashSet<>();
		s.add("lisi");
		s.add("lisi");
		System.out.println(s);
	}
}
