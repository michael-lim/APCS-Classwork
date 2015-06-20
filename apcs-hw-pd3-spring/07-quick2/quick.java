import java.io.*;
import java.util.*;

public class quick{
    public int quickselect(int[] a, int k, int low, int high) {
        /*
        Old copy-paste method
        if (low <= high) {
            int pivot = partition(a, low, high);
            int[] r1 = quickselect(a,k,low,k-1);
            int[] r2 = quickselect(a,k,k+1,high);
            a = merge(r1,k,r2);
        }
        else
            return a[low];
        */

        //No substitution method
        if (low <= high) {
            int pivot = partition(a, low, high);
            if (pivot == k) {
                return a[k];
            } else if (pivot > k) {
                return quickselect(a, k, low, pivot - 1);
            } else {
                return quickselect(a, k, pivot + 1, high);
            }
        }
        else
            return a[low];
    }

    public int partition(int[] a, int low, int high) {
        int pivot = low + new Random().nextInt(high - low + 1);
        swap(a, high, pivot);
        int lstore = low;
        for (int i = lstore; i < high; i++) {
            if (a[i] > a[high]) {
                swap(a, i, lstore);
                lstore++;
            }
        }
        int lstore2 = lstore;
        for (int i = lstore2; i <high; i++){
            if(a[i]== a[high]){
                swap(a,i,lstore2);
                lstore2++;
            }
        }
        swap(a, lstore2, high);
        return (lstore+lstore2)/2;
     }


    public void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
/*
    public int[] merge(int[] l, int k, int[] r) {
        int[] a = new int[l.length + r.length + 1];
        for(int i =0; i<l.length; i++){
            a[i] = l[i];
        }
        a[l.length] = k;
        for(int i =0; i<r.length; i++){
            a[i+l.length+1] = r[i];
        }
        return a;
    }
*/

    public static void main(String[] args){
        quick q = new quick();
        int[] a = {1,15,3,53,33,22,64,82,49,67,33,22,64,49};
        System.out.println(q.quickselect(a,9,0,12));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}