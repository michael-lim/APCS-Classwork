import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		myList my = new myList();
		System.out.println(my);
		my.add(1);
		my.add(2);
		my.add(3);
		my.add(4);
		my.add(5);
		my.add(6);
		System.out.println(my);
		my.remove(2);
		System.out.println(my);
		my.add(134,23534);
		System.out.println(my);

		myStringList my2 = new myStringList();
		System.out.println(my2);
		my2.add("hi");
		my2.add("my");
		my2.add("name");
		my2.add("is");
		my2.add("derp");
		my2.add("maybe");
		System.out.println(my2);
		my2.remove(2);
		System.out.println(my2);
		my2.add(134,"lol");
		System.out.println(my2);
	}
}