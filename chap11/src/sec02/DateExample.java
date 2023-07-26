package sec02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // 심플데이트 객체 생성
		String strNow2 = sdf.format(now); // format()메소드에 Date 매개값 넣기
		System.out.println(strNow2);

	}

}
