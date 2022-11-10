package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numerik Data Type´ni diger numerik Data Type cevirmek demektir.
   // byte < short< int < long < float< duoble


    // Note 1) Kücük Data type´rini büyük Dta Typl´lerine cevirmeye "Auto Widening" denir
    // Note 2) Büyük Data typl´lerini kücük Data Typl´lerine cevirmeye "Explisit Norrawing" denir.

    public static void main(String[] args) {

        byte age = 23;
        int newage = age;

        long population = 1234;
        int newpopulation =(int)population;


        // 1)Exsample 1: shortu double.a ceviren bir kod yaziniz

        short numOfStudents = 235;
        double newOfStudents = numOfStudents; // Auto Widening

        // Exapmle 2: floatí byte yapan bir kodu yaziniz.
        float price = 12.99F;
        byte newprice= (byte)price;// Explicit Narrowing

        System.out.println(newprice);//==> Java ondalik Sayiyi tam sayiya cevirirken yuvarlama islemi yapmaz
                                        // Java ondalik sayiyi tam sayiya cevirirken ondlalik kismini siler.




        }



    }


