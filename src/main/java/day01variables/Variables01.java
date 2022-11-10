package day01variables;

public class Variables01 {
    //Variable nasil olusturulur?
   // 1)Access Modifier 2)Data Type 3)Variable isim 4) =  5)Deger   6) ;
    // Java´ da ";" Ingilizce´deki "." gibidir
        // Ingilizce´de "cümle" deriz, Java´da "statement" deriz
    // "=" sembolü "Assaigment (Atama) Operator" olarak adlandirlir
    // "Assagment Operator" sagdaki degeri alir soldaki Variable´nin icerisine koyar


    public int age = 13;
    public int height = 183;

        //Java´da Data Typle´leri
    /*
    1)int: Integerín kisaltmasi. Integer tam sayi demektir.
    Matematik´de tam sayilarin basi ve sonu yoktur fakat Java´da tam sayilarin basi ve sonu vardir.
    En kücük int = -2,147,483,648
    En büyük int = 2,147,483,647
    2) byte: Tamsayilar icin kullanilir.
             En kücük byte = -128
             En büyük byte= 127
     3) short: Tam sayilar icin kullanilir
     En kücük short = -32768
     En büyük short = 32767

     4)long:Tamsayilar icindir
     En kücük long= -9,223,372,036,755,808
      En büyük long= 9,223,372,036,854,755,807

      5) float: Ondalikli sayilar icindir. 32 bit kullanir
      float virgülden sonra 7 basamak icerebilir.
      float degerlerinde sona "F" veya "f" kullanilir

      6) double: ondalikli sayilar icindir. 64 bit kullanir
      double virgülden sonra 16 basamak icerebilir


        public byte  price = 12;

        public short populationOfVillage = 23000;

        public float priceOfShirT = 13. 99F;

        public double weightOfCell = 0.000012845;

        // siz "Long" demenize ragmen Java verilen sayiyi "int" kabul eder
    // bu yüzden long bir variable´ye int araliginin disindda bir sayi verirseniz mutlaka sonuna L veya l koyunuz

        public long populationOfWorld =70000000000L;
        // burada "l" koymadiginiz halde problem yok cünkü "1234" int araligina uyar


        7)boolean: true veya false degerleri icin kullanilir. 1 bit kullanir
        public boolean isaold= true;
        public boolean isRich = false

        8) char: Tek karakterler icin kullanilir
        A, c, 2, ne olursa olsun tek data type icin kullanilir
        16 bit kullanir

        public char initial = ´s´

        Non- Primitive Data Types
        String: isim, adres, kimlik numarasi gibi bir veya birden fazla deger iceren karakterlerde kullanilir,
        String degerleri muhakkak cift tirnak arasina konmalidir.
        String non-primitivedir. Yani bir String olusturdugunuzda size bir sürü methode verir



        charlara deger verirken degeri tek tirnak ´c´ arasina koyunuz. Yoksa hata verir


        note: java büyük ve kücük harflere duyarlidir java icin "true" ile "TRUE" tamamen farklidir.
     */

         public String name = "Tom Hank";


    public static void main(String[] args) {
        System.out.println("*****");

    }
}
