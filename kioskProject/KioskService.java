package kioskProject;

import java.util.*;

public class KioskService {
	Scanner scan = new Scanner(System.in);
	KioskRepository kr = new KioskRepository();
	Long selectNumber = 0L;

	public void order() {
		kr.order();
		kr.sideMenu();
	}

//	public void sideMenu() {
//		kr.sideMenu();
//
//	}
}
