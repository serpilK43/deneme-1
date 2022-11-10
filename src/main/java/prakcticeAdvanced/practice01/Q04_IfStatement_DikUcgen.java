package prakcticeAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {
        //Kullanıcıdan üç adet sayı alarak bu sayıların
        //        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        //        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        //        bağlantısından yararlanabilirsiniz)
        //        Örnek Ekran Çıktısı:
        //        birinci kenarı giriniz: 3
        //        ikinci kenarı giriniz 4
        //        üçüncü kenarı giriniz: 5
        //        Bu bir dik üçgendir
        //        birinci kenarı giriniz: 2
        //        ikinci kenarı giriniz 15
        //        üçüncü kenarı giriniz: 7
        //        Bu bir dik üçgen değildir.
        //örnek 1:
        Scanner al = new Scanner(System.in);
        System.out.println("1 kenar giriniz");
        int kenar1=al.nextInt();
        System.out.println("2 kenar giriniz");
        int kenar2=al.nextInt();
        System.out.println("3 kenar giriniz");
        int kenar3=al.nextInt();
        int karesi1=kenar1*kenar1;
        int karesi2=kenar2*kenar2;
        int karesi3=kenar3*kenar3;
        if (karesi3==karesi2+karesi1||karesi2==karesi3+karesi1||karesi1==karesi2+karesi3){
            System.out.println("Dik ucgen");
        }else System.out.println("Dik ucgen değil");
 // ÖRNEK 2:
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını giriniz");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        boolean dikUcgenMi = (a*a)+(b*b)==c*c ||(c*c)+(b*b)==a*a ||(c*c)+(a*a)==b*b;
        if (dikUcgenMi){

            System.out.println("Bir dik ucgendir");
        }
        else
            System.out.println("Bir dik ucgen degildir");}

        }