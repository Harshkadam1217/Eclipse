package com.polymorphism.two;
public class Child extends Parent {
	public void  Child(String vechilename,String vechilecolour) {
		System.out.println("Vechicle name "+vechilename);
		System.out.println("Vechiule colour "+vechilecolour);
	}

	public static void main(String[] args) {
//		Child child = new Child();
//		child.Child();
//		child.Parent();
		new Child().Child("Swift","Black");
		System.out.println(" ");
		new Parent().Child("Swift","white");
	}
}
