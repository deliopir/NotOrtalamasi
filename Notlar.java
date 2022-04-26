import java.util.Scanner;

public class Notlar extends Tanimlama {

    public void verial () {
        scanner = new Scanner(System.in);

        System.out.print("Matematik ortalaması: ");
        matematik = scanner.nextInt();
        System.out.print("Fizik ortalaması: ");
        fizik = scanner.nextInt();
        System.out.print("Müzik ortalaması: ");
        muzik = scanner.nextInt();
        System.out.print("Tarih ortalaması: ");
        tarih = scanner.nextInt();
        System.out.print("Türkçe ortalaması: ");
        Turkce = scanner.nextInt();
        System.out.print("kimya ortalaması: ");
        kimya = scanner.nextInt();
        System.out.println("Tüm veriler alındı.");


    }

    public void hesapla() {

        toplama = matematik+fizik+kimya+muzik+tarih+Turkce;
        sonuc = toplama/6;
        System.out.println(sonuc);

    }

    public void gecmeDurumu() {
        String durum = (sonuc>60)? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println("Sınıfı geçme durumu: " + durum);
    }



}
