package sec02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��"); // ���õ���Ʈ ��ü ����
		String strNow2 = sdf.format(now); // format()�޼ҵ忡 Date �Ű��� �ֱ�
		System.out.println(strNow2);

	}

}
