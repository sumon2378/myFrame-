package com.util;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;

	public class maping {
	public static void main(String[] args) {
		String s ="I Live java Java Language";
		String[] word =s.split("\\s");
		Map<String ,Integer> m=new HashMap<>();
		for (String ss: word) {
			String a= ss.toUpperCase();
			if(m.containsKey(a)){
			int cout=m.get(a);
			m.put(a, cout+1);	
		}
		else m.put(a, 1);
		
		for(Entry<String,Integer>entry:m.entrySet()){	
		System.out.println(entry.getValue()+" "+entry.getKey());
		}
			

	}
		}
	}


