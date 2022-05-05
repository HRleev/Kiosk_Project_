package kioskProject;

import java.util.*;

public class KioskService {
	Scanner scan = new Scanner(System.in);
	KioskRepository kr = new KioskRepository();
	Long selectNumber = 0L;
	List<BeveregeDTO> beveregeList = new ArrayList<>();

	String result = null;
	String result1 = null;

	public void order() {
		kr.order();
		
	}


}
