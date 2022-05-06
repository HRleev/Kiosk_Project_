package kioskProject;

import java.util.*;

public class KioskService {
	Scanner scan = new Scanner(System.in);
	KioskRepository kr = new KioskRepository();
	Long selectNumber = 0L;
	List<BeveregeDTO> beveregeList = new ArrayList<>();
	List<DetailDTO> odList = new ArrayList<>();
	List<KioskDTO> saveDetailList = new ArrayList<>();
	String mobile = null;
	Long totalPrice = 0L;
	String beverege = null;
	String shot = "샷추가없음";
	int coupon = 1;
	List<BeveregeDTO> result = null;

	public void order() {
		System.out.println("주문하실 음료를 선택 해 주세요");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1.아이스 아메리카노 | 2.바닐라라떼 |3.카페라떼 |4.카푸치노 | 5.카라멜 마끼아또");
		System.out.println("----------------------------------------------------------------");
		System.out.print("선택>");
		selectNumber = scan.nextLong();

		if (selectNumber == 1L) {
			select();	
		} else if (selectNumber == 2L) {
			select();
		} else if (selectNumber == 3L) {
			select();

		} else if (selectNumber == 4L) {
			select();
		} else if (selectNumber == 5L) {
			select();
		}
	}
	public void select() {
		kr.save();
		beverege = kr.selectBeverege(selectNumber);
		shot =kr.sideMenu(selectNumber);
		System.out.println(beverege + shot + "를 선택 했습니다.");
		DetailDTO detailList = new DetailDTO(beverege, shot, 0L);
		odList.add(detailList);
		totalPrice = kr.totalPrice(beverege,shot);
		System.out.println("총 금액은 " + totalPrice + " 원 입니다");
		coupon =kr.coupon();
		System.out.println("적립된 쿠폰은 " + coupon + "개 입니다");
		KioskDTO orderDetail = new KioskDTO(mobile, beverege, shot, totalPrice, coupon);
		saveDetailList.add(orderDetail);
	}

	public void orderDetail() {
		System.out.println("조회 할 번호를 입력 해주세요");
		mobile = scan.next();
		KioskDTO result = kr.orderDetail(mobile);
		System.out.println(result);
	}

}
