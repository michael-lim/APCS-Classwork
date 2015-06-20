import java.io.*;
import java.util.*;

public class Rational {
    private int n, d;

    public Rational() {
	n = 1;
	d = 1;
    }

    public Rational(int a,int b) {
	if (b != 0) {
	    n = a;
	    d = b;
	} else {
	    System.out.println("Error: Denominator is set to 0: Input = " + a + "/" + b + "\n Values not stored.");
	    n = 1;
	    d = 1;

	}
    }

    public int gcd(int a,int b) {
	if (b == 0)
	    return a;
	else
	    return gcd(b,a%b);
    }

    public void reduce() {
	int g = gcd(n,d);
	n = n / g;
	d = d / g;
    }

    public int getN() {
	return n;
    }

    public int getD() {
	return d;
    }

    public void setN(int a) {
	n = a;
    }

    public void setD(int b) {
	if (b != 0) {
	    d = b;
	} else {
	    System.out.println("Error: Denominator is set to 0: Input = " + b + "\n New denominator will not be stored.");
	} 
    }

    public boolean equals(Rational other) {
	reduce();
	other.reduce();

	if (other.getN() == n && other.getD() == d)
	    return true;
	else 
	    return false;
    }
    
    public Rational mult(Rational other) {
	int newN = n * other.getN();
	int newD = d * other.getD();
	
	Rational r = new Rational(newN, newD);
	return r;
    }

    public int compareTo(Rational other) {
	reduce();
	other.reduce();
	
	if(equals(other))
	    return 0;

	//cross multiply
	if(n*other.getD() > d*other.getN())
	    return 1;
	else 
	    return -1;
    }






}
