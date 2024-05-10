class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String str = "";
        String str2 = "";
        
        boolean b = my_string.matches("^[a-zA-Z0-9]*$");
        System.out.println(b);
        
        if(my_string.matches("^[a-zA-Z0-9]*$") && overwrite_string.matches("^[a-zA-Z0-9]*$")){
            if(overwrite_string.length() >= 1 && overwrite_string.length() <= 1000){
                if(s >= 0 && s <= my_string.length() - overwrite_string.length()){
                    str = my_string.substring(0,s);
                    answer += str;
                    answer += overwrite_string;
                    if(answer.length() - s+overwrite_string.length() > 0){
                        answer += my_string.substring(s+overwrite_string.length());
                    }

                }
            }
        }      
        
        System.out.println(answer);
        return answer;
    }
}
