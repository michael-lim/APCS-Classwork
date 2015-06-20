import java.io.*;
import java.util.*;

public class Bat {

    public boolean sameStarChar(String str) {
	if (str.indexOf("*") < 0)
	    return true;
	else if(str.indexOf("*") ==0 && str.length() ==1)
	    return true;
	else if(str.indexOf("*") == 0) 
	    return sameStarChar(str.substring(1));  
	else {
	    if (str.length()<=2)
		return true;
	    else if (str.substring(str.indexOf("*")-1, str.indexOf("*")).equals(str.substring(str.indexOf("*")+1, str.indexOf("*") +2)))
		return sameStarChar(str.substring(str.indexOf("*")+1));
	    else 
		return false; 
  
	}
  
    }

    public String sameEnds(String string) {
	int n = 1;
	if (string.length() <= 1)
	    return "";
	else if (string.substring(1).indexOf(string.substring(0,1)) == -1)
	    return "";
	else {
	    while (string.substring(1).indexOf(string.substring(0,n)) != -1 && n < string.length()/2+1) {
		n = n + 1;
	    }
	    
	    return string.substring(0,n-1);
	}
    }
}
