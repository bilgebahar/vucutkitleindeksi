import java.util.Scanner;
public class Vucutindeksi {

    public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    double kilo,boy,sonuc;
    System.out.println("Lütfen kilonuzu kg cinsinden giriniz:"); //VKİ hesabına göre ağırlık kg cinsinden girilmelidir
    kilo=giris.nextDouble();
    System.out.println("Lütfen boyunuzu metre cinsinden giriniz: Örnek:(1,75)"); //VKİ hesabına göre boy m cinsinden girilmelidir
    boy=giris.nextDouble();
    sonuc=kilo/(boy*boy); //girilen bilgilere göre VKİ hesaplama formülü "sonuc" olarak tanımlanır
    System.out.println("Vücut kitle indeksiniz: "+sonuc);
    //tanımlanan "sonuc" VKİ tablosuna göre kıyaslanır
    if(sonuc<18){ //VKİ 18'den küçükse
    System.out.println("Durumunuz: Zayıf");
    } else if(sonuc>=18&&sonuc<=25) { //VKİ 18-25 arası ise
    System.out.println("Durumunuz: Normal");
    } else if(sonuc>25&&sonuc<=30) { //VKİ 25-30 arası ise
    System.out.println("Durumunuz: Kilolu");
    } else if(sonuc>30&&sonuc<=35) { //VKİ 30-35 arası ise
    System.out.println("Durumunuz: Obez");
    } else if(sonuc>35) { //VKİ 35'den büyük ise
    System.out.println("Durumunuz: Ciddi Obez");
    } else {
    System.out.println("Hata oluştu");
    }
    }
    
}
