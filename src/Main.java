import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fiyat;
        double kdv_tutari, sonuc;
        String kdv_miktari;
        System.out.println("Lütfen aldığınız ürünün kdv'siz fiyatını giriniz: ");
        fiyat = input.nextInt();

        kdv_miktari = (fiyat < 1000) ? "18" : "8";
        kdv_tutari = (fiyat < 1000) ? (fiyat * 18.0) / 100 : (fiyat * 8.0) / 100;
        sonuc = fiyat + kdv_tutari;

        System.out.println("Ürüne göre belirlenen KDV miktarı: " + kdv_miktari);
        System.out.println("KDV tutarı: " + kdv_tutari);
        System.out.println("Ürünün KDV'li hali: " + sonuc);


    }
}