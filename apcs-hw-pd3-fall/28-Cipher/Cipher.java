import java.io.*;
import java.util.*;

public class Cipher{
    public String encode(String s, int n) {
	String result = "";
	char c = 'a';
	char c1 = 'a';
	for(int i = 0; i < s.length(); i++) {
	    c = s.charAt(i);
	    if (c >= 97 && c <= 122) {
		c1 = (char)(c + n);
		if (c1 >122)
		    c1 = (char)(c1 - 26);
	    }
	    else {
		c1 = c;
	    }

	    result = result + c1;
	}
	return result;
    }
    public static void main(String[] args) {
	Cipher c = new Cipher();
	System.out.println(c.encode("hello",3) + " " + c.encode("abcxyz",3));
    }
}
