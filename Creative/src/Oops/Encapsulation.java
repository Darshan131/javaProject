package Oops;

class St
{
	private int roll;
	private String Str; //Object Knows something with the help of Variable and  Object does something with method !!
	
	//getter && Setting
	
	
	public void setRollNo(int r) //to set the value you will use set()
	{
		roll = r;
	}
	
	public int getRollNo() //though we are fetching the value get() 
	{
		return roll;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getStr() {
		return Str;
	}

	public void setStr(String str) {
		Str = str;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		St obj = new St();
		obj.setRollNo(1);
		obj.setStr("DB"); //we are accessing the data of another class in main() that is not right so we can use Getter &&  Setter methods

		System.out.println(obj.getRollNo());
		System.out.println(obj.getStr());
		 
		//variable in Encapsualtion 
		
	}

}
