package prakcticeAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {
    public static void main(String[] args) {

        // Fahrenheit degeri Celsius degere ceviren bir kod yaziniz.
        // formül:c (f-32)*5/9
        Scanner input = new Scanner (System.in);
        System.out.println("Fahrenheit degeri giriniz");
        double f= input.nextDouble();
        double c = (f-32)*5/9;
        System.out.println(c);

        NumberFormat numberFormat = new DecimalFormat(",##");
        String formattedC = numberFormat.format(c);
        System.out.println("formattedC = + formattedC");
        double doubleC = Double. valueOf(formattedC);
        System.out.println("doubleC =" + (doubleC+1));
        }
    }

