package Lesson6HW;

import java.util.Arrays;
/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть.
В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Соревнуются коты:");
        catsRunAndSwim();
        System.out.println();
        System.out.println("Соревнуются собаки:");
        dogsRunAndSwim();

    }
    public static void catsRunAndSwim() {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Беляшик", 5, 0, 250);
        cats[1] = new Cat("Барсик", 3, 0, 150);
        cats[2] = new Cat("Мурка", 4, 0, 185);

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кошка " + (i + 1) + ": " + cats[i].getName() + ", возраст: " + cats[i].getAge());
            cats[i].swim();
            cats[i].run();
        }
        System.out.println("Всего участвовало кошек: " + cats.length);
        System.out.println();
    }

    public static void dogsRunAndSwim () {
        Dog[] dogs = new Dog[4];
        dogs[0] = new Dog("Шарик", 6, 12, 250);
        dogs[1] = new Dog("Бобик", 5, 8, 600);
        dogs[2] = new Dog("Барбос", 3, 9, 300);
        dogs[3] = new Dog("Пират", 8, 6, 450);

        for (int i = 0; i < dogs.length; i++) {
                System.out.println("Собака " + (i + 1) + ": " + dogs[i].getName() + ", возраст " + dogs[i].getAge());
                dogs[i].swim();
                dogs[i].run();
        }
        System.out.println("Всего участвовало собак: " + dogs.length);
    }


}
