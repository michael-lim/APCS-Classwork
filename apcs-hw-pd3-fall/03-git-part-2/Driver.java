import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g, g2;
	String result;

	g = new Greeter();
	g2 = new Greeter("Really happy to meet you", "Not happy to meet you");

	System.out.println(g.happyGreet("Tom"));
	System.out.println(g.sadGreet("Anne"));
	System.out.println(g2.happyGreet("Thomas"));
	System.out.println(g2.sadGreet("Sue"));


	
    }
}
