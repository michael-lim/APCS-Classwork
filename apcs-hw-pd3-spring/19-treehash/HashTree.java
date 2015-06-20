import java.util.*;
import java.util.*;

public class HashTree{
    
    public static void main(String[]Args){
	
	
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(x);
	TreeMap<Integer, Integer> t = new TreeMap<Integer, Integer>();
	long startTime = System.currentTimeMillis();
	for(int i = 0;i < x; i++){
	    h.put((Integer) i,(Integer)  i);
	    
	}

	long endTime = System.currentTimeMillis();

	System.out.println("That took " + (endTime - startTime) + " milliseconds");
	long startTime1 = System.currentTimeMillis();
	for(int j = 0;j<x;j++){
	    t.put((Integer) j, (Integer) j);
	}
        long endTime1 = System.currentTimeMillis();
	System.out.println("That took " + (endTime1 - startTime1) + " milliseconds");
    }
}
