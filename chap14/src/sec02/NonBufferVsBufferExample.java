package sec02;

import java.io.*;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {

		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath(); // getResource : 파일 가져옴, getPath() : 경로
		String targetFilePath1 = "C:/Temp/targetFile1.jpg"; // 타겟
		FileInputStream fis = new FileInputStream(originalFilePath1); // 원본 이미지 파일 읽기
		FileOutputStream fos = new FileOutputStream(targetFilePath1); // 대상 파일 출력

		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않을 때 : " + nonBufferTime + "ns");

		
		 long BufferTime = copy(bis, bos); System.out.println("버퍼를 사용했을 때 : \t\t" +BufferTime + "ns");
		 
	}

	static int data = -1;

	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while (true) {
			data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);
	}

}
