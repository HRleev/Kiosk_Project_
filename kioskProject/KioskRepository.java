package kioskProject;

import java.util.*;

public class KioskRepository {
	Scanner scan = new Scanner(System.in);
	List<BeveregeDTO> beveregeList = new ArrayList<>();
	Long selectNumber = 0L;
	List<DetailDTO> odList = new ArrayList<>();
	String result = null;
	String result1 = null;
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

	}


	public void order() {
		System.out.println("주문하실 음료를 선택 해 주세요");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1.아이스 아메리카노 | 2.바닐라라떼 |3.카페라떼 |4.카푸치노 | 5.카라멜 마끼아또");
		System.out.println("----------------------------------------------------------------");
		System.out.print("선택>");
		selectNumber = scan.nextLong();
		if (selectNumber == 1L) {
			selectBeverege();
			sideMenu();
			System.out.println(result+result1+"을 선택 했습니다.");
			DetailDTO detailList = new DetailDTO(++id, result, result1, 0L);
			odList.add(detailList);
		} else if (selectNumber == 2L) {
			selectBeverege();
			sideMenu();
			System.out.println(result+result1+"을 선택 했습니다.");
			DetailDTO detailList = new DetailDTO(++id, result, result1, 0L);
			odList.add(detailList);
		} else if (selectNumber == 3L) {
			selectBeverege();
			sideMenu();
			System.out.println(result+result1+"을 선택 했습니다.");
			DetailDTO detailList = new DetailDTO(++id, result, result1, 0L);
			odList.add(detailList);
		} else if (selectNumber == 4L) {
			selectBeverege();
			sideMenu();
			System.out.println(result+result1+"을 선택 했습니다.");
			DetailDTO detailList = new DetailDTO(++id, result, result1, 0L);
			odList.add(detailList);
		} else if (selectNumber == 5) {
			selectBeverege();
			sideMenu();
			System.out.println(result+result1+"을 선택 했습니다.");
			DetailDTO detailList = new DetailDTO(++id, result, result1, 0L);
			odList.add(detailList);
		}

	}
	public void selectBeverege() {
		save();
		for (int i = 0; i < beveregeList.size(); i++)
			if (selectNumber.equals(beveregeList.get(i).getId())) {
				result = beveregeList.get(i).getMenu();
				System.out.println(result + "를 선택 했습니다");
			}
	}

	public void sideMenu() {
				System.out.println("샷추가를 선택 해 주세요");
				System.out.println("-------------------------------");
				System.out.println("6.1샷추가 | 7.2샷추가 |8.샷추가 없음 ");
				System.out.println("-------------------------------");
				System.out.print("선택>");
				selectNumber = scan.nextLong();
				if (selectNumber == 6L) {
					for (int j = 0; j < beveregeList.size(); j++) {
						if (selectNumber.equals(beveregeList.get(j).getId())) {
							result1 = beveregeList.get(j).getMenu();
							System.out.println(result1+"샷 추가를 선택 했습니다");
						}
					}
				}
			else if (selectNumber == 7L) {
				for (int j = 0; j < beveregeList.size(); j++) {
					if (selectNumber.equals(beveregeList.get(j).getId())) {
						result1 = beveregeList.get(j).getMenu();
						System.out.println(result1+"샷 추가를 선택 했습니다");
					}
				}
			} else if (selectNumber == 8L) {
				System.out.println("샷추가 없음");
			}
		}
	}


