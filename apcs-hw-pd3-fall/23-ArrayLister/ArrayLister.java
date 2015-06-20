import java.util.*;
import java.io.*;
import java.*;


public class ArrayLister {
    public ArrayList<String> reverse(ArrayList<String> ar){
	ArrayList<String> ar1 = new ArrayList<String>();
	for(int i = ar.size()-1; i >= 0; i--)
	    ar1.add(ar.get(i));
	return ar1;
    }
}
