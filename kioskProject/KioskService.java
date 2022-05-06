package kioskProject;

import java.util.*;

public class KioskService {
	Scanner scan = new Scanner(System.in);
	KioskRepository kr = new KioskRepository();
	Long selectNumber = 0L;
	List<BeveregeDTO> beveregeList = new ArrayList<>();
	String mobile =null;
	public void order() {

		kr.order();
		
	}

	public void orderDetail() {
		System.out.println("조회 할 번호를 입력 해주세요");
		mobile =scan.next();
		KioskDTO result = kr.orderDetail(mobile);
		System.out.println(result);
	}



	


	
	


}
