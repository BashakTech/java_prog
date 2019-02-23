import java.util.Date;
import java.text.*;
public class NewDateDemo {
	public static void main(String[] args) {
		Date det = new Date();
		SimpleDateFormat sdtf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
		System.out.println("Current Date and Time: "+sdtf.format(det));
	}
}