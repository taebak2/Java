package sec02;

public class continue예제2 {
	/* continue는 생략~ , i의 나머지다. */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // 1부터 10까지 10번 반복
			if (i % 15!= 0) {   //i가 홀수면 continue => 생략
				continue;       //if(i%3!=0){continue; if(i%5!=0){continue;}}
			}			        //if(i%3!=0 ||i%5!=0){continue;}
			System.out.println(i);
		}
	}

}
