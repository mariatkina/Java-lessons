package FirstLessonHW;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        numbersBetween ();
        someNegNumber();
        whataNumber ();
        helloFrom ();


    }


    public static boolean numbersBetween() {
        int a = 1;
        int b = 10;

            if ((a + b) > 10 && (a + b) <= 20) {
                return true;
            }
            else {
                return false;
        }
    }

    private static void someNegNumber() {
        int a = -2;
        if (a >= 0) {
            System.out.println("a - положительное число!");
        }
            else {
            System.out.println("a - отрицательное число!");
        }
        }

    private static void whataNumber() {
        int a = -20;

        if (a >= 0) {
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }
    }

    public static void helloFrom () {
        for(int i = 0; i < 4; i++) {
            System.out.println("Hello from Black Sea!");
        }
    }




}












