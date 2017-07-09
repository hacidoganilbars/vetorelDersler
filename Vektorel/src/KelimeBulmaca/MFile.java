package KelimeBulmaca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//File Manager Class
public class MFile {
	public String fileLocation = "D:\\kelime-listesi-ilk.txt";

	public List<String> FileReader() throws IOException {
		List<String> Liste = new ArrayList();
		File dosya = new File(fileLocation);
		if (dosya.exists()) {
			FileReader rd = new FileReader(fileLocation);
			BufferedReader reader = new BufferedReader(rd);
			String satir = reader.readLine();
			while (satir != null) {
				Liste.add(satir);
				satir = reader.readLine();
			}
			while ((satir = reader.readLine()) != null) {
			}
		}
		return Liste;
	}

	public String RandomText() {
		Random rnd = new Random();
		List<String> Liste = new ArrayList();
		try {
			Liste = FileReader();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		int ListeUzunlugu = Liste.size();
		int Secim = rnd.nextInt(ListeUzunlugu);
		String DonusDegeri = Liste.get(Secim);
		return Liste.get(rnd.nextInt(Liste.size()));
	}
}
