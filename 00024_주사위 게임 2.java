class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int n = 0;
        
        if(a != b && b != c && a != c){
            answer = a+b+c;
        }
        else if(a == b && b == c && a == c){
            n = 3;
            answer = (a+b+c) * ((a*a) + (b*b) + (c*c)) * ((a*a*a) + (b*b*b) + (c*c*c));
        }
        else{
            answer = (a+b+c) * ((a*a) + (b*b) + (c*c));
        }

        return answer;
    }
}
