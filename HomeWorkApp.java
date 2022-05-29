package FirstLessonHW;

import java.sql.SQLOutput;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();

    }

    private static void printThreeWords() {
               System.out.println(
                "Orange\n"+
                "Banana\n"+
                "Apple\n");
    }
    public static void checkSumSign() {
        int a = -23, b = 14, c = a + b;

        if (a >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 23, b = 24;
        if (a >= b) {
            System.out.println("a >= b: " + a + " >= " +b);
        }
        else {
            System.out.println("a < b: " + a + " < " +b);
        }
    }



}
