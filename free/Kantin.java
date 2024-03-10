package free;

import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class Kantin {

    private static Map<String, Double> borclar = new HashMap<>(); // öğretmenlerin borçları

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;
        while (devam) {
            System.out.println("1- Borç Ekle");
            System.out.println("2- Borç Ödeme");
            System.out.println("3- Borç Sorgula");
            System.out.println("4- Çıkış");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    borcEkle();
                    break;
                case 2:
                    borcOdeme();
                    break;
                case 3:
                    borcSorgula();
                    break;
                case 4:
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }
        }
    }

    private static void borcEkle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğretmen adı giriniz:");
        String ogretmenAdi = scanner.nextLine();
        System.out.println("Borç miktarı giriniz:");
        double borcMiktari = scanner.nextDouble();
        if (borclar.containsKey(ogretmenAdi)) {
            borcMiktari += borclar.get(ogretmenAdi);
        }
        borclar.put(ogretmenAdi, borcMiktari);
        System.out.println("Borç eklendi!");
    }

    private static void borcOdeme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğretmen adı giriniz:");
        String ogretmenAdi = scanner.nextLine();
        if (borclar.containsKey(ogretmenAdi)) {
            double borcMiktari = borclar.get(ogretmenAdi);
            if (borcMiktari > 0) {
                System.out.println("Ödenecek miktar: " + borcMiktari);
                borclar.put(ogretmenAdi, 0.0);
                System.out.println("Borç ödendi!");
            } else {
                System.out.println("Borç yok!");
            }
        } else {
            System.out.println("Böyle bir öğretmen yok!");
        }
    }

    private static void borcSorgula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğretmen adı giriniz:");
        String ogretmenAdi = scanner.nextLine();
        if (borclar.containsKey(ogretmenAdi)) {
            double borcMiktari = borclar.get(ogretmenAdi);
            if (borcMiktari > 0) {
                System.out.println(ogretmenAdi + " adlı öğretmenin borcu: " + borcMiktari);
            } else {
                System.out.println("Borç yok!");
            }
        } else {
            System.out.println("Böyle bir öğretmen yok!");
        }

    }
}
 