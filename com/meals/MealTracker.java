package com.meals;

import java.util.ArrayList;

import com.meals.Meal;

class MealTracker {
  private ArrayList<Meal> meals = new ArrayList<Meal>();

  MealTracker (ArrayList<Meal> meals) {
    this.meals = meals;    
  }

  public void addMeal(Meal newMeal) {
    this.meals.add(newMeal);
  }

  public void viewMeals() {
    for(int i = 0; i < this.meals.size(); i++) {
      Meal currentMeal = this.meals.get(i);
      System.out.println(currentMeal.getName());
    }
  }
  
  public int getMealCount() {
    return this.meals.size();
  }

  public double getAdherence() {
    double adherenceSum = 0;
    double adherence;
    for(int i = 0; i < meals.size(); i++) {
      Meal currentMeal = meals.get(i);
      adherenceSum += (currentMeal.getCategories().size() / 6);
    }
    adherence = adherenceSum / meals.size();
    return adherence;
  }

  public boolean isOnTrack(double threshold) {
    if (this.getAdherence() >= threshold) {
      return true;
    } else {
      return false;
    }
  }
}