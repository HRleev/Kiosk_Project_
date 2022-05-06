package kioskProject;

import java.util.*;

public class KioskRepository {
	Scanner scan = new Scanner(System.in);
	List<BeveregeDTO> beveregeList = new ArrayList<>();
	List<DetailDTO> odList = new ArrayList<>();
	List<KioskDTO> saveDetailList = new ArrayList<>();
	Long selectNumber = 0L;
	Long beveregePrice = 0L;
	Long beveregePrice1 = 0L;
	Long Price = 0L;
	Long totalPrice = 0L;
	String beverege = null;
	String mobile = null;
	String shot = "샷추가없음";
	KioskDTO saveDetail = null;
	int couponReturn=0;
	int coupon = 1;
	static Long id = 0L;

	public void save() {
		BeveregeDTO americano = new BeveregeDTO(1L, "아이스아메리카노", 2000L);
		beveregeList.add(americano);
		BeveregeDTO vanilla = new BeveregeDTO(2L, "바닐라라떼", 3200L);
		beveregeList.add(vanilla);
		BeveregeDTO latte = new BeveregeDTO(3L, "카페라떼", 2700L);
		beveregeList.add(latte);
		BeveregeDTO cappuccino = new BeveregeDTO(4L, "카푸치노", 2700L);
		beveregeList.add(cappuccino);
		BeveregeDTO macchiato = new BeveregeDTO(5L, "카라멜마끼아또", 2700L);
		beveregeList.add(macchiato);
		BeveregeDTO shot1 = new BeveregeDTO(6L, "1샷추가", 500L);
		beveregeList.add(shot1);
		BeveregeDTO shot2 = new BeveregeDTO(7L, "2샷추가", 1000L);
		beveregeList.add(shot2);
		BeveregeDTO shot3 = new BeveregeDTO(8L, "샷추가 없음", 0L);
		beveregeList.add(shot2);

	}

	public String selectBeverege(Long selectNumber) {
		save();
		for (int i = 0; i < beveregeList.size(); i++)
			if (selectNumber.equals(beveregeList.get(i).getId())) {
				beverege = beveregeList.get(i).getMenu();
			}
		System.out.println(beverege + "를 선택 했습니다");
		return beverege;
	}

	public String sideMenu(Long selectNumber) {
		System.out.println("샷추가를 선택 해 주세요");
		System.out.println("-------------------------------");
		System.out.println("6.1샷추가 | 7.2샷추가 |8.샷추가 없음 ");
		System.out.println("-------------------------------");
		System.out.print("선택>");
		selectNumber = scan.nextLong();
		if (selectNumber == 6L) {
			for (int j = 0; j < beveregeList.size(); j++) {
				if (selectNumber.equals(beveregeList.get(j).getId())) {
					shot = beveregeList.get(j).getMenu();
				}
			}
			System.out.println(shot + "를 선택 했습니다");
		} else if (selectNumber == 7L) {
			for (int j = 0; j < beveregeList.size(); j++) {
				if (selectNumber.equals(beveregeList.get(j).getId())) {
					shot = beveregeList.get(j).getMenu();
				}
			}
			System.out.println(shot + "를 선택 했습니다");
		} else if (selectNumber == 8L) {
			for (int j = 0; j < beveregeList.size(); j++) {
				if (selectNumber.equals(beveregeList.get(j).getId())) {
					shot = beveregeList.get(j).getMenu();
				}
			}
			System.out.println("샷추가 없음");
		}return shot;
	}

	public Long totalPrice(String beverege, String shot) {
		int a = 0;
		for (int i = 0; i < beveregeList.size(); i++) {
			if (beverege.equals(beveregeList.get(i).getMenu())) {
				beveregePrice = beveregeList.get(i).getPrice();
			}
		}
		for (int i = 0; i < beveregeList.size(); i++) {
			if (shot.equals(beveregeList.get(i).getMenu())) {
				beveregePrice1 = beveregeList.get(i).getPrice();
			}
		}

		totalPrice = beveregePrice + beveregePrice1;
		return totalPrice;
	}

	public int coupon() {
		System.out.println("적립하시겠습니까");
		System.out.println("-----------------");
		System.out.println("1.예 | 2.아니오 ");
		System.out.println("-----------------");
		System.out.print("선택>");
		selectNumber = scan.nextLong();
		
		if (selectNumber == 1L) {
			System.out.println("적립 할 번호를 입력해주세요");
			mobile = scan.next();
			for (int i = 0; i < saveDetailList.size(); i++) {
				if (mobile.equals(saveDetailList.get(i).getMobile())) {
					coupon = saveDetailList.get(i).getCoupon();
					saveDetailList.get(i).setCoupon(++coupon);
					
				} else if (selectNumber == 2) {
				}
			}			
		}return coupon;
	}

	public KioskDTO orderDetail(String mobile) {
		int a = 0;
		for (int i = 0; i < saveDetailList.size(); i++) {
			if (mobile.equals(saveDetailList.get(i).getMobile())) {
				a = i;

			} else {
				System.out.println("전화번호를 확인해주세요");
			}
		}
		return saveDetailList.get(a);

	}
}
