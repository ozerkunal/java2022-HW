package java2022_HW1;

public class SayiBulma {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi = true;
			}
		}
		
		if (varMi) {
			System.out.println("Sayı Mevcuttur");
		} else {
			System.out.println("Sayı Mevcut Değildir");
		}

	}

}
