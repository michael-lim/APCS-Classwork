import java.io.*;
import java.util.*;

public class Coin {
    private String face;
    private int tosses;
    private int heads, facen;
    private double prob = 0.5; // another way to initialize
    private int value;
    private Random rdm = new Random();

    public void initCoin(String f, Double p) {
	face = f;
	tosses=0;
	heads=0;
	prob=p;
	facen = 0;
    }

    public Coin(int v) {
	value = v;
	initCoin("Heads",0.5);
    }

    public Coin() {
	initCoin("Heads",0.5);
    }


    public Coin(String f) {
	initCoin(f,0.5);
    }

    public int getFace() {
	return facen;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }

    public int getValue() {
	return value;
    }

    public String toString() {
	return ""+value+" cents";
    }

    public void flip() {
	if (rdm.nextDouble() < prob)
	    facen = 0;
	else facen = 1;
    
    }

}
