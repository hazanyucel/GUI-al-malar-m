package free;

import java.util.Scanner;

class araba {

    String renk;
    String model;
    String fiyat;
    public araba(){
        System.out.println("ARABA ÖZELLİKLERİ ");
    }

    public araba(String renk, String model, String fiyat) {
        this.fiyat=fiyat;
        this.model=model;
        this.renk=renk;

    }
}
    public class calısma {
        public static void main(String[] args) {
             Scanner k=new Scanner(System.in);
             araba mercedes=new araba();
             mercedes.fiyat= "28.500.000 TL" ;
             mercedes.model="63 AMG ";
             mercedes.renk="Siyah";
             System.out.println("Arabanın rengi: "+mercedes.renk);
             System.out.println("Arabanın modeli: "+mercedes.model);
             System.out.println("Arabanın fiyatı: "+mercedes.fiyat);
        }
    
     
    }

 