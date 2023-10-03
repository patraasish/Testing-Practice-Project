package javaprograms;

public class ForLoop2 {

	public static void main(String[] args) {
		
		//write a loop to print every character of a string
		
		String text="Learning java";
		//char arr[]=text.toCharArray();
		
		for(int i=0;i<text.length();i++) {
		//	System.out.println(arr[i]);
			System.out.println(text.charAt(i));
		}
	}

}
