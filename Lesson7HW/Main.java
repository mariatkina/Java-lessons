package Lesson7HW;

import java.util.Scanner;

/*1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой,
попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.*/
public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 150);
        cats[1] = new Cat("Мурзик", 200);
        cats[2] = new Cat("Пушок", 100);
        cats[3] = new Cat("Беляшик", 250);
        cats[4] = new Cat("Черныш", 120);
        Plate plate = new Plate(900, 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Всего в тарелке было "+ plate.getFoodAmount() + " грамм еды:");
        System.out.println();


        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " приступил к еде");
            System.out.println(cats[i].getName() + " всегда ест " + cats[i].getAppetite() + " грамм еды");



                if (cats[i].eat(plate)) {
                    System.out.println(cats[i].getName() + " наелся");
                    System.out.println("В тарелке осталось " + plate.getFoodAmount() + " грамм еды");
                    System.out.println();

                } else {
                    System.out.println(cats[i].getName() + " не ест! Ему не хватило еды!");
                    System.out.println("Сколько граммов еды добавить в тарелку?");
                    plate.setAddFood(scanner.nextInt());

                    if (cats[i].eat(plate)) {
                        System.out.println(cats[i].getName() + " наелся");
                        System.out.println("В тарелке осталось " + plate.getAddFood() + " грамм еды");
                        System.out.println();

                    } else {
                        System.out.println(cats[i].getName() + " не ест! Ему не хватило еды!");
                        System.out.println("Сколько граммов еды добавить в тарелку?");
                        plate.setAddFood(scanner.nextInt());
                    }

                    System.out.println();

                }


        }

    }

}
