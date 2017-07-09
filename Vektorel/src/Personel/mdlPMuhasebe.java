package Personel;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class mdlPMuhasebe extends Personel {

	@Override
	public double MaasHesapla() {
		return (this.NetMaas() / 30) * this.CalismaSuresi();
	}

	@Override
	public double NetMaas() {
		if (this.sigorta == SDurum.Sigortali) {
			return this.maas / 1.20;
		} else if (this.sigorta == SDurum.Ogrenci) {
			return this.maas / 1.5;
		} else {
			return this.maas;
		}
	}

	@Override
	public double BrutMaas() {
		return this.maas;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int CalismaSuresi() {
		return (new Date()).getDay();
	}

	@Override
	public String SaglikDurum() {
		if (this.sigorta == SDurum.Sigortali || this.sigorta == SDurum.Ogrenci) {
			return "Saðlýklý";
		} else {
			return "Þüpheli";
		}
	}

	@Override
	public String Ad() {
		return this.ad;
	}

	@Override
	public void Ad(String ad) {
		this.ad = ad;
	}

	@Override
	public String Soyad() {
		return this.soyad;
	}

	@Override
	public void Soyad(String soyad) {
		this.soyad = soyad.toUpperCase();
	}

	@Override
	public String Telefon() {
		return this.telefon;
	}

	@Override
	public void Telefon(String telefon) {
		if (super.NumaraDogrula(telefon)) {
			this.telefon = telefon;
		} else {
			System.out.println("Hatalý Numara Girildi! (XXX) XXX XX XX");
			do {
				System.out.println("Numarayý Tekrar Giriniz:");
				telefon = new Scanner(System.in).nextLine();
			} while (super.NumaraDogrula(telefon));
		}
		this.telefon = telefon;
	}

	@Override
	public SDurum Sigorta() {
		return sigorta;
	}

	@Override
	public void Sigorta(SDurum sigorta) {
		this.sigorta = sigorta;
	}

	@Override
	public Date IsBasi() {
		return this.isBasi;
	}

	@Override
	public void IsBasi(Date isBasi) {
		this.isBasi = isBasi;
	}

	@Override
	public double Maas() {
		return this.maas;
	}

	@Override
	public void Maas(double maas) {
		this.maas = maas;
	}

	@Override
	public String PersonelBilgileri() {
		return String.format(
				"Adý Soyadý\t:%s %s\nTelefon No\t:%s\nSigorta Durum\t:%s\nÝþe Baþlama\t:%s\nMaaþ\t\t:%s\nNet Maaþ\t:%s\n",
				this.ad, this.soyad, this.telefon, this.sigorta, new SimpleDateFormat("dd.MM.yyyy").format(this.isBasi),
				new DecimalFormat("#0.00").format(this.maas), new DecimalFormat("#0.00").format(this.NetMaas()));
	}
}
