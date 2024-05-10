class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String s = "";
        String s2 = "";
        int odd = 0;
        int even = 0;
        
        for (int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                s += Integer.toString(num_list[i]);
            }
            else{
                s2 += Integer.toString(num_list[i]);
            }
        }
        
        odd = Integer.parseInt(s2);
        even = Integer.parseInt(s);
        
        answer = odd + even;
        
        
        return answer;
    }
}
