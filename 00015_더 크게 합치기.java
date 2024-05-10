class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        int result1 = 0;
        int result2 = 0;
        
        str1 += a;
        str1 += b;
        
        str2 += b;
        str2 += a;
        
        result1  = Integer.parseInt(str1);
        result2  = Integer.parseInt(str2);
        
        if(result1 > result2 || result1 == result2){
            answer = result1;
        }
        else if(result1 < result2){
            answer = result2;
        }

        return answer;
    }
}
