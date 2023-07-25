import java.util.Calendar;

public class Cal {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY); // 시간
        int min = cal.get(Calendar.MINUTE); // 분
        System.out.println("현재 시간은 " + hour + "시 " + min + "분");
        if(hour>=4 && hour<12){
            System.out.println("Good Morning");
        }
        else if(hour>=12 && hour<18){
            System.out.println("Good Afternoon");
        }
        else if(hour>=18 || hour<4){
            System.out.println("Good night");
        }
    }
}