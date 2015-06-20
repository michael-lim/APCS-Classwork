import java.io.*;
import java.util.*;

public class Loop {
    public int fact(int n) {
	int result;
	if (n ==1) 
	    result = 1;
	else
	    result = n * fact(n-1);
	return result;
    }

    public int fact2(int n) {
	int result, count, fact;
	count = n;
	fact = 1;
	while (count != 1) {
	    fact = fact*count;
	    count = count - 1;
	}
	return fact;
    }

 //GCD, GCD2, ISPRIME METHODS COLLABORATED WITH ISAAC GLUCK & JASON HUANG	    
    public int gcd(int a, int b) {
	int c;
	if (a>b)
	    c = b;
	else
	    c = a;

	while (a%c!=0 || b%c!=0)
	    c = c-1;

	return c;
    }

    public int gcd2(int a, int b) {
	while (b != 0) {
	    int r = a%b;
	    return gcd2(b,r);
	}
	return a;
    }

    public boolean isPrime(int n) {
	int count = n-1;
	while (count>1) {
	    if (n%count==0)
		return false;
	    else
		count = count -1;
	}
	return true ;
    }	    




}
