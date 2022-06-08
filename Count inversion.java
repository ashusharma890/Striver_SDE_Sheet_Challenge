// code start

import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int N) {
        // Write your code here.
     long c=mergeSort(arr,0,(int)N-1);
        return c;
    }
    static long mergeSort(long a[],int l,int r)
    {
        long c=0;
        if(l<r)
        {
            int m=(l+r)/2;
            c=c+mergeSort(a,l,m);
            c=c+mergeSort(a,m+1,r);
            c=c+merge(a,l,m,r);
        }
        return c;
    }
    static long merge(long a[],int l,int m,int r)
    {
        long c=0;
        long L[]=Arrays.copyOfRange(a,l,m+1);
        long R[]=Arrays.copyOfRange(a,m+1,r+1);
        int k=l;
        int i=0,j=0;
        while(i<L.length && j<R.length)
        {
            if(L[i]<=R[j])
            {
                a[k++]=L[i++];
            }
            else
            {
             a[k++]=R[j++];
             c=c+(m+1)-(l+i);
            }
        }
        while(i<L.length)
          a[k++]=L[i++];
        while(j<R.length)
          a[k++]=R[j++];
        return c;  
    }
}

// code end

