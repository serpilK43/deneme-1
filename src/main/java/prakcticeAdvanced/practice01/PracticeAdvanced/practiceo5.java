package prakcticeAdvanced.practice01.PracticeAdvanced;

import java.util.Scanner;

public class practiceo5 {
    // Kullanicidan aldiginiz iki karakterin arasinda bulunan tüm karakterleri yazdiriniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk karakteri giriniz");
        char ch1 = input.next().charAt(0);
        System.out.println("ikinci karakter aliniz");
        char ch2 = input.next().charAt(0);
        int ilk = Math.min(ch1, ch2);
        int ikinci = Math.max(ch1, ch2);

        int i;
        for (i = ch1; i <= ch2; i++) ;
        System.out.println((char) i + " ");

    }
}
