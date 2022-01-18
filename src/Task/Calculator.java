package Task;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
    static char c;
    static String a, b;
    static int number1, number2;
    static int result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] elements = line.split("[+-/*]");
        String[] values = new String[2];
        try {
            for (int i = 0; i < elements.length; i++) {
                values[i] = elements[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Используйте два числа от 1 до 10");
            throw new ArrayIndexOutOfBoundsException();
        }
        a = values[0];
        b = values[1];
         try {
            char[] simbols = new char[9];
            for (int i = 0; i < line.length(); i++) {
                simbols[i] = line.charAt(i);
                if (simbols[i] == '-') {
                    c = '-';
                }
                if (simbols[i] == '+') {
                    c = '+';
                }
                if (simbols[i] == '*') {
                    c = '*';
                }
                if (simbols[i] == '/') {
                    c = '/';
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Некорректное значение");
            }
        try {
            RomeNumbers.romanResult(a, b);
        } catch (NullPointerException e) {
            throw new NullPointerException("Не является математической операцией");
        }
     ArrabianNumbers.arrabianResult(a,b);
    }
    public static int calculat(int number1, int number2, char c) {
        if (c == '*') {
            result = number1 * number2;
        } else if (c == '+') {
            result = number1 + number2;
        } else if (c == '-') {
            result = number1 - number2;
        } else if (c == '/') {

            try {
                result = number1 / number2;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception cached: " + e);
            }
        }
        return result;
    }
}
 
