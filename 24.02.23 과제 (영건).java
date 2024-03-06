package younggun;

public abstract class Employee {


	//매개변수
	public String name;
	public String job;
	public int empNo;
	public int pay;

	//생성자
	public Employee(String name,String job,int empNo,int pay) {
		this.name = name;
		this.job = job;
		this.empNo = empNo;
		this.pay = pay;
}
	
	//일반 메서드
		public void sogae() { System.out.println(this.name+"의 직책은 "+this.job+"사원번호는"+this.empNo+"입니다."); }
		public void project()  { System.out.println("프로젝트를 진행하고 있습니다."); }

	
	//추상 메서드
	    public abstract void gaebal();
	    public abstract void promotion();
	    public abstract void don();

}
package younggun;


//상속 받은 변수
public class James extends Employee {
	

	public James(String name, String job, int empNo, int pay) {
		super(name, job, empNo, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gaebal() {
		System.out.println("Java 개발을 하고 있습니다.");
		System.out.println("Python 개발을 하고 있습니다.");
	}

	@Override
	public void promotion() {
		System.out.println("내년에 승진입니다.");
	}

	@Override
	public void don() {
	System.out.println("과장님의 월급은 3000000원 입니다.");
	}
	
}

package younggun;

public class Tomas extends Employee {

	public static Tomas tomas;

	public Tomas(String name, String job, int empNo, int pay) {
		super(name, job, empNo, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gaebal() {
		System.out.println( "React 개발을 하고 있습니다.");	
		System.out.println( "Java script 개발을 하고 있습니다.");	
	}

	@Override
	public void promotion() {
	System.out.println("내년에 승진하지 못합니다.");		
	}

	@Override
	public void don() {
	System.out.println("대리님의 월급은 2000000원 입니다.");
	}

}
package younggun;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("----직원 정보 ---");
		System.out.println();
		
		James james = new James("손흥민","과장",120,3000000);
		james.sogae();
		james.project();
		james.gaebal();
		james.promotion();
		james.don();
		
		Tomas tomas = new Tomas("김민재","대리",127,2000000);
		tomas.sogae();
		tomas.project();
		tomas.gaebal();
		tomas.promotion();
		tomas.don();
	}

}


