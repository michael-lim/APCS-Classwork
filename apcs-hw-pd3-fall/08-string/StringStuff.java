import java.io.*;
import java.util.*;

public class StringStuff {
    private int index;
    private String first, last;

    public void getInfo(String name) {
	index = name.indexOf(" ");
	first = name.substring(0,index);
	last = name.substring(index+1);
    }

    public void info() {
	System.out.println(index + " " + first + " " + last);
    }

    public String capitalize(String name) {
	getInfo(name);
	String s1 = first.substring(0,1);
	String s2 = last.substring(0,1);
	String s1n = s1.toUpperCase();
	String s2n = s2.toUpperCase();
	
	String s1t = s1n + first.substring(1);
	String s2t = s2n + last.substring(1);
	String s = s1t + " " + s2t;
	return s;
    }
    
    public String bondify(String name) {
	String name1 = capitalize(name);
	getInfo(name1);
	String bond = last + ", " + first + " " + last;
	return bond;

    }

    public String pigLatinify(String word) {
	String firstletter = word.substring(0,1);
	String rest = word.substring(1);
	String result;
	String v1 = "a";
	String v2 = "e";
	String v3 = "i";
	String v4 = "o";
	String v5 = "u";
	int n1 = firstletter.compareTo(v1);
	int n2 = firstletter.compareTo(v2);
	int n3 = firstletter.compareTo(v3);
	int n4 = firstletter.compareTo(v4);
	int n5 = firstletter.compareTo(v5);
	int n11 = firstletter.compareTo(v1.toUpperCase());
	int n21 = firstletter.compareTo(v2.toUpperCase());
	int n31 = firstletter.compareTo(v3.toUpperCase());
	int n41 = firstletter.compareTo(v4.toUpperCase());
	int n51 = firstletter.compareTo(v5.toUpperCase());

	if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0 || n11 == 0 || n21 == 0 || n31 == 0 || n41 == 0 || n51 == 0) {
	    result = word + "yay";
	} else if (firstletter.compareTo(firstletter.toLowerCase()) == 0){ 
	    result = rest + firstletter + "ay";
	} else {
	    result = rest.substring(0,1).toUpperCase() + rest.substring(1) + firstletter.toLowerCase() + "ay";
		}
	return result;
    }
}
