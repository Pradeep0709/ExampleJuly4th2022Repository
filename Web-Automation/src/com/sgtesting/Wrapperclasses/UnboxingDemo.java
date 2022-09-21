package com.sgtesting.Wrapperclasses;

public class UnboxingDemo {

	public static void main(String[] args) {
		Integer a=Integer.valueOf(125);
		System.out.println("Integer a:"+a);
		//explicit
		int b=a.intValue();
		System.out.println("int b:"+b);
		// implicit
		int c=a;
		System.out.println("int c:"+c);
	}

}