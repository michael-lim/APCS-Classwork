import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter g,g2;
	String result;
	/*
	g = new Greeter();
	g.setGreeting("Hello");
	result = g.greet("Tom");
	System.out.println(result);
	g2 = new Greeter();
	g2.setGreeting("How are you doing");
	result = g.greet("Tom");
	System.out.println(result);
	result = g2.greet("Sarah");
	System.out.println(result);
	
	g.setGreeting("sup");
	System.out.println(g.greet("Alan"));
	System.out.println(g2.greet("Sue"));
	*/
	g = new Greeter("Hello");
	System.out.println(g.greet("Tom"));
	
    }
}
