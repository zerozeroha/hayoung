< 문제 > 


2024.03.06
//클라스 이름은 CorrectNumber 

public class CorrectNumber {

	//숫자 맞추기 게임 (1-6의 숫자(정수)를 랜덤으로 한번 뽑은 다음 숫자를 입력받아서 맞추는 게임을 한다. 맞출때 까지 입력하게 하는 코드를 작성하시오 )
		
	//1) "1이상 6이하의 정수를 입력하시오"를 프린트하고 숫자를 입력받는다. 
	//2) 정답을 맞출시에는 "정답입니다"를 프린트하고 루프탈출 / 정답이 아닐시에는 " 1이상 6이하의 정수를 다시 입력하세요"를 출력하고 숫자를 다시 입력받게 한다. 
	//(힌트 : 랜덤으로 뽑는 숫자는 루프문 밖에서 뽑아서 사용한다. Math 클라스의 random()메소드 이용 ) 
	
	public static void main(String[] args) {

}



 < 답 >

 package sohyun;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {
        // 1부터 6까지의 숫자 중 랜덤으로 하나를 선택
    	
    	/*Math.random() : 자바스크립트에서 제공하는 메서드, 0 이상 1 미만의 난수(랜덤한 숫자)를 반환. 
    	반환되는 숫자는 0과 1 사이의 부동소수점 숫자이며, 0은 포함되지만 1은 포함되지 않음. 
    	이 메서드를 사용하면 간단하게 무작위 숫자를 생성할 수 있음.*/
    	
        int random = (int) (Math.random() * 6) + 1;
        Scanner sc = new Scanner(System.in);
        int i = 0;

        // 정답을 맞출 때까지 반복
        while (true) {
            System.out.print("1이상 6이하의 정수를 입력하시오: ");
            i = sc.nextInt();

            // 정답을 맞추면 반복문 종료
            if (i == random) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("1이상 6이하의 정수를 다시 입력하세요.");
            }
        }

    
    }
}



 
