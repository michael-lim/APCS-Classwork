import java.io.*;
import java.util.*;

public class myList {
       private int[] data;
       private int numItems;

       public myList() {
          data = new int[5];
	  numItems = 0;
       }


    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	   int[] tmpArray = new int[data.length+data.length/2];
	   for (int i=0;i<data.length;i++) {
	      tmpArray[i]=data[i];
	   }
	   data = tmpArray;
    }

  public void add(int d) {
	  if (isFull()) {
	    grow();
    }
  	data[numItems] = d;
  	numItems=numItems+1;
  }

    public void add(int pos, int d) {
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

    public int get(int pos){
      return data[pos];
    }

    public void set(int pos, int d){
      if (pos < data.length)
        data[pos] = d;
      else
        add(pos,d);
    }

    public int size() {
      return numItems;
    }

    public int find(int n) {
	for(int i = 0; i<data.length; i++){
	    if (data[i] == n)
		return n;
	}
	return 0;
    }

    public int fremove(int n) {
	for(int i = 0; i<data.length; i++){
	    if (data[i] == n)
		data[i] = 0;
		return n;
	}
	return 0;
    }
}
