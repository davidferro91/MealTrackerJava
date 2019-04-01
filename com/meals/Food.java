package com.meals;

import java.util.*;

class Food {
  private double calories;
  private double fat;
  private double carbohydrates;
  private double protein;
  private String name;
  private ArrayList<Category> categories = new ArrayList<Category>();

  Food (String name, double calories, double fat, double carbohydrates, double protein) {
    this.name = name;
    this.calories = calories;
    this.fat = fat;
    this.carbohydrates = carbohydrates;
    this.protein = protein;
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

  public ArrayList<Category> getCategories() {
    return this.categories;
  }

  public void addCategory(Category category) {
    switch (category) {
      case FRUIT:
        this.categories.add(Category.FRUIT);
        break;
              
      case VEGETABLE:
        this.categories.add(Category.VEGETABLE);
        break;
                   
      case PROTEIN:
        this.categories.add(Category.PROTEIN);
        break;

      case FAT:
        this.categories.add(Category.FAT);
        break;
              
      case DAIRY:
        this.categories.add(Category.DAIRY);
        break;
              
      case GRAIN:
        this.categories.add(Category.GRAIN);
        break;
      
      case CONFECTION:
        this.categories.add(Category.CONFECTION);
        break;
        
      default:
        this.categories.add(Category.WATER);
        break;
    }
  }
}