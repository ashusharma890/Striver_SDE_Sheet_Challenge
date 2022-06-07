// code start

import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int mat[][]) {
        // Write your code here..
     int row=mat.length; int col=mat[0].length;
        int arr1[]=new int[row];
        int arr2[]=new int[col];
        Arrays.fill(arr1,-1);
        Arrays.fill(arr2,-1);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==0)
                {
                    arr1[i]=0;
                    arr2[j]=0;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr1[i]==0 || arr2[j]==0)
                {
                    mat[i][j]=0;
                }
            }
        }
    }
}

//code end
