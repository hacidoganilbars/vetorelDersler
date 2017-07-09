package TarihOrnekleri;

import java.util.Calendar;
import java.util.Date;

public class TarihFor2 {

	public static void main(String[] args) {

		Date dt = new Date();
		Date dtBitis = new Date(118, 0, 0);

		Calendar c = Calendar.getInstance();
		c.setTime(dt);

		for (; dt.getTime() < dtBitis.getTime(); c.add(Calendar.DATE, 1)) {
			dt = c.getTime();
		}

	}

}
