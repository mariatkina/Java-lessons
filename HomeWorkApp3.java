package FirstLessonHW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        firstArray();
        secondArray();
        thirdArray();
        fourthArray();
        fifthArray();
        sixthArray();

    }


    public static void firstArray() {
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        int a = 0;
        int[] array = new int[10];
        System.out.println("Ответ на задание 1: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (a == 0) {
                array[i] = a + 1;
            }
        }
            System.out.println(Arrays.toString(array));
        /*for (int i = 0; i < array.length; i++) {
            if (a == 1) {
                array[i] = a - 1;
            }
        }
        System.out.println(Arrays.toString(array));*/
    }

    public static void secondArray() {
        /*2. Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
        int[] numbersHundred = new int[100];
        for (int i = 0; i < numbersHundred.length; i++) {
            numbersHundred[i] = i + 1;
        }
        System.out.println("Ответ на задание 2: " + Arrays.toString(numbersHundred));
    }

    public static void thirdArray() {
        /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

        int[] arrayOfNumbers = new int[12];
        int [] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        System.out.println("Ответ на задание 3: " + Arrays.toString(a));
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (a[i] < 6){
                a[i]*=2;
            }
            /*do {
                a[i]*=2;
            }

            while (a[i] < 6);*/

        }
        System.out.println(Arrays.toString(a));
    }

    public static void fourthArray() {
        /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
        int[][] tableFourToFour = new int[4][4];
        for (int i = 0; i < tableFourToFour.length;i++){
            for (int j = 0; j < tableFourToFour[i].length; j++){
                tableFourToFour[i][j] = 0;
            }
        }
        for (int i = 0; i < tableFourToFour.length;i++) {
            for (int j = 0; j < tableFourToFour[i].length; j++) {
                tableFourToFour[0][0] = 1;
                tableFourToFour[0][3] = 1;
                tableFourToFour[1][1] = 1;
                tableFourToFour[1][2] = 1;
                tableFourToFour[2][2] = 1;
                tableFourToFour[2][1] = 1;
                tableFourToFour[3][3] = 1;
                tableFourToFour[3][0] = 1;
            }
        }
        System.out.println("Ответ на задание 4: ");
        for (int i = 0; i < tableFourToFour.length; i++) {

            System.out.println(Arrays.toString(tableFourToFour[i]));}
    }
    public static void fifthArray() {
        /*5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
        int len;
        int initialValue;
        Scanner firstLine = new Scanner(System.in);
        Scanner secondLine = new Scanner(System.in);

        System.out.println("Введите количество элементов массива:");
        String tempLen = firstLine.nextLine();
        String[] tempString = tempLen.split(" ");
        len = Integer.parseInt(tempLen);


        System.out.println("Введите размер ячейки массива:");
        String tempVal = secondLine.nextLine();
        String[] tempStrings = tempVal.split(" ");
        initialValue = Integer.parseInt(tempVal);

        int[] arrayEnteredByClient = new int[len];
        for (int i = 0; i < arrayEnteredByClient.length; i++){
            arrayEnteredByClient[i] = initialValue;
        }
        System.out.println("Ответ на задание 5: " + Arrays.toString(arrayEnteredByClient));
    }

    public static void sixthArray() {
        /*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
        Random randomArray = new Random(1000);
        int[] arrayMinMax = new int[20];
        for (int i = 0; i < arrayMinMax.length; i++){
            arrayMinMax[i] = randomArray.nextInt(1000);

        }
        System.out.println("Ответ на задание 6: " + Arrays.toString(arrayMinMax));
        Arrays.sort(arrayMinMax);
        int a = arrayMinMax[0];
        int b = arrayMinMax[arrayMinMax.length -1];
        System.out.println("Минимальное число в массиве: " + a + ", максимальное число в массиве: " + b);

    }



}





