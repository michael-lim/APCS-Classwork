import java.io.*;
import java.util.*;

public class test{
	public int[][] a = {{11,22,33,5,44,55},{22,33,44,6,55,66},{4,5,6,7,8,9},{33,44,55,8,66,77},{44,55,66,9,77,88}};

	public void removeCross(int[][] m, int r, int c){
		//m.numRows() and m.numCols() substituted by numRows(m) and numCols(m)
		for(int i = 0; i<numRows(m); i++){
			for(int j =0; j<numCols(m); j++){
				if(j>c && i> r)
					a[i-1][j-1]=a[i][j];
				else if(j>c)
					a[i][j-1]=a[i][j];
				else if(i>r)
					a[i-1][j]=a[i][j];
				if(i==numRows(m)-1 || j == numCols(m)-1)
					a[i][j]=0;
			}
		}
	}

	public String toString(){
		String s = new String();
		for(int i =0;i<a.length;i++)
			s += Arrays.toString(a[i]) + "\n";
		return s;
	}

	public int numCols(int[][] m){
		return m[0].length;
	}

	public int numRows(int[][] m){
		return m.length;
	}

	public static void main(String[] args){
		test t = new test();
		System.out.println(t.toString());
		t.removeCross(t.a,2,3);
		System.out.println(t.toString());
	}
}