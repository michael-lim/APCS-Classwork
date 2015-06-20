import java.io.*;
import java.util.*;

public class Coin {
    private int flips, nheads, ntails, value;
    private String face, name;
    private double fair = 0.5;

    public String getFace() {
	return face;
    }

    public int getFlips() {
	return flips;
    }

    public double getFair() {
	return fair;
    }
    
    public int getValue() {
	return value;
    }

    public String getName() {
	return name;
    }

    public void reset() {
	setFace("Heads");
	setFlips(0);
	setFair(0.5);
	nheads = 0;
	ntails = 0;
	setValue(0);
	setName("No name");

    }

    public void changeFair(double n) {
	fair = n;
    }
    
    public void toFlip() {
	Random r;
	int n;
	r = new Random();
	n = r.nextInt();
	flips = flips + 1;
	if (n > fair) {
	    setFace("Heads");
	    nheads = nheads + 1;
	} else {
	    setFace("Tails");
	    ntails = ntails + 1;
	}
    }
    
    public void setCoin(String s) {
	if (s.compareTo("Quarter") == 0) {
	    setValue(25);
	    setName(s);
	} else if (s.compareTo("Dime") == 0) {
	    setValue(10);
	    setName(s);
	} else if (s.compareTo("Nickel") == 0) {
	    setValue(10);
	    setName(s);
	} else if (s.compareTo("Penny") == 0) {
	    setValue(1);
	    setName(s);
	} else {
	    setValue(0);
	    setName(s);
	}
    }





    public void setFace(String s) {
	face = s;
    }
    
    public void setFlips(int n) {
	flips = n;
    }
    
    public void setFair(double n) {
	fair = n;
    }
    
    public void setValue(int n) {
	value = n;
    }

    public void setName(String s) {
	name = s;
    }

}