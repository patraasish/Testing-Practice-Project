package javaprograms;

public class InbuildMethods2 {
	public static void main(String[] args) {
	
		String title="Simplilearn Online Courses";
		/*
		 * contains() method
		 * this method will check if your expected string has desired set of strings or not
		 * this method return a boolean outout
		 */
		
		if(title.contains("Simplilearn")) {
			System.out.println(" Title is valid , Test case pass");
		}
		else
		{
			System.out.println(" Title is invalid , Test case fails");
		}
		
		/*
		 * method2: equals()
		 * this method will compare strings every character 
		 * it will give output as true or false
		 */
		
		if(title.contains("Simplilearn Online Courses")) {
			System.out.println(" Title is valid , Test case pass");
		}
		else
		{
			System.out.println(" Title is invalid , Test case fails");
		}
		
		/*
		 * mmethod3: substring()
		 */
		
		String title2="Pratice Labs Java";
		
		String sub=title2.substring(13,17);
		System.out.println(sub);
		
		if(sub.equals("Java")) {
			System.out.println(" Title is valid , Test case pass");
		}
		else
		{
			System.out.println(" Title is invalid , Test case fails");
		}
		
		
	}
	
}
