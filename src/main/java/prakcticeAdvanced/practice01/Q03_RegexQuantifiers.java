package prakcticeAdvanced.practice01;

public class Q03_RegexQuantifiers {

    public static void main(String[] args) {
        // bir String degerin belirli sayida karakter icerip belirli bir karakter ile bitip bitmedigini kontrol
        // eden bir kod yaziniz
        String str = "as";
        System.out.println(str.matches("s")); // true==> herhangi bir karakter ile baslayip "s" harfi ile bitiyor
        // matches() methodu regex ilr calisip String degerin regex ile karsilastirilmasini yapar
        System.out.println(str.matches("..s"));//false == 3 karakterli olup olmadigi icin
        // bir string degerin ikinci karakterinin belirli bir karakter olup olmadigini kontrol eden bir kod yaziniz
        System.out.println("asjkkök".matches(".s.*"));
        // .* esnek sayida karakter (0 yada fazla)
        System.out.println("asghkvnc".matches(".r.*"));
        //bir String degerin sadece harf icerip icermedigini kontrol eden bir kod yaziniz.
        System.out.println("abc".matches("[a-zA-Z]{5}"));// true 5 karakterli ve hepside harf
        // bir String degerin belirli sayida belirli karakterler icerdigini kontrol eden bir kod yaziniz.
        System.out.println("abchd".matches("[a-zA-Z]{5}"));// false 5 ten fazla karakter iceriyor
        System.out.println("123456".matches("[0-9]{6,}"));//true en az 6 rakam iceriyor
        System.out.println("12345".matches("[0-9{6,]"));// false 6dan fazla rakam iceriyor
        // \\ w = [a zA-Z0-9]
        // ilk karakter 1; IKINCI KARAKTER NOKTALAMA isareti kalan 8 karakter rakam toplam 10 karakter.
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}")); // true
    }

}
