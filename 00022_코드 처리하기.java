class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;        
        
        for(int i=0; i<code.length(); i++){
            if(code.charAt(i) == '1'){
                mode = 1-mode;
            }
            else if(i%2 == mode){
                answer += code.charAt(i);
            }
        }
        
        if(code == ""){
            answer = "EMPTY";
        }     
        
        System.out.println(answer);
        
        //return answer;
        return "".equals(answer) ? "EMPTY" : answer;
    }
}
