package kioskProject;

import java.util.*;

public class KioskRepository {
	Scanner scan = new Scanner(System.in);
	List<BeveregeDTO> beveregeList = new ArrayList<>();
	List<BeveregeDTO> beveregeList1 = new ArrayList<>();
	List<KioskDTO> saveDetailList = new ArrayList<>();
	Long selectNumber = 0L;
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
		BeveregeDTO shot1 = new BeveregeDTO(1L, "1샷추가", 500L);
		beveregeList1.add(shot1);
		BeveregeDTO shot2 = new BeveregeDTO(2L, "2샷추가", 1000L);
		beveregeList1.add(shot2);
		BeveregeDTO shot3 = new BeveregeDTO(3L, "샷추가 없음", 0L);
		beveregeList1.add(shot3);
	}

	public void saveDetail(KioskDTO orderDetail) {
		saveDetailList.add(orderDetail);
	}

	public String selectBeverege(Long selectNumber) {
		String beverege = null;
		for (int i = 0; i < beveregeList.size(); i++)
			if (selectNumber.equals(beveregeList.get(i).getId())) {
				beverege = beveregeList.get(i).getMenu();
			}
		System.out.println(beverege + "를 선택 했습니다");
		return beverege;
	}

	public String sideMenu(Long selectNumber) {
		String shot = null;
		for (int i = 0; i < beveregeList1.size(); i++) {
			if (selectNumber.equals(beveregeList1.get(i).getId())) {
				shot = beveregeList1.get(i).getMenu();
			}
		}
		System.out.println(shot + "을 선택 했습니다");
		return shot;
	}

	public Long totalPrice(String beverege, String shot) {
		Long beveregePrice = 0L;
		Long beveregePrice1 = 0L;
		Long totalPrice = 0L;
		for (int i = 0; i < beveregeList.size(); i++) {
			if (beverege.equals(beveregeList.get(i).getMenu())) {
				beveregePrice = beveregeList.get(i).getPrice();
			}
		}
		for (int i = 0; i < beveregeList1.size(); i++) {
			if (shot.equals(beveregeList1.get(i).getMenu())) {
				beveregePrice1 = beveregeList1.get(i).getPrice();
			}
		}
		totalPrice = beveregePrice + beveregePrice1;
		return totalPrice;
	}

	public void coupon(String mobile) {
		int a = 0;
		for (int i = 0; i < saveDetailList.size(); i++) {
			if (mobile.equals(saveDetailList.get(i).getMobile())) {
				int coupon = saveDetailList.get(i).getCoupon();
				saveDetailList.get(i).setCoupon(++coupon);
			}
		}
		System.out.println("적립된 쿠폰은" + saveDetailList.get(a).getCoupon() + "개 입니다");
	}

	public void detail(String mobile) {

		for (int i = 0; i < saveDetailList.size(); i++) {
			{
				if (mobile.equals(saveDetailList.get(i).getMobile())) {
					System.out.println(saveDetailList.get(i));
				} else {
					System.out.println("번호를 확인 해주세요");
				}
			}
		}
	}
}
