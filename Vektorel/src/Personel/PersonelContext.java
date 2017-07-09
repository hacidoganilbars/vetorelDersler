package Personel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Personel.Personel.SDurum;

public class PersonelContext {

	private List<mdlPMuhasebe> Muhasebe;

	public PersonelContext() {
		this.Muhasebe = new ArrayList<mdlPMuhasebe>();
	}

	public int PersonelEkle(mdlPMuhasebe Personel) {
		this.Muhasebe.add(Personel);
		return 1;
	}

	public int PersonelEkle(List<mdlPMuhasebe> Personeller) {
		this.Muhasebe.addAll(Personeller);
		return Personeller.size();
	}

	public int PersonelSil(mdlPMuhasebe Personel) {
		this.Muhasebe.remove(Personel);
		return 1;
	}

	public int PersonelSil(List<mdlPMuhasebe> Personeller) {
		this.Muhasebe.removeAll(Personeller);
		return Personeller.size();
	}

	public int PersonelGuncelle(mdlPMuhasebe Personel) {
		int donusDegeri = 0;
		for (int i = 0; i < this.Muhasebe.size(); i++) {
			if (this.Muhasebe.get(i).personelNo == Personel.personelNo) {
				this.Muhasebe.set(i, Personel);
				return (donusDegeri + 1);
			}
		}
		return donusDegeri;
	}

	public int PersonelOlustur() {
		Scanner Klavye = new Scanner(System.in);
		System.out.println("Kaç Personel Kaydý Oluþturmak Istiyorsunuz?");
		int Sayac = Klavye.nextInt();
		for (int i = 1; i <= Sayac; i++) {
			mdlPMuhasebe Personel = new mdlPMuhasebe();
			System.out.print("Personel Adý:");
			Personel.Ad(new Scanner(System.in).nextLine());
			System.out.print("Personel Soyadý:");
			Personel.Soyad(new Scanner(System.in).nextLine());
			System.out.print("Personel Maaþý(Brüt):");
			Personel.Maas(new Scanner(System.in).nextDouble());
			System.out.println("Personel Telefonu (XXX) XXX XX XX:");
			Personel.Telefon(new Scanner(System.in).nextLine());
			System.out.println("1. Sigortalý\t2.Sigortasýz");
			if (new Scanner(System.in).nextInt() == 1) {
				Personel.Sigorta(SDurum.Sigortali);
			} else {
				Personel.Sigorta(SDurum.Sigortasiz);
			}
			Personel.personelNo = this.Muhasebe.size() + i;
			Personel.IsBasi(new Date());
			this.Muhasebe.add(Personel);
		}
		System.out.printf("%s Kayýt eklendi!\n", Sayac);
		Klavye.close();
		return Sayac;
	}

	public List<mdlPMuhasebe> PersonelListesi() {
		return this.Muhasebe;
	}

	public void PersonelBilgileri() {
		for (mdlPMuhasebe Person : this.Muhasebe) {
			System.out.println(Person.PersonelBilgileri());
		}
	}

	public void PersonelDuzenle() {
		for (mdlPMuhasebe Person : this.Muhasebe) {
			System.out.printf("%s.%s %s\n", Person.personelNo, Person.Ad(), Person.Soyad());
		}
		System.out.print("Düzenlenecek Personel Numarasý:");
		int PersonNo = new Scanner(System.in).nextInt();
		mdlPMuhasebe Personel = PersonelOku(PersonNo);
		if (Personel != null) {
			System.out.print(Personel.Ad());
			System.out.print(" <- için Yeni Ad :");
			Personel.Ad(new Scanner(System.in).nextLine());
			System.out.print(Personel.Soyad());
			System.out.print(" <- için Yeni Ad :");
			Personel.Soyad(new Scanner(System.in).nextLine());
			System.out.println(Personel.Maas());
			System.out.print(" <- Personel Maaþý(Brüt):");
			Personel.Maas(new Scanner(System.in).nextDouble());
			System.out.println(Personel.Telefon());
			System.out.println(" <- Personel Telefonu (XXX) XXX XX XX:");
			Personel.Telefon(new Scanner(System.in).nextLine());
			this.PersonelGuncelle(Personel);
		} else {
			System.out.println("Böyle bir Personel Yoktur!");
		}

	}

	public mdlPMuhasebe PersonelOku(int PersonelNo) {
		for (int i = 0; i < this.Muhasebe.size(); i++) {
			if (this.Muhasebe.get(i).personelNo == PersonelNo) {
				return this.Muhasebe.get(i);
			}
		}
		return null;
	}

}
