package accessmodifiers;

//Write a program in Java to verify the working of access modifiers
class AccessModifierVariable{
	
	//public variable ,we can access anywhere in class, package,sub package,outside package 
	public String str1="I am public access Variable";
	
	//private variable, we can access only in same class and outside class we can access through getter method
	private String str2="I am private access variable";

	//protected variable ,we can access in same package and in extended class outside package 
	protected String str3="I am protected access variable";
	
	//Default variable , we can access same package and base package also
	String str4="I am default access variable";
	
	public String getStr2() {
		return str2;
	}
}

public class AccessModifiersDemo {

	
	
	public static void main(String[] args) {
		
		AccessModifierVariable obj=new AccessModifierVariable();
		System.out.println(obj.str1);
		
		//private member we cannot access in out side class
		System.out.println(obj.getStr2());
		System.out.println(obj.str3);
		System.out.println(obj.str4);
		
	}

}
