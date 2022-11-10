package day04ifstatement;

import java.util.Scanner;

public class Scanner02{

    // Example 1: Kullanicidan ilk orta ve soy ismini aliniz ve asagdaki formatta ekrana yazdiriniz.
    // Ali Mert Can
    //123412341234

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        String ilkisim= input.next();
        System.out.println("ikinci soyisminizi giriniz");
        String ortaisim= input.next();
        System.out.println("soyisminizi giriniz");
        String soyisim= input.next();
        System.out.println("kimlik numaranizi giriniz");
        String kimlikNo= input.next();
        System.out.println(ilkisim +" " +  ortaisim +" " + soyisim);
        System.out.println("kimlikNo");

        // ikinci yol
        System.out.println("ilk orta ve s0yisminizi ve kimlik numaranizi giriniz");
        String ilk= input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik= input.next();

// tek mesajla coklu data alma

        // ücüncü yol
        System.out.println("ilk orta ve soyisminizi giriniz");
    }




}
