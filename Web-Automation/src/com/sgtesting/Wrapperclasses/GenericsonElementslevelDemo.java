package com.sgtesting.Wrapperclasses;

class GenericElements{
	public static<E> void readElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}

public class GenericsonElementslevelDemo {

	public static void main(String[] args) {
		Integer []p= {1,2,3,4,5,6,7};
		GenericElements.readElements(p);
		System.out.println("--------------");
		String[] colors= {"red","yellow","blue"};
		GenericElements.readElements(colors);

	}
	

}
