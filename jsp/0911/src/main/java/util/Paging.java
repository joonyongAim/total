package util;

public class Paging {
	int page = 1; // 현재 페이지
	int totalPage; // 전체 페이지
	int total; // 전체 레코드 수
	int start; // 페이지 별 표시할 게시물의 시작 번호
	int end; // 페이지 별 표시할 게시물의 끝 번호
	int showRow = 5; // 페이지당 표시할 개수
	int showNum = 3; // 블럭당 개수
	
	
	
	public int getPage() {
		return page;
	}



	public void setPage(int page) {
		this.page = page;
	}



	public int getTotalPage() {
		return totalPage;
	}



	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public int getStart() {
		return start;
	}



	public void setStart(int start) {
		this.start = start;
	}



	public int getEnd() {
		return end;
	}



	public void setEnd(int end) {
		this.end = end;
	}



	public int getShowRow() {
		return showRow;
	}



	public void setShowRow(int showRow) {
		this.showRow = showRow;
	}



	public int getShowNum() {
		return showNum;
	}



	public void setShowNum(int showNum) {
		this.showNum = showNum;
	}



	public void pageCalc(int total) {
		this.total = total;
		
		totalPage = (int)Math.ceil((double)total / showRow);
		
		start = (page - 1) * showRow + 1;
		end = start + (showRow - 1);
	}
}
