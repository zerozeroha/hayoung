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

>> %(나머지연산)를 써서 0이되면 배수라는 것을 이용

    
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

>> n의 배수이면서 m의 배수이기 때문에 중첩if문을 사용

    
3.홀짝에 따라 다른 값 반환하기

Q. 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

// SOULUTION
  
class Solution {
    public int solution(int n) {
        int answer = 0;
          
       for(int i=0; i<=n; i++) {
        if(n % 2 != 0 && i % 2 != 0) {
        answer += i;
        } else if (n % 2 == 0 && i % 2 == 0) {
        answer += i*i;
       } else {
            
        }
       }  return answer;   
    }
}

>> < 논리연산자 >

 A	      B	    A && B	A || B  !A
TRUE	TRUE	TRUE	TRUE	FALSE
TRUE	FALSE	FALSE	TRUE	FALSE
FALSE	TRUE	FALSE	TRUE	TRUE
FALSE	FALSE	FALSE	FALSE	TRUE

: &&은 양쪽이 true여야 true이기 때문에 
    n이 홀수면서 n이하의 모든 i값들의 합을 동시에 구해줄 수 있음.

   < else if > 
자바에서 else if는 if 문의 확장된 형태로, 이전의 if 조건이 거짓일 때 추가적인 조건을 검사하는데 사용됨.
즉, if 조건이 거짓일 때만 실행되며, 이후의 else if나 else 블록에서 추가적인 조건을 검사할 수 있음.

    
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

>> < equals() >
    
자바에서 equals()는 Object 클래스의 메서드로, 객체의 내용을 비교하는데 사용됨.
일반적으로 문자열 비교에 많이 사용되며, String 클래스에서는 equals()가 문자열의 내용을 비교하는 메서드로 재정의되어 있음.

예를 들어, 두 개의 String 객체가 있을 때 이들이 동일한 문자열을 가지고 있는지를 확인하려면 equals() 메서드를 사용할 수 있습니다.
이 메서드는 문자열의 실제 내용을 비교하므로, 두 String 객체가 같은 문자열을 가지고 있으면 true를 반환하고, 그렇지 않으면 false를 반환합니다.



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















  
  
