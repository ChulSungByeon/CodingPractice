class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length] ;
        
        int min = 1000000;
      
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j <= queries[i][1]; j++ ){
                if(arr[j] > queries[i][2] && arr[j] < min){
                    min = arr[j];
                }                
            }
            
            if (min == 1000000){
               answer[i] = -1; 
            }
            else{
                answer[i] = min;
            }

            min = 1000000;
            
        }
        
        return answer;
    }
}
