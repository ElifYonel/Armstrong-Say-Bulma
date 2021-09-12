import java.util.Scanner;

public class armstrongsayibulma {
	public static void main(String arg[]){
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Bir sayı giriniz: ");
	      int sayi = scan.nextInt();
	
	      	int basamak=0;
	      	int toplam=0;
	      	int deger=sayi;
	      	int cikan_sayi=sayi;
	
	      	while(deger>0){
	      		deger/=10;
	      		basamak++;
	      	}
	      	while(cikan_sayi>0){
	      		int basamak_degeri = cikan_sayi % 10;
	      		cikan_sayi /= 10;
	      		toplam += Math.pow(basamak_degeri,basamak);
	      	}
	
	      		if (toplam == sayi) {

	      			System.out.println(sayi + " sayısı armstrong sayıdır.");
	      		}
	      		else {
	      			System.out.println(sayi + " sayısı armstrong sayı değildir.");
	      		}
	}
}
