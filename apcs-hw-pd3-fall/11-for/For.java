import java.io.*;
import java.util.*;

public class For {
    private String s;
    private int length;
    private String s1, s2, result, ar;

    public boolean isPrime(int n) {
	for (int count = n-1; count>1; count--) {
	    if (n%count==0)
		return false;
	}
	return true;
    }

    public String reverse(String s) {
	result = "";
	length = s.length();
	for (int i = length - 1; i >= 0; i--) {
	    result = result + s.substring(i, i+1);

	}
	return result;
	
    }

    public String table(int n, int m) {
	ar = "";
	for (int i=1; i <=  m; i++) {
	    if (i == 1) 
		ar = "  " + ar;
	    else
		ar = ar + "\n" + i + " ";
	    for (int j=1; j <= n; j++) {
		ar = ar + i*j + " ";
	    }	    
	}
	return ar;
    }




    public static void main(String[] args) {
	String s = "Quick brown fox jumped over the lazy dog";
	For f = new For();
	System.out.println("83 is prime? " + f.isPrime(83));
	System.out.println(f.reverse(s));
	System.out.println(f.table(7,8));
    }


}
