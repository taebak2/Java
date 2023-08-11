package sec02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("c:/temp/primitive.db"); // 파일에 데이터를 출력하기 위한 스트림
		DataOutputStream dos = new DataOutputStream(fos); // 기본 데이터 타입(primitive data types)을 이진 형태로 파일에 출력하는 스트림

		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush();
		dos.close();

		FileInputStream fis = new FileInputStream("c:/temp/primitive.db"); // 입력 스트림 : 데이터를 읽어오는데 사용되는 스트림
		DataInputStream dis = new DataInputStream(fis);

		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close();
	}

}
