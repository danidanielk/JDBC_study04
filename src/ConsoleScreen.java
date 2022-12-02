import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ConsoleScreen {
	public static Reservation showrsvmenu() throws ParseException {
		Scanner k = new Scanner(System.in);

		System.out.println("예약자 :");
		String name = k.next();

		System.out.println("예약날짜 :(YYYYMMDD)");
		String when = k.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH:mm");
		Date when2 = sdf.parse(when);

		System.out.println("연락처 :");
		String phoneNum = k.next();

		System.out.println("지점명 :");
		String location = k.next();

		Reservation r = new Reservation(0, name, when2, phoneNum, location);
		return r;
	}

	// 2매장등록

	public static Restaurant showRstMenu() {
		Scanner k = new Scanner(System.in);

		System.out.println("지점명:");
		String location = k.next();

		System.out.println("지점명:");
		String owner = k.next();

		System.out.println("좌석");
		int seat = k.nextInt();

		return new Restaurant(location, owner, seat);
	}
	
	//3번
	public static void showRsvResult(ArrayList<Reservation> rsvs) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm");
		for (Reservation r : rsvs) {
			System.out.println(r.getNo());
			System.out.println(r.getName());
			System.out.println(r.getPhone());
			System.out.println(r.getLocation());
			System.out.println(sdf.format(r.getWhen()));
		}
		
	}
	
}
