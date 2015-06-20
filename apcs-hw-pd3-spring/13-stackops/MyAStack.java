import java.util.*;
import java.io.*;

public class MyAStack {
	private String[] astack;
	private int top;
	private int alength;

	public MyAStack() {
		astack = new String[10];
		top = -1;
		alength = 10;
	}

	public boolean empty() {
		return top<0;
	}

	public void push(String s) {
		top++;
		if(top>=alength) {
			grow();
		}
		astack[top] = s;
	}
	public void grow() {
		String[] newa = new String[astack.length*2];
		for(int i=0; i<alength; i++) {
			newa[i] = astack[i];
		}
		astack = newa;
		alength = newa.length;
	}

	public String pop() {
		if(top<0) {
			System.out.println("Popping an empty stack");
		}
		top--;
		return astack[top+1];
	}

	public String peek() {
		if(top>-1)
			return astack[top];
		return "Stack is empty";
	}

	public String toString() {
		String r = "[";
		for(int i=0; i<=top; i++) {
			if(i==top)
				r+=astack[i];
			else
				r+=astack[i] + ", ";
		}
		return r+"]";
	}

	public static void main(String[] args){
		MyAStack astack = new MyAStack();
		System.out.println(astack.empty());
		astack.push("Hello");
		astack.push("there");
		astack.push("Earthling");
		System.out.println(astack);
		System.out.println(astack.peek());
		System.out.println(astack.pop());
		System.out.println(astack);
	}
}