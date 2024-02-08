1. n의 배수

Q. 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

// SOULUTION
class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
             if(num % n == 0) {
            return 1;
        }else {
            return 0;    
        }
    }
}


2.공배수

Q. 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

// SOULUTION
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(number % n ==0) {
            if(number % m ==0){
              return 1;   
            }
        }else {
            return 0;
        }
       return answer;
    }
}



3.홀짝에 따라 다른 값 반환하기

Q. 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

// SOULUTION
  
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
       for(int i=0; i<=n; i++) {
        if(n % 2 != 0 && i % 2 !=0) {
        answer += i;
        } else if (n % 2 == 0 && i  % 2 == 0) {
        answer += i*i;
       } else {
            
        }
       }  return answer;   
    }
}


4. 조건 문자열

Q. 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.

// SOLUTION
  
두 수가 n과 m이라면
">", "=" : n >= m
"<", "=" : n <= m
">", "!" : n > m
"<", "!" : n < m
두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.

  class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer=0;
                
if (ineq.equals(">")  && eq.equals("!")) {
    System.out.println(123);
    if (n > m) {
        answer= 1; 
    }else { answer= 0; 
        }
    }
   
if (ineq.equals(">") && eq.equals("=")) {
    if (n >= m) {
        answer= 1; 
    } else { answer= 0; 
         }
    }
        
if (ineq.equals("<") && eq.equals("!")) {
    if (n < m) {
        answer= 1; 
    } else { answer= 0; 
          }
     } 
        
if (ineq.equals("<")  && eq.equals("=")) {
    if (n <= m) {
        answer= 1; 
   } else{
        answer= 0; 
      }
 }
    return answer;
                  
    }
}


5. flag에 따라 다른 값 반환하기

Q. 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

//SOLUTION
  
  class Solution {
    public int solution(int a, int b, boolean flag) {
      
      
        
        if(flag == true) {
           return a+b; 
        }else  {
           return a-b;
        }
        
    }
}















  
  
