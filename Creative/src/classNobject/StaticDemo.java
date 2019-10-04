package classNobject;

public class StaticDemo {

	public static void main(String[] args) {
	
		Student Darshan = new Student();
		Student Joy = new Student();
		
		Darshan.sId = 131;
		Darshan.rollNo = 07;
		Student.school = "KEMS";
		
		Joy.sId = 178;
		Joy.rollNo = 10;
		Student.school = "KEMS";
		
		Student.school = "KV";
		
		Darshan.show();
		Joy.show();
		
		
					//though for Variable school it is STATIC so we don't need any Reference variable, we can use class Name
	}

}

class Student
{
	short sId;
	short rollNo;
	static String school; //if you don't want for certain variable to be OBJECT specific then we can go for STATIC
						  // Because it won't be anymore for particular Object 
	public void show()
	{
		System.out.println(sId + ":" + rollNo+ ":" + school);
	}
	
	static
	{
		school = "DAV";
		System.out.println("in static"); //when a class is loaded it is called Only Once.
	}									// static will executed before Constructor because Class load first
										//If you have multiple STATIC blocks then it will follow sequence
	public Student()					// static variables those which are same for all variables 
										// and non static variable are those which are different for all variable.
	{									// non static variable can be access within the created methods 
		sId = 1;
		rollNo = 10;
		//school = "DAV";
		System.out.println("in constructor"); //Constructor is called as many times as Object is created. 
	}
}
