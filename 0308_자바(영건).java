package ex07;

import java.util.Scanner;

class Result {
    public static final int WIN = 0;
    public static final int LOSE = 1;
    public static final int DRAW = 2;
}

public class ex {

    public static void main(String[] args) {

        System.out.println("가위 바위 보!");
        System.out.print("나 -> ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int s = (int) (Math.random() * 3);
        String[] z = {"묵", "찌", "빠"};
        String b = z[s];

        int result = getResult(a, b);
        switch (result) {
            case Result.WIN:
                System.out.println("이겼습니다!");
                break;
            case Result.LOSE:
                System.out.println("졌습니다.");
                break;
            case Result.DRAW:
                System.out.println("비겼습니다.");
                break;
        }
    }

    private static int getResult(String a, String b) {
        if (a.equals(b)) {
            return Result.DRAW;
        } else if ((a.equals("묵") && b.equals("찌")) || (a.equals("찌") && b.equals("빠")) || (a.equals("빠") && b.equals("묵"))) {
            return Result.WIN;
        } else {
            return Result.LOSE;
        }
    }
}
