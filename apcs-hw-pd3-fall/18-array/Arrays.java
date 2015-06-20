import java.io.*;
import java.util.*;

public class Arrays {
    public int[] RevFill(int n) {
	int[] a = new int[n];
	for(int i = 0; i < n; i++) {
	    a[i] = n - i;
	}
	return a;
    }

    public int[] MakeRandom(int size, int min, int max) {
	int diff = max - min;
	int[] a = new int[size];
	Random r = new Random();
	for(int i = 0; i < size; i++) {
	    a[i] = min + r.nextInt(diff+1);
	}
	return a;
    }

    public int sum13(int[] nums) {
	int sums = 0;
	for(int i = 0; i < nums.length ; i++) {
	    if(nums[i] != 13)
		sums = sums + nums[i];
	    if(nums[i] == 13)
		i = i+1;
	}
	return sums;
    }

    public boolean modThree(int[] nums) {
	for(int i = 0; i <nums.length -2 ; i++) {
	    if (nums[i] %2 == nums[i+1] %2 && nums[i+1] %2 == nums[i+2] %2)
		return true; 
	}
	return false;
    }

    public static void main(String[] args) {
	Arrays a = new Arrays();
	int[] a1 = {1,3,5,2,5,13,1245254,4};
	int[] a2 = {1,3,4,2,4,7};
	int[] r1 = a.RevFill(7);
	int[] r2 = a.MakeRandom(7, 12, 69);
	String s1 = "";
	String s2 = "";
	for(int i = 0; i < r1.length; i++){
	    s1 = s1 + r1[i] + " ";
	}
	for(int i = 0; i < r2.length; i++){
	    s2 = s2 + r2[i] + " ";
	}
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(a.sum13(a1)+"");
	System.out.println(a.modThree(a2)+"");
    }
			   



}
