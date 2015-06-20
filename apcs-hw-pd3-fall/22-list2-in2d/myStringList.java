import java.io.*;
import java.util.*;

public class myStringList {
       private String[] data;
       private int numItems;

       public myStringList() {
          data = new String[5];
	  numItems = 0;
       }


    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	   String[] tmpArray = new String[data.length+data.length/2];
	   for (int i=0;i<data.length;i++) {
	      tmpArray[i]=data[i];
	   }
	   data = tmpArray;
    }

  public void add(String d) {
	  if (isFull()) {
	    grow();
    }
  	data[numItems] = d;
  	numItems=numItems+1;
  }

    public void add(int pos, String d) {
    	while(pos >= data.length)
  	    grow();
      for(int i = data.length-1; i>pos; i--){
	       data[i] = data[i-1];
    	}
      data[pos] = d;
      numItems++;
    }

    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void remove(int pos) {
      if(pos<data.length-1){
        for (int i = pos; i< data.length-1 ; i++){
        data[i] = data[i+1];
        }
        numItems--;
      }
    }

    public String get(int pos){
      return data[pos];
    }

    public void set(int pos, String d){
      if (pos < data.length)
        data[pos] = d;
      else
        add(pos,d);
    }

    public int size() {
      return numItems;
    }

    public String find(String n) {
	for(int i = 0; i<data.length; i++){
	    if (data[i].equals(n))
		return n;
	}
	return "Not found";
    }

    public String fremove(String n) {
	for(int i = 0; i<data.length; i++){
	    if (data[i].equals(n))
		data[i] = "null";
		return n;
	}
	return "Not found";
    }
}
