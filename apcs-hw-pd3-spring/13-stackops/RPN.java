import java.io.*;
import java.util.*;
import java.lang.*;

public class RPN{
	private String data="";
	private MyAStack stack = new MyAStack();

	public void readFile(String s){
		File file = new File(s);
		try{
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				data+=sc.next();
			}
			System.out.println(data);
		}
		catch(Exception E){
			System.out.println("Exception!");
		}
	}

	public void countOff(){
		String temp = "";
		for(int i =0; i<data.length();i++){
			switch(data.charAt(i)){
				case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
					temp+=data.charAt(i);
					break;
				case ',': 
					stack.push(Integer.parseInt(temp)+"");
					temp="";
					break;
				case '+':
					if(!temp.equals(""))
						stack.push(Integer.parseInt(temp)+"");
					stack.push(Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop())+"");
					temp="";
					break;
				case '-':
					if(!temp.equals(""))
						stack.push(Integer.parseInt(temp)+"");
					stack.push(0-Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop())+"");
					temp="";
					break;
				case '*':
					if(!temp.equals(""))
						stack.push(Integer.parseInt(temp)+"");
					stack.push(Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop())+"");
					temp="";
					break;
				case '/':
					if(!temp.equals(""))
						stack.push(Integer.parseInt(temp)+"");
					stack.push(Integer.parseInt(stack.pop())/Integer.parseInt(stack.pop())+"");
					temp="";
					break;
				default:
					return;
					
			}
		}
	}

	public String toString(){
		return stack.toString();
	}

	public static void main(String[] args){
		RPN r = new RPN();
		r.readFile(args[0]);
		r.countOff();
		System.out.println(r);
	}

}