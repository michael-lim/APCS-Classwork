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
    System.out.println(Arrays.toString(a));
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

    public void remove(int pos){
        int[] tempa = new int[a.length-1];
        if(pos <= a.length) {
            for(int i = 0; i < pos; i++)
                tempa[i] = a[i];
            for(int i = pos+1; i< a.length; i++)
                tempa[i-1] = a[i];
        a = tempa;
        }
        else
            System.out.println("Your index might be out of range?");
    }

    public void insert(int pos, int d){
        if (pos >= a.length) {
            int[] tempa = new int[pos+1];
            for(int i = 0; i < a.length; i++){
                tempa[i] = a[i];
            }
            tempa[pos] = d;
        a = tempa;
        }
        else {
            int[] tempa = new int[a.length+1];
            for(int i = 0; i < pos; i++)
                    tempa[i] = a[i];
            tempa[pos] = d;
            for(int i=pos; i<a.length; i++)
                tempa[i+1] = a[i];
        
        a = tempa;
        }
      
    }



}