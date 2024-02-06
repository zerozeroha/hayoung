// 1.덧셈식 출력하기

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

// 2. 문자열 붙여서 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.print(a+b);
    }
}

// 3. 문자열 돌리기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String [] list = a.split("") ;
        
        for(int i=0; i<list.length; i++) {
             System.out.println(list[i]);
        }
        
       
    }
}

// 4. 홀짝 구분하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         
            if(n%2==0) {
               System.out.print(n + " is even"); 
            } else {
                System.out.print(n + " is odd"); 
            }
    }
}

//5. 문자열 겹쳐쓰기
class Solution {
    public String solution(String my_string, String overwrite_string, int s) { 
        String answer=my_string.substring(0,s)+overwrite_string;
		
		if(my_string.length()>answer.length()) {
			answer += my_string.substring(answer.length());
		}
		
		System.out.println(answer);
		
        return answer;
    }
}




