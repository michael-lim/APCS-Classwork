import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;
    
    public ArrayStuff() {
	r = new Random();
	a = new int[20];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public int get(int n) {
	return a[n];
    }
    
    public int findMaxIndex() {
	int maxi = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i]>a[maxi])
		maxi=i;
	}
	return maxi;

    }

    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }

    public double mean() {
        int sum = 0;
        for (int i = 0; i< a.length; i++) {
            sum = sum + a[i];
        }
        return (sum/a.length*1.0);
    }

    public double stddev() {
        double ins = 0;
        double m = mean();
        for (int i = 0; i<a.length; i++){
            double del = (m-a[i]);
            ins = ins + Math.pow(del,2);
        }
        return Math.sqrt(ins/a.length);
    }

    public double meantest(int[] a) {
    	int sum = 0;
    	for (int i = 0; i< a.length; i++) {
    		sum = sum + a[i];
    	}
    	return (sum/a.length*1.0);
    }

    public double stddevtest(int[] a) {
    	double ins = 0;
        double m = meantest(a);
    	for (int i = 0; i<a.length; i++){
            double del = (m-a[i]);
    		ins = ins + Math.pow(del,2);
     	}
        return Math.sqrt(ins/a.length);
    }

    public static void main(String[] args) {
    	ArrayStuff ar = new ArrayStuff();
    	int[] a = {9,2,5,4,12,7,8,11,9,3,7,4,12,5,4,10,9,6,9,4};
        System.out.println(ar.meantest(a));
        System.out.println(ar.stddevtest(a));

    }
}