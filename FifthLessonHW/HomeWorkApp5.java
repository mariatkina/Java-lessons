package FifthLessonHW;

import java.util.Arrays;

public class HomeWorkApp5 {
    public static void main(String[] args) {



        personal();




    }


    private static void personal() {
        Person[] personArr = new Person[5];
 /*4. Создать массив из 5 сотрудников.*/
        personArr[0] = new Person("Boris Noga", "locksmith", "leg-bo@mail.ru", "+79889898888", 30000, 48);
        personArr[1] = new Person("Georgy Yoga", "mechanic", "geo-yo@mail.ru", "+79854654188", 31000, 43);
        personArr[2] = new Person("Samwel Inyan", "plumber", "s-in-yan@mail.ru", "+79333354188", 25000, 38);
        personArr[3] = new Person("Anjela Mergel", "sweeper", "angel-sweeper@mail.ru", "+79331354188", 28000, 40);
        personArr[4] = new Person("Inna Dver", "accountant", "count-door@mail.ru", "+79191364189", 40000, 35);

        

                System.out.println(Arrays.toString(personArr));


            }

    }








