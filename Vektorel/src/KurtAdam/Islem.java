package KurtAdam;

import java.net.SocketTimeoutException;
import java.util.Scanner;

import KurtAdam.mdlKurtAdam.Mode;

public class Islem {

	public static void main(String[] args) {

		mdlInsan Insan = new mdlInsan();
		mdlKurtAdam KurtAdam = new mdlKurtAdam();
		OyunStart(Insan, KurtAdam);

		while (true) {
			System.out.println("1. Sald�r\t2. Ses\t\t3. Durum De�i�tir");
			System.out.println("4. Konusma\t5. Pen�e\t6. Is�rma");
			System.out.print("Secim :");
			int Secim = new Scanner(System.in).nextInt();
			if (Secim == 1) {
				// Sald�r� Yap�lacak
			} else if (Secim == 2) {
				System.out.println(KurtAdam.Ses());
			} else if (Secim == 3) {
				DurumDegistir(KurtAdam);
			} else if (Secim == 4) {
				// Konu�ma
			} else if (Secim == 5) {
				Pence(Insan, KurtAdam);
			} else {
				Isirma(Insan, KurtAdam);
			}
			if (Insan.SaglikSeviye() <= 0 || KurtAdam.SaglikSeviye() <= 0)
				break;
		}
	}

	static void OyunStart(mdlInsan Insan, mdlKurtAdam KurtAdam) {
		Insan.setSaglikSeviye(100);
		KurtAdam.setSaglikSeviye(100);
		KurtAdam.durum = mdlKurtAdam.Mode.Insan;
		if (Insan.YumrukAtma()) {
			if (KurtAdam.durum == mdlKurtAdam.Mode.Insan) {
				KurtAdam.durum = mdlKurtAdam.Mode.KurtAdam;
				KurtAdam.setSaglikSeviye(KurtAdam.SaglikSeviye() - 20);
				System.out.println(KurtAdam.Ses());
			}
		}
	}

	static void DurumDegistir(mdlKurtAdam KurtAdam) {
		if (KurtAdam.Konusma()) {
			System.out.println("Insan Modunday�m!");
		} else {
			System.out.println("KurtAdam Modunday�m!");
		}
		System.out.println("1. Insan\t2. KurtAdam\t3. Vazge�");
		System.out.print("Secim :");
		int Secim = new Scanner(System.in).nextInt();
		if (Secim == 1) {
			KurtAdam.durum = mdlKurtAdam.Mode.Insan;
		} else if (Secim == 2) {
			KurtAdam.durum = mdlKurtAdam.Mode.KurtAdam;
		} else {
			return;
		}
	}

	static void Pence(mdlInsan Insan, mdlKurtAdam KurtAdam) {
		if (KurtAdam.Pence()) {
			if (Insan.SaglikSeviye() <= 0)
				return;
			Insan.setSaglikSeviye(Insan.SaglikSeviye() - 35);
		} else {
			System.out.println("�u anda insan modundas�n�z!");
		}
	}

	static void Isirma(mdlInsan Insan, mdlKurtAdam KurtAdam) {
		if (KurtAdam.Isirma()) {
			if (Insan.YumrukAtma()) {
				KurtAdam.setSaglikSeviye(KurtAdam.SaglikSeviye() - 5);
			}
			if (Insan.SaglikSeviye() <= 0)
				return;
			Insan.setSaglikSeviye(Insan.SaglikSeviye() - 35);
		} else {
			System.out.println("�u anda insan modundas�n�z!");
		}
	}
}
