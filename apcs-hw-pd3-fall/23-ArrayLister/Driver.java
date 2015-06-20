import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	ArrayLister AL = new ArrayLister();
	//#1
	ArrayList<String> AI1 = new ArrayList<String>();
	ArrayList<String> AI2 = new ArrayList<String>();
	long ti1 = System.currentTimeMillis();
	for(int i = 0; i < 100000; i++){
	    AI1.add("LALA");
	}
	long tf1 = System.currentTimeMillis();
	System.out.println("Time to add at the end "+(tf1-ti1));
	
	long ti2 = System.currentTimeMillis();
	for(int i = 0; i < 100000; i++){
	    AI2.add(0, "LALA");
	}
	long tf2 = System.currentTimeMillis();
	System.out.println("Time to add at the start "+(tf2-ti2));
	
	//#2
	ti1 = System.currentTimeMillis();
	for(int i = 99999; i >= 0; i--){
	    AI1.remove(i);
	}
	tf1 = System.currentTimeMillis();
	System.out.println("Time to remove at the start "+(tf1-ti1));
	
	ti2 = System.currentTimeMillis();
	for(int i = 0; i < 100000; i++){
	    AI2.remove(0);
	}
	tf2 = System.currentTimeMillis();
	System.out.println("Time to remove at the end "+(tf2-ti2));
	
	//3
	ArrayList<String> AI3 = new ArrayList<String>();
	AI3.add("Hello");
	AI3.add("My");
	AI3.add("Name");
	AI3.add("Isn't");
	AI3.add("Dumbo");
	System.out.println(AI3);
	System.out.println(AL.reverse(AI3));
    }
}
