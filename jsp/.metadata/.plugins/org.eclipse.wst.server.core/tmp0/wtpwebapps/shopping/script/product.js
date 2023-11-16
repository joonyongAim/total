function productCheck() {
	if(document.frm.name.value.length == 0) {
		alert("상품명 입력하세요");
		frm.price.focus();
		
		return false;
	}
	
	if(isNaN(document.frm.price.value)) {
		alert("가격은 숫자만 입력하세요");
		frm.price.focus();
		
		return false;
	}
	
	return true;
}