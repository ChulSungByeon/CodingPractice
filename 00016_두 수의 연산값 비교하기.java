class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int result1 = 0;
        int result2 = 0;
        String str = "";
                
        str += a;
        str += b;
        
        result1 = Integer.parseInt(str);
        result2 = 2*a*b;
        
        if(result1 > result2 || result1 == result2){
            answer = result1;
        }
        else if(result1 < result2){
            answer = result2;
        }        
        
        return answer;
    }
}
