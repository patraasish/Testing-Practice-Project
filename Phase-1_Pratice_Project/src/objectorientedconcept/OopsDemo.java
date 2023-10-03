package objectorientedconcept;

//Demonstrate the Classes, Objects, and Constructors
class Demo{
	String str="i am in demo class";
	
	//non parameterized constructor
	Demo(){
		System.out.println("Constructor");
	}
	
	//parameterized Constructor
	Demo(String str){
		System.out.println(str);
	}
}
public class OopsDemo {

	public static void main(String[] args) {
		
		//Constructor was automatically call when object created
		Demo demo=new Demo();
		System.out.println(demo.str);
		Demo demo2=new Demo("I am parameterized Constructor");

	}

}
