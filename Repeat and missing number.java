// code start

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int[] arra= new int[2];
          int n=A.length;
        int arr[] = new int[n+1];

        for(int i=0;i<n;i++){
            arr[A[i]]+=1;
        
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        res.add(0);

        for(int i=1;i<=n;i++){
            if(arr[i]==0) res.set(1,i);
            if(arr[i]==2) res.set(0,i);
        
        }
        for(int i=0;i<arra.length;i++)
        {
            arra[i]=res.get(i);
        }
        return arra;
    }
}

// code end
