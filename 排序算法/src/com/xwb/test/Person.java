package com.xwb.test;
/**
 * 一个类的访问权限：default、public 
 * default只能在本包中访问该类  比如实例化
 * @author Administrator
 *
 */
public class Person {
	
	public void getName() {
		System.out.println("Person getName方法");
	}
	public void getResult() {
		this.getName();
		Object o;
	}
	
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new SonOne();
		SonOne p3=new SonOne();
		p1.getName();//
		p2.getName();//
		p3.getName();//
		
		p1.getResult();//p
		p2.getResult();//SonOne getName方法
		
		p3.setName();//Person getName方法
		p3.setAge();//SonOne getName方法
	}
}
/*这个类只能default访问修饰符来修饰
 class testPerson{
	
}*/
 