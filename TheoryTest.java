1 .Constructor and its types

	in general constructor is object but in java constructor is a block of code or set instruction which crete some specific task or operation,its callled in instance of the class
constructor is used create a object.	
	* while creating a obj ataleat one constructor is called
	
	in constructor super()and this ()keyword is used
	
	types of constrctor
	
	there are two types of constructor
	
	* default constructor
	* parameterized constrctor
	
	default constructor 
	
	default constructor is a constructor which doesnt have any parameter its empty is called defalut constructor
	 in class always one defalut constructor is present if we write or not it always present thats called defalut constructor
	 
	 parameterized constructor
	 
	 parameterized constructor is a constructor which have some specific number of parameter is called parametrized constructor
	 

2. feature of java 

    * multitread
    * robust
    * platform indepedend
    * easy to learn
    * standalone 
    * readbility

. platform independent

mean write once run anywhere 

. standalone 

its mandatory to install some application in machine like media player,calender etc

. robust 
java is a robust langauge whcich is strong langauage

. readability
java code can be readbility ,reausabilty we can modifiy the code by adding or deleting of chunks of code

3. diffrences between c++ and java

 c++ is programing langauage
 c++ is developed before the java developed
 c++  langauage  is mainly used for game developemnet
 
 
 java is a object oriented programing langauge
 java developed by james goslin in the year 1995 at oracle now its owned by  sun microsoft first programing name is oak later its rename as java because oak name is already registerd
 java langauage is used for many (purpose )applicaton like game development,web development,desktop development,enterprises ,android application

4. diffrence between jdk jre jvm 

jdk
java development kit 

were jdk have jvm and jre

JRE
java run time envirnment were it have some libraries tools

jvm

java 

6. methods

in general method is a object  which have some block of codes to perform some specific task or operation
java have the main method 

7. method overlaoding 

method overloading is a one method having many parameter is called method overloading

public class MethodOverloading{
	public static void main(String [] args){
		cell();
	}
		
		public static cell (int num ){
			System.out.println("method over loading ");
			
		
	}
	public static cell (float no,char letter){
		System.out.println("single name ")
	}
	public static cell (byte num,short number,String name){
		System.out.println("three parameters")
	}
	
}
8. diffrence between constructr and method 

   constructor and method are some quaalities are same 
   
   in constructor we use some keyword super(),this()
   
   in method we dont use any keyword
   
 9.static variable,static methods,static block

   static variable is if we declare variable as static is called static variable

   static method by using static we create a method without static its imposible to create aa methood until jdk 1.6 we can create method by non static but  from jdk 1.7 we cant create    
   
   a method why beacause by the static method no need create obj but in non static the jvm will create obj then it will look for main method this cause problem extra memory allocation
   
   static block if we create any block a static block is called static block

   
 10 . costructor overloading use more than one costructor in a inastance class is called contstructor overaloading
 
      constructor overloading is havinga a more than one constructor with diffrent  parameter is callred  constructor overloading


public class ConstructorOverloading{
	
	public static void main(String []args){
		String nameOfTheCompany;
		int noOfEmployess;
		int employeesId;
		char firstLetterOfTheCompanyName;
		
		
	}
	public static  ConstructorOverloading(){
		System.out.println("default constructor")
	}
	
	public ConstructorOverloading(String nameOfTheCompany,int noOfEmployess,int employeesId,char firstLetterOfTheCompanyName){
		this .nameOfTheCompany = nameOfTheCompany;
		this .noOfEmployess = noOfEmployess;
		this.employeesId = employeesId;
		this .firstLetterOfTheCompanyName = firstLetterOfTheCompanyName;
		System.out.println(this.nameOfTheCompany);
		System.out.println(this .noOfEmployess);
		System.out.println(this.employeesId);
		System.out.println(this .firstLetterOfTheCompanyName);
			
	}
} 










































































	
	