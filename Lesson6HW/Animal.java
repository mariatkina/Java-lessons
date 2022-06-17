package Lesson6HW;

public abstract class Animal {
    private String name;
    private int age;
    private int swimDistance;
    private int runDistance;



    public abstract void sleep();//пробный

    public Animal (String name, int age, int swimDistance, int runDistance) {
        this.name = name;
        this.age = age;
        this.swimDistance = swimDistance;
        this.runDistance = runDistance;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", swimDistance=" + swimDistance +
                ", runDistance=" + runDistance +
                '}';
    }


    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int runDistance) {
    }


    public void swim(int swimDistance) {
    }

}
