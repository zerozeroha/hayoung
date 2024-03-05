package hyunjun;

import java.util.ArrayList;
import java.util.Scanner;

public class person {
	

	public static void main(String[] args) {
		
		 ArrayList<personperson> list = new ArrayList<personperson>();

		
		
		
		
		System.out.println();
		
	exit:while(true) {
		System.out.println("============ MENU ===========");
		System.out.println("1>정보추가 / 2>정보삭제 / 3>전체정보 보기 / etc>종료");
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >>");
		int number=sc.nextInt();
		personperson p1;
		switch(number) {
		case 1:
			p1 = new personperson();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("=========== 정보 추가 ===========");
			System.out.println("이름 입력 :");
			p1.setName(sc.next());
			
			System.out.println("나이 입력 :");
			p1.setAge(sc.nextInt());
			
			System.out.println("전화번호 입력 :");
			p1.setTel(sc.next());
			
			list.add(p1); // P1의 정보가 들어갈 수 있음
			break;
		case 2:
			System.out.println("=========== 정보 삭제 ===========");
		    System.out.print("삭제할 대상의 이름을 입력하세요 :");
		    String name = sc.next();
		    for (int i=0; i<list.size(); i++ ) {//Arraylist는 length가 아니라 size로 배열크기 판별
		    	if(list.get(i).getName().equals(name)) {//get(i)은 해당 인덱스값(i)을 불러온다.String이라서 .equals()로 비교
		    		list.remove(i);//remove는 삭제하는 기능
		    	}
		    } 
		    System.out.println("삭제 완료");
		    break;
		case 3:
			for (int i=0; i<list.size(); i++ ) {
				System.out.print("[이름 : "+list.get(i).getName());
				System.out.print("/ 나이 : "+list.get(i).getAge());
				System.out.print("/ 전화번호 : "+list.get(i).getTel() + "]");
				System.out.println();
		    }
			break;
			default :
				System.out.println("시스템 종료");
				break exit;
		}
			
	}
		
	}

}

package hyunjun;

public class personperson {
	
	    private String name;
	    private int age;
	    private String tel;
	    
		
		public personperson() {
		
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
	
		/*
		 getter : 메인함수에서 데이터를 내보낼 때 쓰는 함수(가져온다)
		 setter : 메인함수의 데이터를 가져와서 변수의 값을 변경하는 함수(수정한다)
		 */

}
