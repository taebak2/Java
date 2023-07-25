import java.util.Scanner;

public class SplitExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("게임을 시작합니다.");
        String game;
        A:while (true) {
            System.out.print(">>");
            game = s.nextLine();
            String[] result = game.split(" ");
            if (game.equals("그만")) {
                break A;
            }
            System.out.println("어절 개수는 " + result.length);

        }
        System.out.println("종료합니다...");


    }

}










