import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] arg) {

	Turtle t = new Turtle();
	Turtle t2 = new Turtle("Tommy");
	Turtle t3 = new Turtle("Spongebob", 1, 2);
	Person p = new Person("Sammy");

        t.getInfo();
	t2.getInfo();
	t3.getInfo();

	t.speedUp(1);
	t2.speedUp(2);
	t3.slowDown(1);
	t.getOlder();

	t.getInfo();
	t2.getInfo();
	t3.getInfo();

	p.setTurtle(t3);
	System.out.println(p.getPet().getName());
	System.out.println(p.getTurtleSpeed());

    }

}
