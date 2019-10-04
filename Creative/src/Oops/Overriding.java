package Oops;

public class Overriding {

	public static void main(String[] args) {
		OnlineShopping obj = new Nykka(); //OnlineShopping is the parent class and Nykka is Sub-class 
										//Here OnlineShopping is Reference 
		obj.purchase(); //it will call first whatever statement are their in Nykka then
		
		obj = new BigBasket();
		
		obj.purchase();// then it will call BigBasket && which method will called is decided at RunTime i'e it is called RunTime Plolymorphism 
						// every Time we are changing the method i;e why it is called Dynamic Method Dispatch

	}

}

class OnlineShopping
{
	void purchase()
	{
		System.out.println("shopping for clothes,groceries,cosmetics");
	}
}

class Myntra extends OnlineShopping
{
	void purchase()
	{
		System.out.println("shopping for clothes and cosmetics");
	}
}

class BigBasket extends OnlineShopping

{
	void purchase()
	{
		System.out.println("shopping for groceries");
	}
}
class Nykka extends OnlineShopping
{
	
	void purchase()
	{
		//super.purchase();
		System.out.println("shopping for cosmetics");
	}
}
