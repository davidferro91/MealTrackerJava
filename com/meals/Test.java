package com.meals;

import com.meals.Food;
import com.meals.Category;
import com.meals.Meal;
import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {
    User bill = new User("Bill", "Goodman", "billygoodie@gmail.com", 45);
    bill.setTargetAdherence(.90);
    bill.getUser();
    Food chocolate = new Food("chocolate", 300, 14, 35, 0);
    System.out.println(chocolate.getName());
    System.out.println(chocolate.getFat());
    chocolate.addCategory(Category.CONFECTION);
    chocolate.addCategory(Category.FAT);
    System.out.println(chocolate.getCategories());
    Food broccoli = new Food("broccoli", 10, 0, 13, 1);
    broccoli.addCategory(Category.VEGETABLE);
    ArrayList<Food> lunchArr = new ArrayList<Food>();
    lunchArr.add(chocolate);
    lunchArr.add(broccoli);
    Meal lunch = new Meal("lunch", lunchArr);
    lunch.viewFoods();
    System.out.println(lunch.getMealTime());
  }
}