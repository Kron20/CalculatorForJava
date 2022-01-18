package Task;

public class ArrabianNumbers extends Calculator {
    public static void arrabianResult(String a, String b) {
        int[] from1To10 = new int[11];
        try {
            number1 = stringToInt(a);
            number2 = stringToInt(b);
            for (int i = 0; i < from1To10.length; i++) {
                from1To10[i] = i + 1;
            }
            from1To10[number1] = number1;
            from1To10[number2] = number2;
            result = calculat(number1, number2, c);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Число должно быть от 1 до 10");
            throw new ArrayIndexOutOfBoundsException();
        } catch (NumberFormatException e) {
            System.out.println("Используйте только арабские или только римские цифры!");
            throw new NumberFormatException();
        }
    }

    private static int stringToInt(String line) {
        try {
            if (Integer.parseInt(line) == 1) {
                return 1;
            } else if (Integer.parseInt(line) == 2) {
                return 2;
            } else if (Integer.parseInt(line) == 3) {
                return 3;
            } else if (Integer.parseInt(line) == 4) {
                return 4;
            } else if (Integer.parseInt(line) == 5) {
                return 5;
            } else if (Integer.parseInt(line) == 6) {
                return 6;
            } else if (Integer.parseInt(line) == 7) {
                return 7;
            } else if (Integer.parseInt(line) == 8) {
                return 8;
            } else if (Integer.parseInt(line) == 9) {
                return 9;
            } else if (Integer.parseInt(line) == 10) {
                return 10;
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error");
        }
        return -1;
    }
}