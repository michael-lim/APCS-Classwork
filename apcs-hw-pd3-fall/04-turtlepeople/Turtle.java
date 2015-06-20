import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age, speed;

    public Turtle() {
	setAll("Default", 0, 0);
    }
    
    public Turtle(String n) {
	setAll(n, 0, 0);
    }

    public Turtle(String n, int x, int y) {
	setAll(n, x, y);
    }

    public void setAll(String n, int x, int y) {
	name = n;
	speed = x;
	age = y;
    }
   

    public String getName() {
	return name;
    }

    public int getSpeed() {
	return speed;
    }

    public int getAge() {
	return age;
    }
   

    public void speedUp(int n) {
	speed = speed + n;
    }

    public void slowDown(int n) {
	speed = speed - n;
    }

    public void getOlder() {
	age = age + 1;
    }

    public void getInfo() {
	System.out.println("The turtle's name is " + name);
	System.out.println(name + "'s age is " + age);
        System.out.println(name + "'s speed is " + speed);
    }
}
