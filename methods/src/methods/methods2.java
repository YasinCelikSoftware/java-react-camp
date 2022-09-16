package methods;

public class methods2 {
	
	
	
	//void operasyon : Bir şey döndürmeyip sadece işlem yapan methodlara void verilir.
	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4);
		System.out.println(toplam);
	}

	public static void ekle() { // Bu operasyon sadece bir işlem yapar ve geriye "hiçbir şey" döndürmez.
		System.out.println("Eklendi.");
	}
	
	public static void sil() {
		System.out.println("Silindi.");
	}
	
	public static void guncelle() {
		System.out.println("Guncellendi.");
	}
	
	public static int topla(int sayi1,int sayi2) { // Bu fonksiyon "integer" türünde bir değer döndürür. Parametreli fonksiyondur.
		
		
		return sayi1+sayi2;
		
	}
	
	public static int topla2(int... sayilar) { // Gelen girdileri dizi olarak alır ve buna göre işlem yapar. int'den sonraki 3 nokta birden fazla giriş yapabileceğimizi (dizi olduğunu) belirtir.
		
		int toplam = 0;
		
		for (int sayi : sayilar) {
			
			toplam = toplam + sayi;
			
		}
		return toplam;
		
	}
	
	public static String sehirVer() { // Bu fonksiyon "String" türünde bir değer döndürür.
		
		return "Ankara";
		
	}
	
}
