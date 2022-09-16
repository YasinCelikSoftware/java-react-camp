package methods;

public class methods {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 9;
		boolean arama = false;

		for (int sayi : sayilar) {

			if (sayi == aranacak) {

				arama = true;
				break; // döngüyü bitirecek komut.
			}

		}
		if (arama) {

			mesajVer(aranacak + " sayisi listede vardir.");

		} else {

			mesajVer(aranacak + " sayisi listede yoktur.");

		}

	}

	public static void mesajVer(String mesaj) {

		System.out.println(mesaj);

	}
}
