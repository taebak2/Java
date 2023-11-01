function registerCheck() {
	var id = document.frm.id.value;
	var pw = document.frm.pw.value;
	var form = document.querySelector("form");
	var pwCheck = document.frm.pwcheck.value;
	var existingErrorMsg = document.querySelector("#errorMsg");

	if (existingErrorMsg) {
		form.removeChild(existingErrorMsg);
	}

	if (id === "") {
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return;
	}

	if (pw === "") {
		alert("비밀번호를 입력해주세요.");
		document.frm.pw.focus();
		return;
	}

	if (pwCheck === "") {
		alert("비밀번호 확인을 입력해주세요.");
		document.frm.pwcheck.focus();
		return;
	}

	if (pw !== pwCheck) {
		var errorMsg = document.createElement("p");
		errorMsg.id = "errorMsg";
		errorMsg.style.color = "red";
		errorMsg.textContent = "비밀번호가 맞지 않습니다.";
		form.insertBefore(errorMsg, form.querySelector(".email-wrapper"));
		return false;
	}

	if (id != document.frm.dupliId.value) {
		alert("아이디 중복 체크를 다시 해주세요.");
		document.frm.id.focus();
		return;
	}
	if (document.frm.dupliId.value.length === 0) {
		alert("아이디 중복 체크를 해주세요.");
		document.frm.id.focus();
		return;
	}

	document.frm.submit();
}

function idCheck() {
	var url = "idCheckServlet?id=" + document.frm.id.value;
	window.open(url, "_blank", "width=450, height=200, scrollbars=yes");
}

function idOk() {
	opener.frm.id.value = document.idCheckForm.id.value;
	opener.frm.dupliId.value = document.idCheckForm.id.value;
	self.close();
}

function idCheck() {
	var id = document.loginfrm.id.value;
	var pw = document.loginfrm.pw.value;

	if (id) {
		var errorMsg = document.createElement("p");
		errorMsg.id = "errorMsg";
		errorMsg.style.color = "red";
		errorMsg.textContent = "존재하지 않는 아이디입니다.";
		form.insertBefore(errorMsg, form.querySelector(".right"));
		return false;
	}
	if (pw!=1) {
		var errorMsg = document.createElement("p");
		errorMsg.id = "errorMsg";
		errorMsg.style.color = "red";
		errorMsg.textContent = "비밀번호가 틀렸습니다.";
		form.insertBefore(errorMsg, form.querySelector(".right"));
		return false;
	}
	document.loginfrm.submit();

}
