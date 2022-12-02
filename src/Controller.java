import java.util.ArrayList;

public class Controller {
	public static void main(String[] args) {

	String result = null;
	Reservation rsv = null;
	Restaurant rst = null;
	ArrayList<Reservation> rsvResult = null;
	
	System.out.println("예약 프로그램");
	while(true) {
try {
	menu = ConsoleScreen.showMainMenu(){
		if(menu == 9) {
			System.out.println("시스템 종료");
			break;
		}
		else if (menu ==1 ) {
			rsv = ConsoleScreen.showrsvmenu();
			result = DAO.book(rsv);
			ConsoleScreen.printResult(result);
		}else if (menu ==2) {
			rst = ConsoleScreen.showRstMenu();
			result = DAO.registerRst(rst);
			ConsoleScreen.printResult(result);
		}else if (menu == 3) {
			rsvResult = DAO.getAllReserve();
			ConsoleScreen.showRsvResult(rsvResult);
			
		}
	
	
} catch (Exception e) {
	// TODO: handle exception
}
		
		}
	}
	
	
	}
}
