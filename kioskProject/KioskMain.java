package kioskProject;

import java.util.*;

public class KioskMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		KioskService ks = new KioskService();
		
		
		boolean run = true;
		int selectNumber = 0;
		while (run) {
			System.out.println("---------------------");
			System.out.println("1.주문 | 2.주문내역조회 |3.종료  ");
			System.out.println("---------------------");
			System.out.print("선택>");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				ks.order();
				
			} else if (selectNumber == 2) {
				ks.orderDetail();
			} else if (selectNumber == 3) {
				run = false;
		}
		
			
			
	}
}
}