import java.io.*;
import java.util.*;
import java.lang.*;

public class io {
	public static void main(String[] args){
		Scanner sc=null;
		PrintWriter out=null;
		try {
			sc = new Scanner(System.in);
			out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
		} catch (Exception e){};
		String temp ="";
		while(!temp.equals("quit")){
			temp = sc.nextLine();
			if(!temp.equals("quit"))
				out.println(temp);
		}
		out.close();

	}
	

}
