package Lesson7HW;

import java.util.Scanner;

public class Cat {
    private String name;
    private int appetite;


    public Cat (String name, int appetite){

        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void setAppetite(){

        this.appetite = appetite;
    }
    public int getAppetite(){

        return appetite;
    }

    public boolean eat (Plate plate){
        int total = plate.getFoodAmount() + plate.getAddFood();
        if(plate.getFoodAmount()>= appetite) {
            plate.decreaseFoodAmount(appetite);
            return true;
        } else if (total >= appetite) {
            plate.decreaseFoodAmount(appetite);
            return true;
        }
        return false;

    }


}

