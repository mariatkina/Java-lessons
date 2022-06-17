package Lesson6HW;

public class Dog extends Animal {
    public Dog(String name, int age, int swimDistance, int runDistance) {
        super(name, age, swimDistance, runDistance);
    }


    public void swim () {
        super.swim(getSwimDistance());

        System.out.println(getName() + " плывет.");

        if (getSwimDistance() > 10) {
            System.out.println(getName() + " не доплыл!");
        }
        else {
            System.out.println(getName() + " проплыл " + getSwimDistance() + " метров.");
        }
    }

    public void run () {
        super.run(getRunDistance());

        System.out.println(getName() + " бежит.");

        if (getRunDistance() > 500) {
            System.out.println(getName() + " не добежал!");
        } else {
            System.out.println(getName() + " пробежал " + getRunDistance() + " метров.");
        }
        System.out.println();
    }


    @Override
    public void sleep() {
        //пробный
        System.out.println("Собаки спят во дворе");
    }


}
