package javaprograms;

public class StringReverse {

	public static void main(String[] args) {
		
		String s1="Hello";
		System.out.println("Original String : "+s1);
		
		System.out.print("Reverse String : ");
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}

	}

}
