// code start

class Solution {
    public int[][] merge(int[][] intervals) {
 Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));  // to understand this statement , follow the link below- 
       // https://stackoverflow.com/questions/68918425/meaning-of-arrays-sortintervals-arr1-arr2-integer-comparearr10-arr20
        
        ArrayList<int[]> list=new ArrayList<>();
        
        list.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){
            int[] top=list.get(list.size()-1);
            if(top[1]>=intervals[i][0]){
                top[1]=Math.max(top[1],intervals[i][1]);
            }else{
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}

// code end

/* to put it simple, check or compare the last element of a row with the first element of next or below row. If it is less than the below row's 1st element value,
passs on or continue  
else
delete the if the element of 1st row's last index and link the 1st and last rows to avoid the above situation further.
/*
