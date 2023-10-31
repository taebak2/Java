function registerCheck() {
	var id = document.frm.id.value; // console창에서 document.frm.id.value 엔터
	var pw = document.frm.pw.value;
	var form = document.querySelector("form") // form태그라 큰따옴표 붙여야함
	var pwcheck = document.frm.pwcheck.value;
	var existingErrorMsg = document.querySelector("#errorMsg"); // 비밀번호가 맞지 않을 때 errorMsg.id의 속성값을 가져옴
	
	if(existingErrorMsg){
		form.removeChild(existingErrorMsg);
	}
	
	if(id === ""){ // === 타입까지 일치!					
		alert("아이디를 입력해주세요");
		document.frm.id.focus();
		return;
	}
	if(pw === ""){					
		alert("비밀번호를 입력해주세요");
		document.frm.pw.focus();
		return;
	}
	if(pwcheck === ""){					
		alert("비밀번호 확인을 입력해주세요");
		document.frm.pwcheck.focus();
		return;
	}
	
	if(pw !== pwcheck){
		var errorMsg = document.createElement("p"); 
		errorMsg.id = "errorMsg"; 
		errorMsg.style.color = "red";
		errorMsg.textContent = "비밀번호가 맞지 않습니다.";
		form.insertBefore(errorMsg, form.querySelector(".email-wrapper")) 
		return false;
	}
	
	document.frm.submit();
	
	// 비밀번호가 맞지 않을 경우에만 생성 
	// document.createElement : 새로운 HTML 엘리먼트(태그)를 동적으로 생성
	// errorMsg.id : errorMsg라는 변수를 가진 오류 메시지 엘리먼트에 id 속성을 "errorMsg"로 설정
	// 나중에 JavaScript에서 document.getElementById("errorMsg")와 같은 메서드를 사용하여 선택할 수 있음 
	// form.removeChild : 특정 자식 엘리먼트를 제거할 때 사용
	
}