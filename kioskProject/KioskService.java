package kioskProject;

import java.util.*;

public class KioskService {
	Scanner scan = new Scanner(System.in);
	KioskRepository kr = new KioskRepository();
	Long selectNumber = 0L;

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
	public void sideMenu() {
		System.out.println("샷추가를 선택 해 주세요");
		System.out.println("-------------------------------");
		System.out.println("1.1샷추가 | 2.2샷추가 |3.샷추가 없음 ");
		System.out.println("-------------------------------");
		System.out.print("선택>");	
	}
	public void couponSer () {
		System.out.println("적립하시겠습니까");
		System.out.println("-----------------");
		System.out.println("1.예 | 2.아니오 ");
		System.out.println("-----------------");
		System.out.print("선택>");
		selectNumber = scan.nextLong();
		while(true) {
		if (selectNumber == 1L) {
			System.out.println("적립 할 번호를 입력해주세요");
			break;
		}else{
			System.out.println("주문해주셔서 감사합니다");
			order();
			}
		}
	}	
	public void select() {
		kr.save();
		String beverege = kr.selectBeverege(selectNumber);
		sideMenu();
		selectNumber = scan.nextLong();
		String shot = kr.sideMenu(selectNumber);
		System.out.println(beverege + shot + "를 선택 했습니다.");
		Long totalPrice = kr.totalPrice(beverege, shot);
		System.out.println("총 금액은 " + totalPrice + " 원 입니다");
		couponSer ();
		String mobile = scan.next();
		KioskDTO orderDetail = new KioskDTO(mobile, beverege, shot, totalPrice, 0);
		kr.saveDetail(orderDetail);
		kr.coupon(mobile);
	}
	public void orderDetail() {
		String mobile = null;
		System.out.println("조회 할 번호를 입력 해주세요");
		mobile = scan.next();
		kr.detail(mobile);

	}
}
