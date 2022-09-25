class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
         Arrays.sort(arr2);
        int distance = 0;

        for (int i=0;i<arr1.length;i++) {
            int from=arr1[i]-d;             
            int to=arr1[i]+d;               
            boolean flag=false;             

            int start = 0;                  
            int end = arr2.length - 1;

            while (start <= end)
            {
                int mid = (end+start) / 2;
                if (arr2[mid] >= from && arr2[mid] <= to) {
                    flag=true;              
                    break;
                } else if (arr2[mid] < from) {
                    start = mid + 1;        
                } else {
                    end = mid - 1;          
                }
            }
            if(!flag) distance++;
        }
        return distance;
    }
}