문제
/*	public static void main(String[] args) {
	
	  자료구조 공부!!
	  자료 구조 중 큐는 자료 구조의 한 형태로 자료의 입력과 출력이 한 방향으로만 이루어지는 선형 자료형으로 선입선출 방식으로
	  자료의 입출력을 관리 합니다. 즉, 먼저 들어온 자료가 먼저 나가는 방식 입니다. 

	 https://wooono.tistory.com/395 <-- 사이트에 큐 작동 방식 참고!!

	 ArrayList를 사용해서 큐 작동 방식을 구현해 주세요!!
	 메인 메소드 부분은 건들 필요 없이 메서드 2개만 만들어 주세면 됩니다!
	 클래스명은 Queue로 해주세요!

	/*
	import java.util.*;

	public class Queue {

	 //여기에 전역변수로 리스트 선언
	 
		public static void main(String[] args) {
	    Queue q = new Queue();
			System.out.println("큐에 원소 추가");
			System.out.println("--------------");
			q.push(0);
			q.push(1);
			q.push(2);
			
			System.out.println("큐에서 원소 제거");
			System.out.println("--------------");
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println();
			
			System.out.println("큐에서 원소 제거");
			System.out.println("--------------");
	  }
		
		//큐에 요소를 넣는 메서드 - 메서드 명은 push, 타입은 void 메서드 로 만들어 주세요!!
	  
		
		//큐에서 요소 빼기 - 메서드명은 pop, 메서드 타입은 Integer로 만들어 주세요!!


	}

	---------------------------------------------
	<출력>
	큐에 원소 추가
	--------------
	0
	1
	2

	큐에서 원소 제거
	--------------
	0
	1
	2 */

풀이
package hyerin;

import java.util.ArrayList;

public class Queue {
	 //여기에 전역변수로 리스트 선언
	private ArrayList<Integer> queue = new ArrayList<>();
	private ArrayList<Integer> list;
	
	/* ArrayList에 Integer를 사용하는 이유는 큐에 저장할 데이터가 정수형이기 때문. 큐는 데이터를 순서대로 저장하고, 
	순서를 유지해야 하기 때문에 정수형 데이터를 저장하기 위해 ArrayList<Integer>를 사용 */


	 // 큐에 요소를 넣는 메서드
	public void push(int item) {
		list.add(item); // add()메서드를 사용 -> 요소추가
	}
	/* item : 큐에 추가할 정수형 데이터를 가리킴.
	 이 메서드는 받은 정수 item을 큐의 끝에 추가하는 역할.
	 예를 들어, push(5)를 호출하면 숫자 5가 큐에 추가*/
	
	// 큐에서 요소를 빼는 메서드
	//pop() 메서드 : 큐에서 요소를 제거하고 그 값을 반환하는 역할
	public Integer pop() {
        if (isEmpty()) { // pop() 메서드가 호출되면 먼저 isEmpty() 메서드를 사용하여 큐가 비어 있는지 확인
        // isEmpty() 메서드는 큐가 비어 있다면 true를 반환하고, 비어 있지 않다면 false를 반환
            throw new IllegalStateException("Queue is empty");
           // 큐가 비어 있다면 ->throw new IllegalStateException("Queue is empty"); 문장이 실행되어 예외를 발생
        }
        return list.remove(0); //  remove(0) : 리스트의 첫 번째 요소를 제거하는 메서드
        // 큐가 비어 있지 않다면 list.remove(0); 문장이 실행되어 리스트의 맨 앞 요소를 제거하고 그 값을 반환
    }
	// 메서드는 제거된 요소의 값을 반환하고 종료
	 
		private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
		public static void main(String[] args) {
		
	    Queue q = new Queue();
			System.out.println("큐에 원소 추가");
			System.out.println("--------------");
			q.push(0);
			q.push(1);
			q.push(2);
			
			System.out.println("큐에서 원소 제거");
			System.out.println("--------------");
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println();
			
			System.out.println("큐에서 원소 제거");
			System.out.println("--------------");	
	}
}

 혜린아 근데 나 public static void main(String[] args) 여기부분이 오류 걸리는데 혹시 봐줄 수 있니~?!
