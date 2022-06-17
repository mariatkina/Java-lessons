package Lesson6HW;

public class Cat extends Animal {
    public Cat(String name, int age, int swimDistance, int runDistance) {
        super(name, age, swimDistance, runDistance);
    }

    public void swim () {
        System.out.println(getName() + " не поплывет, потому что не умеет плавать.");
    }

    public void run(){
        super.run(getRunDistance());

        System.out.println(getName() + " бежит.");

        if (getRunDistance() > 200) {
            System.out.println(getName() + " не добежал!");
        } else {
            System.out.println(getName() + " пробежал " + getRunDistance() + " метров.");
        }
        System.out.println();
    }

    @Override
    //пробный:
    public void sleep() {
        System.out.println("Cat sleeps on the windowsill");
    }
}
