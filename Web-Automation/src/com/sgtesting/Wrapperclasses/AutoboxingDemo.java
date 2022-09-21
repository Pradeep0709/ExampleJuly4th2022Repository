package com.sgtesting.Wrapperclasses;

public class AutoboxingDemo {

	public static void main(String[] args) {
		int a=25;
		System.out.println("int a:"+a);
		//explicit coversion of primitive datatype
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		// Implicit
		Integer c=a;
		System.out.println("Integer c:"+a);
		
	}

}
