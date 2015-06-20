import java.io.*;
import java.util.*;
import java.lang.*;

public class question1 {
	private String digit="";
	private int input=0;
	public question1(){
		readInput();
		toGenerate();
		writeOutput();
	}

	public void readInput(){
		File file = new File("DIGIT.IN");
		try {
			Scanner sc = new Scanner(file);
			input = sc.nextInt();
			sc.close();
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int count(int n){
		int temp=1;
		while(n!=0){
			temp *= (n%10);
			n = n/10;
		}
		return temp;
	}

	public String toGenerate(){
		int temp = input;
		digit += input + " ";
		while(temp>=10){
			digit += count(temp) + " ";
			temp = count(temp);
		}
		return digit;
	}

	public void writeOutput(){

		PrintWriter out=null;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("DIGIT.OUT")));
			out.print(digit);
			
		} catch (Exception e){}
		out.close();
	}

	public static void main(String[] args) {
		question1 q = new question1();
	}
}