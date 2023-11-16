function loginCheck() {
	if(document.frm.userid.value.length == 0) {
		alert("아이디를 써주세요");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value == "") {
		alert("비밀번호를 입력하세요")
		frm.userid.focus();
		return false;
	}
}



function idCheck() {
	if(document.frm.userid.value == "") {
		alert("아이디를 입력하세요");
		document.frm.userid.focus();
		return;
	}
	
	const url = "idCheck.do?userid=" + document.frm.userid.value;
	
	window.open(url, "_blank_1",
	"toolbar=no, menubar=no, scrollbar=yes, resizable=no, width=450, height=200");
}

function idok() {
	
	const checkId = document.querySelector('.checkId');
	
	if(checkId.innerText != document.frm.userid.value) {
		alert("중복체크해주세요~~");
		return;
	}
	
	opener.frm.userid.value = document.frm.userid.value;
	opener.frm.reid.value = document.frm.userid.value;
	
	self.close();
}

function joinCheck() {
	if(document.frm.name.value.length == 0) {
		alert("이름을 입력하세요.");
		frm.name.focus();
		
		return false;
	}
	
	if(document.frm.userid.value.length == 0) {
		alert("아이디를 입력하세요.");
		frm.userid.focus();
		
		return false;
	}
	
	if(document.frm.userid.value.length < 4) {
		alert("아이디는 4글차이상으로 입력하세요.");
		frm.userid.focus();
		
		return false;
	}
	
	if(document.frm.pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		frm.pwd.focus();
		
		return false;
	}
	
	if(document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("비밀번호가 일치하지 않습니다.");
		frm.pwd.focus();
		
		return false;
	}
	
	if(document.frm.reid.value.length == 0 || document.frm.userid.value != document.frm.reid.value) {
		alert("중복 체크를 하지 않았습니다.");
		frm.userid.focus();
		
		return false;
	}
	
	return true;
	
}