import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Rational r1 = new Rational(1,0);
	Rational r2 = new Rational(3,53);
	Rational r3 = new Rational(6,106);
	Rational r4 = new Rational(6,7);
	Rational r5 = r2.mult(r4);
	Rational r6 = new Rational();
	r6.setN(32);
	r6.setD(119);
	Rational r7 = new Rational();
	r7.setN(7);
	r7.setD(0);

	System.out.println("Newly created r6 = " + r6.getN() + "/" + r6.getD());
	System.out.println("Newly created r7 = " + r7.getN() + "/" + r7.getD());
	System.out.println("3/53 = 6/106? " + r2.equals(r3));
	System.out.println("3/53 = 6/7? " + r2.equals(r4));
	System.out.println("3/53 > 6/106? " +  r2.compareTo(r3));
	System.out.println("3/53 > 6/7? " + r2.compareTo(r4));
	System.out.println("3/53 * 6/7 = " + r5.getN() + "/ " + r5.getD());


    }



}
