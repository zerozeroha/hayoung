package yunho;

interface Shape {
/*
getArea(): 사각형의 넓이를 계산하여 반환하는 메서드
getPerimeter(): 사각형의 둘레를 계산하여 반환하는 메서드
*/
/*소수점 둘째자리까지라서 double*/
    double getArea();
    double getPerimeter();
}

package yunho;

class Circle implements Shape {
// 접근 제어자 private를 활용한 변수선언
    private double radius; //원의 반지름 저장

//생성자
    public Circle(double radius) {
        this.radius = radius;
    }
//인터페이스 구현
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    } //원의 넓이 계산 -> 반환

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    } //원의 둘레 계산 -> 반환
    
    //일반메서드
    //%.2f : 소수점 둘째 자리까지의 형식으로 출력
    System.out.println("Circle 반지름: " + radius);
    System.out.printf("Circle 넓이 : %.2f" + getArea());
    System.out.printf("Circle 둘레 : %.2" + getPerimeter());
    }
}

package yunho;

class Rectangle implements Shape {
// 접근 제어자 private를 활용한 변수선언
// 사각형의 가로,세로 길이 저장
    private double width;
    private double height;

//생성자
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
//인터페이스 구현
    @Override
    public double getArea() {
        return width * height;
    }//사각형의 넓이 계산 -> 반환

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }//사각형의 둘레 계산 -> 반환
    
    //일반메서드
    System.out.println("Rectangle의 가로 : " + width + "Rectangle의 세로: " + height);
    System.out.printf("Rectangle 넓이 : %.2f" + getArea());
    System.out.printf("Rectangle 둘레 : %.2f" + getPerimeter());
    }
}

package yunho;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 2);
/*
getArea(): 사각형의 넓이를 계산하여 반환하는 메서드
getPerimeter(): 사각형의 둘레를 계산하여 반환하는 메서드
*/
~~** 여기는 집와서 하는데 노트북에 자바 오류나서 혼자하다가 챗지피티 돌렸는데 이렇게 답 나와서 고쳐났고든 내일 아침에 가서 자바로 한 번더 돌려 보고 혼자해볼겝 
        System.out.printf("원의 넓이는 %.2f입니다.\n", circle.getArea());
        System.out.printf("원의 둘레는 %.2f입니다.\n", circle.getPerimeter());
        System.out.printf("사각형의 넓이는 %.2f입니다.\n", rectangle.getArea());
        System.out.printf("사각형의 둘레는 %.2f입니다.\n", rectangle.getPerimeter());
    }
}
