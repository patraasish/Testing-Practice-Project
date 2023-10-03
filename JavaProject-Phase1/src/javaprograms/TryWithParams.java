package javaprograms;

import java.io.File;
import java.io.PrintWriter;

public class TryWithParams {

	public static void main(String[] args) {
		
		try(PrintWriter writer=new PrintWriter(new File("/Desktop/hello.txt"))){
			writer.print("hello world");
		}
		
		catch(Exception e) {
			e.getMessage();
		}

	}

}
