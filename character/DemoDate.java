import java.util.Date;
import java.text.*;
public class DemoDate {
	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
		System.out.println("Current Date: "+ft.format(dt));

	}
}