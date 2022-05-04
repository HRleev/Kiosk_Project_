package kioskProject;

import java.util.*;

public class KioskRepository {
	Scanner scan = new Scanner(System.in);
	List<BeveregeDTO> beveregeList = new ArrayList<>();
	Long selectNumber = 0L;
	List<DetailDTO> odList =new ArrayList<>();
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
		BeveregeDTO shot1 = new BeveregeDTO(5L, "1샷추가", 500L);
		beveregeList.add(shot1);
		BeveregeDTO shot2 = new BeveregeDTO(6L, "2샷추가", 1000L);
		beveregeList.add(shot2);

	}

	public void order() {
		save();
		System.out.println("주문하실 음료를 선택 해 주세요");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1.아이스 아메리카노 | 2.바닐라라떼 |3.카페라떼 |4.카푸치노 | 5.카라멜 마끼아또");
		System.out.println("----------------------------------------------------------------");
		System.out.print("선택>");
		selectNumber = scan.nextLong();
		BeveregeDTO result = null;
		if (selectNumber == 1L) {
			for (int i = 0; i < beveregeList.size(); i++)
				if (selectNumber.equals(beveregeList.get(i).getId())) {
					result =beveregeList.get(i);
					for(int j =0; j<odList.size();j++)
					{
						if(selectNumber.equals(odList.get(i).getId()))
						{
							odList.get(i).setOrder(result);
						}
					}
					
				}
		} else if (selectNumber == 2L) {
			for (int i = 0; i < beveregeList.size(); i++)
				if (selectNumber.equals(beveregeList.get(i).getId())) {
					result = beveregeList.get(i);
				}

		} else if (selectNumber == 3L) {
			for (int i = 0; i < beveregeList.size(); i++)
				if (selectNumber.equals(beveregeList.get(i).getId())) {
					result = beveregeList.get(i);
				}
		} else if (selectNumber == 4L) {
			for (int i = 0; i < beveregeList.size(); i++)
				if (selectNumber.equals(beveregeList.get(i).getId())) {
					result = beveregeList.get(i);
				}
		}
		

	}

	public void sideMenu() {
		save();
		System.out.println("샷추가를 선택 해 주세요");
		System.out.println("-------------------------------");
		System.out.println("5.1샷추가 | 6.2샷추가 |7.샷추가 없음 ");
		System.out.println("-------------------------------");
		System.out.print("선택>");
		selectNumber = scan.nextLong();
		BeveregeDTO result = null;
		if (selectNumber == 5L) {
			for (int i = 0; i < beveregeList.size(); i++) {
				if (selectNumber.equals(beveregeList.get(i).getId())) {
					result = beveregeList.get(i);
				}
			}
		} else if (selectNumber == 7L) {
			for (int i = 0; i < beveregeList.size(); i++) {
				if (selectNumber.equals(beveregeList.get(i).getId())) {
					result = beveregeList.get(i);
				}
			}
		}
	}


}
