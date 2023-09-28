package inheritance;

public class MethodsDemo2 {

	int x=100;
	String str3="Java";
	
	// method which returns value
	public int sum() {
		int a=10;
		int b=20;
		int result=a+b+x;
		return result;
	}
	
	public String concatmethod() {
		String str1="Selenium";
		String str2="training";
		String result=str1+str2+str3;
		return result;
	}
	
	public void printmethod() {
		System.out.println("The global integer variable"+x);
		System.out.println("The global String variable"+str3);
	}
	public static void main(String[] args) {
	
		MethodsDemo2 methodsDemo =new MethodsDemo2();
		System.out.println(methodsDemo.concatmethod());
		int value=methodsDemo.sum();
		System.out.println(value);
		methodsDemo.printmethod();

	}

}
