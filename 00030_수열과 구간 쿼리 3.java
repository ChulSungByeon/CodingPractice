import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int temp = 0;
                
        for (int i=0; i< queries.length; i++){            
            temp = arr[queries[i][0]];
            
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
            
            //System.out.println(Arrays.toString(arr));
        }
        
        answer = arr;
        
        return answer;
    }
}
