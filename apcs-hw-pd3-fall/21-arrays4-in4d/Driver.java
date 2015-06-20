import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
    	ArrayStuff ar = new ArrayStuff();
        ar.insert(3, 11);
        System.out.println(ar.toString());
        ArrayStuff ar2 = new ArrayStuff();
        ar2.insert(30, 13453526);
        System.out.println(ar2.toString());
        ArrayStuff ar3 = new ArrayStuff();
        ar3.remove(30);
        System.out.println(ar3.toString());
        ArrayStuff ar4 = new ArrayStuff();
        ar4.remove(3);
        System.out.println(ar4.toString());
    }

}