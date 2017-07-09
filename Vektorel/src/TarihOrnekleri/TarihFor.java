package TarihOrnekleri;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TarihFor {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
		Date dtBaslangic = new Date(117, 0, 0);
		Date dtBitis = new Date(118, 0, 0);
		int pSayac = 0;

		for (; dtBaslangic.getTime() < dtBitis.getTime();) {
			Calendar c = Calendar.getInstance();
			c.setTime(dtBaslangic);
			c.add(Calendar.DATE, 1);
			dtBaslangic = c.getTime();
			if (c.get(Calendar.DAY_OF_WEEK) == 1)
				pSayac++;
			if (sdf1.format(dtBaslangic).equals("Pazar"))
				pSayac++;
		}
		System.out.println(pSayac / 2);

	}
}
