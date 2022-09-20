package java2022_HW1;

public class ArraysDemo {

	public static void main(String[] args) {
		
		String ogrenci1 = "Özer";
		String ogrenci2 = "Burçe";
		String ogrenci3 = "Kutlu";
		String ogrenci4 = "Emre";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Özer";
		ogrenciler[1] = "Burçe";
		ogrenciler[2] = "Kutlu";
		ogrenciler[3] = "Emre";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("------------------");
		
		for(String ogreci:ogrenciler){
            System.out.println(ogreci);
        }

	}

}
