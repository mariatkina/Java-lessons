package Lesson7HW;

import java.util.Scanner;

public class Plate {
    private int foodAmount;
    private int addFood;

    public Plate(int foodAmount, int addFood){
        this.foodAmount = foodAmount;
        this.addFood = addFood;

    }

    public int getAddFood() {
        return addFood;
    }

    public void setAddFood(int addFood) {
        this.addFood = addFood;
    }

    public void setFoodAmount(int amount){
        this.foodAmount = amount;
    }
    public int getFoodAmount(){
        return foodAmount;
    }
    public void increaseFoodAmount(int foodToAdd){
        foodAmount += foodToAdd;

    }


    public void  decreaseFoodAmount(int foodToRemove){
        if (foodToRemove <= foodAmount) {
            foodAmount -= foodToRemove;
        }
        else {
            System.out.println("Не хватило еды!");
        }
    }
    public void addFood(int addFood){
        addFood += foodAmount;

    }


}
