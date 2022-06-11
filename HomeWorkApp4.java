package FirstLessonHW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.*/

public class HomeWorkApp4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[][] table;
    static int size = 5;
    static final char xMark = 'X';
    static final char oMark = 'O';
    static final char empty = '.';


    public static void main(String[] args) {
        initTable();
        printTable();

        while (true){
        turnHuman();
        printTable();
            if (checkWin(xMark)){
                System.out.println("Ты выиграл!");
                break;
            }

            if (tableIsFull()){
                System.out.println("Ничья!");
                break;
            }

            turnAI();
            printTable();
            if (checkWin(oMark)){
                System.out.println("Компьютер выиграл!");
                break;
            }
        }

    }

    //проверка заполнения всех ячеек таблицы:
    private static boolean tableIsFull(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if (table[i][j] == empty) return false;

            }

        }
        return true;
    }

    //условия выигрыша:
    private static boolean checkWin(char symbol) {
        for (int i = 0; i < size; i++) {

                if ((table[0][i] == symbol) && (table[1][i] == symbol) && (table[2][i] == symbol) && (table[3][i] == symbol) && (table[4][i] == symbol)) return  true;
                if ((table[i][0] == symbol) && (table[i][1] == symbol) && (table[i][2] == symbol) && (table[i][3] == symbol) && (table[i][4] == symbol)) return  true;
                if ((table[0][0] == symbol) && (table[1][1] == symbol) && (table[2][2] == symbol) && (table[3][3] == symbol) && (table[4][4] == symbol)) return  true;
                if ((table[4][0] == symbol) && (table[3][1] == symbol) && (table[2][2] == symbol) && (table[1][3] == symbol) && (table[0][4] == symbol)) return  true;

        }



       /*предыдущее исполнение:
       if (table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol) return true;
        if (table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol) return true;
        if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) return true;
        if (table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol) return true;
        if (table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol) return true;
        if (table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol) return true;
        if (table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol) return true;
        if (table[2][0] == symbol && table[1][1] == symbol && table[0][2] == symbol) return true;
    */
        return false;}

    //печать таблицы:
    private static void printTable() {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    //создание таблицы:
    private static void initTable() {
        table = new char[size][size];
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < size; j++){
                table[i][j] = empty;
            }
        }

    }

    //ход игрока:
    private static void turnHuman () {
        int x, y;
        do {
            System.out.println("Введите через пробел два числа от 1 до 5. Выигрыш при совпадении 4 ячеек в ряду");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            } while (!isValidCell(x, y));
        table[x][y] = xMark;
    }

    //проверка правильности ввода данных:
    private static boolean isValidCell(int x, int y) {
        if (x < 0 || y < 0 || x >= size || y >= size) return false;
        if (table[x][y] == empty) return true;
        return false;

    }

    //ход компьютера:
    private static void turnAI (){
        int x, y;

        do {

            x = random.nextInt(4);
            y = random.nextInt(4);
        } while (!isValidCell(x, y));
        System.out.println("Компьютер ввел числа: " + (x+1) + " и " + (y+1));
        table[x][y] = oMark;

    }


}