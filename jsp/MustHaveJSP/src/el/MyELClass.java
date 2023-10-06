package el;

public class MyELClass {
	
	public String getGender(String jumin) {
		String returnStr="";
		
		// 예) 주민번호 991205-1133251
		int beginIdx = jumin.indexOf("-") + 1;	// 해당 문자열에서 지정한 문자열이나 문자가 처음으로 나타나는 인덱스를 찾음
		String genderStr = jumin.substring(beginIdx, beginIdx+1);
		int genderInt = Integer.parseInt(genderStr);
		
		if(genderInt==1 || genderInt==3) {
			returnStr = "남자";
		} else if(genderInt==2 || genderInt==4){
			returnStr = "여자";
		} else {
			returnStr = "주민번호 오류";
		}
		
		return returnStr;
	}
	public String getId(String email) {
		int beginIndex = email.indexOf("@");
		String emailStr = email.substring(0,beginIndex);
		return emailStr;
	}
}
