//1. 문자열 섞기
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i=0; i<str1.length(); i++) {
            answer += str1.substring(i,i+1);
            answer += str2.substring(i,i+1);
            
        }
        
        
        return answer;
    }
}

//2. 문자리스트를 문자열로 변환하기
class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        for( int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
        
        
    }
}

//3. 문자열 곱하기
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        for ( int i=0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}

//4. 더 크게 합치기
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
      String ab = String.valueOf(a) + String.valueOf(b);
         String ba = String.valueOf(b) + String.valueOf(a);
        
        int abValue = Integer.parseInt(ab);
        int baValue = Integer.parseInt(ba);
        
        if (abValue >= baValue) {
            return abValue;
        }else {
            return baValue;
        }      
    }
}

//5. 두 수의 연산값 비교하기
class Solution {
    public int solution(int a, int b) {
       int asnswer = 0;
        
        String a_b_str = Integer.toString(a) + Integer.toString(b);
        int a_b = Integer.valueOf(a_b_str);
        
        if(a_b >= 2*a*b) {
            return a_b;
        }else {
            return 2*a*b;
        }
    }
}
