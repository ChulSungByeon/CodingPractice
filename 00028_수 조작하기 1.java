class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        String[] s_list = new String[control.length()];      
        
        for(int i=0; i < s_list.length; i++){
            s_list[i] = control.substring(i,i+1);
        }
        
        for(int i=0; i<s_list.length; i++){
            if(s_list[i].equals("w")){
                n += 1;
            }
            else if(s_list[i].equals("s") ){
                n -= 1;
            }
            else if(s_list[i].equals("d")){
                n += 10;
            }
            else if(s_list[i].equals("a")){
                n -= 10;
            }
        }
        
        answer = n;        
        
        return answer;
    }
}
