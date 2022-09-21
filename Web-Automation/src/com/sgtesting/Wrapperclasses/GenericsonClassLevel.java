package com.sgtesting.Wrapperclasses;
class Myclass<T>
{
	private T obj=null;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class GenericsonClassLevel {

	public static void main(String[] args) {
		Myclass<String> obj1=new Myclass<String>();
		obj1.setObj("Mango");
		String v1=obj1.getObj();
		System.out.println(v1);
		obj1.setObj("Pradeep");
		String v2=obj1.getObj();
		System.out.println(v2);
	}
	
	

}
