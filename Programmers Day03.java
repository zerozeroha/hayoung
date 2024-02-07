1. 문자열 섞기

< String substring (int start.int end)>
: 지정된 범위 내의 문자열을 String으로 반환.
시작위치(start)지점만 지정하면 끝까지 반환. 끝자리 : (int end-1)
//예제
StringBuffer sb = new StringBuffer ("0123456")
    String str = sb. substring(3); // 결과 :  str = "3456"
    String str = sb. substring(3,5); // 결과 : str = "34"


Q. 길이가 같은 두 문자열 str1과 str2가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

// SOLUTION
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

< 결과값 >
입력값 〉	"aaaaa", "bbbbb"
기댓값 〉	"ababababab" 



2. 문자리스트를 문자열로 변환하기

Q. 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

// SOLUTION
class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        for( int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }        
        return answer;
    }
}

< 결과값 >
입력값 〉	["a", "b", "c"]
기댓값 〉	"abc" 



3. 문자열 곱하기

Q. 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

// SOLUTION
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        for ( int i=0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}

< 결과값 >
입력값 〉	"string", 3
기댓값 〉	"stringstringstring"

테스트 2
입력값 〉	"love", 10
기댓값 〉	"lovelovelovelovelovelovelovelovelovelove"  



4. 더 크게 합치기

< ValueOf() >
 : ()괄호 안의 해당 객체를 String 객체로 변환시키는 역활을 함.( 말그대로 String의 객체로 형변환 ) 
    예를들어 정수인 int a=5; 라면 이것을 String의 객체로 표현하고 싶으면 valueOf(5); 를 이용하면 5라는 정수는 String이라는 "5" 로 인식하게 됨.
    이렇듯 어떤 객체를 String으로 형변환하는 valueOf() 메소드.
//예제
int a = 5;
String a = String.ValueOf(5);

< Integer.parseInt() >
: 문자열을 숫자로 변환시키는 방법
 parseInt 함수 = Integer 클래스의 static 함수
//예제
String strNum1 = new String("1234");
String strNum2 = new String("4321");

int num1 = Integer.parseInt(strNum1);
int num2 = Integer.parseInt(strNum2);

System.out.println(num1 + num2);
< 결과값 >: 5555 
    : parseInt()를 사용하면 String에서 int로 바껴서 문자열 타입의 "1234"를 숫자로 변형해줌.
    
Q. 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다. 

// SOLUTION
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

< 결과값 >
테스트 1
입력값 〉	9, 91
기댓값 〉	991

테스트 2
입력값 〉	89, 8
기댓값 〉	898 



//5. 두 수의 연산값 비교하기

< toString() >
 : 해당 인스턴스에 대한 정보를 문자열로 반환 > 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드.
    (일반 규약은 '간결하면서 사람이 읽기 쉬운 형태의 유익한 정보' 를 반환하는 것)

Q. 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

// SOLUTION    
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

< 결과값 > 
테스트 1
입력값 〉	2, 91
기댓값 〉	364

테스트 2
입력값 〉	91, 2
기댓값 〉	912






