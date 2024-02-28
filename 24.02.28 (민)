package min;

public class product{

	//상품번호, 상품명, 회사명, 가격, 출고상품 횟수
	//변수명은 자유롭게
	//private 변수 선언
	private int mNum = 0;
	private int	mPrice = 0;
	private String mName = null;
	private String mwhere;
	private static int count = 0;
	
	

	//생성자
	public product(String prduct, String com, int price) {
			this.mName = prduct;
			this.mwhere = com;
			this.mPrice = price;
		    count++; // count에서 하나씩 늘어나는 거
			this.mNum = count + 1199;
		}

	public static int getCount() {
		   
			return count;
		}
	
    
 
	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	@Override
	public String toString() {
		return "product1 [mNum="+ this.mNum +" mName=" + this.mName + ", mwhere=" + this.mwhere + ", mPrice=" + this.mPrice + "원"+"]";
	}

	
	//getter, setter
	

	}
package min;

public class main {
	
	public static void main(String[] args) {
	/*
Product클래스를 디자인해보자.
멤버변수 : 일련번호(1200부터 1씩 증가 되는 값을 저장), 상품명, 제조사, 가격
static variable : 생성된 제품 수 (count)

1. 일련번호는 static count를 이용해서 상품이 생성될 때 1200부터 1씩 증가되는 값을 저장한다.
2. 멤버변수는 private멤버로 선언한다.


출력만되면 됨
실행예시----------------------------------------------------------------------

[출고 리스트​]

1200.    새우깡      농심(주)        1900원
1201.    빼빼로      롯데제과        2200원
1202.    먹태깡      농심(주)        2500원 
-------------------------------------

출고 상품 : 3건


-----------------------------------------------------------------------------------------*/
// 객체 생성
		product product1 = new product("새우깡","농심(주)" , 1900);
		product product2 = new product("빼빼로", "롯데제과", 2200);
		product product3 = new product("먹태깡", "농심(주)", 2500);
		
		System.out.println(product1.toString());
		System.out.println(product2.toString());
		System.out.println(product3.toString());
		
		System.out.println("출고상품 :" + product.getCount() + "건");
		
		
		


	}



}

