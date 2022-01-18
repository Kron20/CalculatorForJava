package Task;

import java.util.HashMap;
import java.util.InputMismatchException;

public class RomeNumbers extends Calculator {
    public static void romanResult(String a, String b) {
        number1 = toRomeNumber(a);
        number2 = toRomeNumber(b);
        if (number1 < 0 && number2 < 0) {

        } else {
try {
    isItDifferentNumbers(number1);
    isItDifferentNumbers(number2);
}
catch (ArrayIndexOutOfBoundsException e){
    throw new ArrayIndexOutOfBoundsException("Нужно ввести 2 арабских или 2 римских числа");
}

            result = calculat(number1, number2, c);
            String resultRoman = convertNumToRoman(result);
            System.out.println(resultRoman);
            System.exit(0);
        }
    }
    public static String convertNumToRoman(int arrabNumb) {
        String[] romeNumbers = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        try {
            String arabRome = romeNumbers[arrabNumb];
            return arabRome;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В римской системе нет отрицательных чисел");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private static int toRomeNumber(String rome) {
        try {
            if (rome.equals("I")) {
                return 1;
            } else if (rome.equals("II")) {
                return 2;
            } else if (rome.equals("III")) {
                return 3;
            } else if (rome.equals("IV")) {
                return 4;
            } else if (rome.equals("V")) {
                return 5;
            } else if (rome.equals("VI")) {
                return 6;
            } else if (rome.equals("VII")) {
                return 7;
            } else if (rome.equals("VIII")) {
                return 8;
            } else if (rome.equals("IX")) {
                return 9;
            } else if (rome.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Error");
        }
        return -1;
    }
    private static void isItDifferentNumbers(int number){
        int[]notNegativeNumb=new int[11];
          notNegativeNumb[number]=number;

    }
}