import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	StringStuff stuff = new StringStuff();
	String l1 = stuff.capitalize("michael lim");
	String l2 = stuff.bondify("lichael mim");
	String l3 = stuff.pigLatinify("apple");
	String l4 = stuff.pigLatinify("giraffe");
	String l5 = stuff.pigLatinify("Outward");
	String l6 = stuff.pigLatinify("Crayon");
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(l3);
	System.out.println(l4);
	System.out.println(l5);
	System.out.println(l6);
    }

}
