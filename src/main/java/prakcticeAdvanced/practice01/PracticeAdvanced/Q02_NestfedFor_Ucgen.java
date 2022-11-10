package prakcticeAdvanced.practice01.PracticeAdvanced;

import java.util.Scanner;

public class Q02_NestfedFor_Ucgen {
    //kullanicidan aldigi satir sayisina göre asagidaki sekli yazdiran bir kod yaziniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisini giriniz");
        int satir = input.nextInt();

        for(int i=0; i <satir;i++){
            for (int bosluk=satir-1; bosluk--);;{
                System.out.println(" ");

                for (int yildiz=0; yildiz<=i; ++) {
                    System.out.println("* ");


                }
            }
        }

    }
}
