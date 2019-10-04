package Oops;

public class SuperStatement {

	public static void main(String[] args) {
		
		DerivedDemo obj = new DerivedDemo();
			

	}

}
 
 class SuperDemo
 {
	 public SuperDemo()
	 {
		 System.out.println("In superDemo"); //Generally we use super() to represent Parent class Object
	 }
	 public SuperDemo(int i)
	 {
		 System.out.println("In cosntructor2");
	 }
 }
 
 class DerivedDemo extends SuperDemo
 {
	 public DerivedDemo()
	 {
		 super(5);
		 System.out.println("In DerivedDemo");
	 }
	 
	 public DerivedDemo(int i)
	 {
		 super();
		 System.out.println("IN DerivedDemo2");
	 }
 }