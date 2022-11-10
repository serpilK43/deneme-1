package day02methodcreation;

public class MethodCreation {
    // main method icinde kullandiginiz herseyin "static" olmalidir

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ilkucSayiyiCarp(2, 1.5, 6));

        System.out.println(ilkIkiSayiyiToplaUcuncuIleCarp(2, 8, 3.2));


    }


    // Sout yazip "Enter"e basiniz System.out.printIn() otomatik olarak yazilir
    // Ekrana birsey yazdirmak icin iki tane kod var
    // 1: System.out.printIn ==>satirbasi yapar System.out.print() satirbasi yapmaz
    //Example 1: Toplama islemi yapan bir method olusturunuz

    public static double toplamaYap(double a, double b) {

        return (a + b);
    }


    public static double ilkucSayiyiCarp(double a, double b, double c) {

        return (a * b * c);
    }


// Example 3: uc sayidan ilk ikisini  toplayip sonra ucuncu ile carpan bir method olusturunuz

    public static double ilkIkiSayiyiToplaUcuncuIleCarp(double a, double b, double c) {
        return (a + b) * c;
    }
}







