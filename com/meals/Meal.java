package com.meals;

import com.meals.Food;
import java.util.ArrayList;
import java.time.LocalDateTime;
import com.meals.Category;
import java.util.Set;
import java.util.HashSet;

class Meal {
  private double calories;
  private double fat;
  private double carbohydrates;
  private double protein;
  private String name;
  private LocalDateTime mealTime;
  private ArrayList<Food> foods = new ArrayList<Food>();
  private ArrayList<Category> categories = new ArrayList<Category>();

  Meal (String name, ArrayList<Food> foods) {
    this.name = name;
    this.mealTime = LocalDateTime.now();
    for (int i = 0; i < foods.size(); i++) {
      Food currentFood = foods.get(i);
      this.calories += currentFood.getCalories();
      this.fat += currentFood.getFat();
      this.carbohydrates += currentFood.getCarbohydrates();
      this.protein += currentFood.getProtein();
      ArrayList<Category> currentCategories = currentFood.getCategories();
      for (int j = 0; j < currentCategories.size(); j++) {
        this.categories.add(currentCategories.get(j));
      }
      this.foods.add(currentFood);
    }
  }

  public double getCalories() {
    return this.calories;
  }

  public double getFat() {
    return this.fat;
  }

  public double getCarbohydrates() {
    return this.carbohydrates;
  }

  public double getProtein() {
    return this.protein;
  }

  public String getName() {
    return this.name;
  }

  public LocalDateTime getMealTime() {
    return this.mealTime;
  }

  public void viewFoods() {
    for(int i = 0; i < this.foods.size(); i++) {
      Food currentFood = this.foods.get(i);
      System.out.println(currentFood.getName());
    }
  }

  public Set<Category> getCategories() {
    Set<Category> uniqueCategories = new HashSet<Category>(this.categories);
    return uniqueCategories;
  }
}
