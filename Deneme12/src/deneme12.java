import java.util.Scanner;

public class deneme12 {

	public static void main(String[] args) {
		/* 
		   for (baslatma ; kosul ; artırma veya azaltma işlemleri) {
		  Döngü koşulumuz sağlandığı sürece burası çalışacak.
		   }
		*/
        
		/* int i;
         for (i = 0; i<5 ; i++) {
        	 System.out.println("i = "+ i);
        	 
         } */
		
		/*
		for (int i = 0 ; i<5 ; i++) {
			System.out.println("i= "+ i);
		} */
		/*for (int i = 10 ; i >= 0 ; i--) {
        
        System.out.println("i = " + i);
        
    }*/
    
    /*int i = 0;
    
    for(; i < 5 ;i++) {
        System.out.println("Java Öğreniyorum...");
    }*/
    
    /*int i = 0;
      int j = 10;
    
    for (; i < 10 && j > 0; i++,j--){
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
    
     for (int i = 2 ; i < 100 ; i *= 2){
        System.out.println("i = " + i);
    }
    */
    
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Bir sayı giriniz: ");
    
    int faktoriyel = 1;
    
    int sayi = scanner.nextInt();
    
    for (int i = 1; i <= sayi;i++) {
        
        faktoriyel *= i;
       // System.out.println("Faktoriyel = " + faktoriyel + " i = " + i);
        
    }
       System.out.println(sayi + "! = " + faktoriyel);
       
     /*  Kullanıcıdan bir sayı alınır ve bu sayı sayi değişkenine atanır.
       faktoriyel adında bir değişken oluşturulur ve başlangıç değeri 1 olarak ayarlanır.
       For döngüsü oluşturulur ve 1'den başlayarak sayi değerine kadar olan her sayı için döngü tekrarlanır.
       Her tekrarda faktoriyel değişkeni, kendisi ile döngü değişkeni i çarpılarak güncellenir.
       Döngü tamamlandığında faktoriyel değeri faktöriyel hesaplama işlemi sonucunu içerir.
       Sonuç ekrana yazdırılır.
       Örneğin, kullanıcı 5 girdiğinde, for döngüsü aşağıdaki gibi çalışır:

       İlk adımda, factorial değeri 1 olarak atanır.
       Döngü 5 kez tekrarlanır.
       tekrarda: factorial = 1 * 1 = 1
       tekrarda: factorial = 1 * 2 = 2
       tekrarda: factorial = 2 * 3 = 6
       tekrarda: factorial = 6 * 4 = 24
       tekrarda: factorial = 24 * 5 = 120
       Döngü tamamlandığında factorial değeri 120 olarak kalır ve bu, 5 faktöriyelinin sonucudur*/
		
       
       scanner.close();
	}
	

}
