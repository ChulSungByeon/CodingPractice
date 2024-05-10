class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        int[] array = new int[n];
        
        for(int i=0; i<n; i++){
            array[i] = a + (d*i);
            if(included[i]){
                answer += array[i];
            }
        }
        
        return answer;
    }
}
