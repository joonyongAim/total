package 상품관리;
// 현재 판매 중인 상품들 관리하는 클래스
public class Inventory {
	
	Product[] products;
	int numProducts; // 상품 수
	
	public Inventory(int maxSize) {
		products = new Product[maxSize];
	}
	
	public void addProduct(Product p) {
		
		if(numProducts == products.length) {
			System.out.println("더이상 추가할 수 없음");
			return;
		}
		
		products[numProducts] = p;
		numProducts++;
		
		System.out.println("상품추가가 완료");
		
	}
	
	// 전체 상품 조회 메서드
	public void getAllProduct() {
		
		if(numProducts == 0) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		}
		
		for(int i=0; i<numProducts; i++) {
			
			Product p = products[i];
			
			System.out.println("상품ID : " + p.getProductId());
			System.out.println("상품명 : " + p.name);
			System.out.println("상품가격 : " + p.getPrice());
			System.out.println("재고 : " + p.stock);
			System.out.println("---------------------");
		}
	
	}
	
	public void sellProduct(String productId, int stock) {
		
		int index = findProductIndex(productId);
		
		if(index == -1) {
			System.out.println("상품이 없음");
			return;
		}
		
		Product p = products[index];
		p.sell(stock);
	
	}
	
	// productId에 해당하는 배열방 번호 검색하는 메서드
	public int findProductIndex(String productId) {
		
		for(int i=0; i<numProducts; i++) {
			if(products[i].getProductId().equals(productId)) {
				return i;
			}
		}
		return -1;
	}

}
