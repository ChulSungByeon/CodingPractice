class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        if((str1.length() >= 1 && str1.length() <= 10) && (str2.length() >= 1 && str2.length() <= 10)){
            for(int i=0; i < str1.length(); i++ ){
                answer += str1.charAt(i);
                answer += str2.charAt(i);
            }
        }
        
        System.out.println(answer);
        
        return answer;
    }
}
