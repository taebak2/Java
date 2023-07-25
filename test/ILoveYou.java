import java.util.Scanner;

public class ILoveYou {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String text = s.nextLine();

        for (int i = 0; i < text.length(); i++) {
            String a = text.substring(1);
            String b = text.substring(0, 1);
            text = a + b;
            System.out.println(text);

        }
    }
}
