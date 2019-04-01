package com.meals;

class User {
  String firstName;
  String lastName;
  String emailAddress;
  int age;
  double targetAdherence;

  User (String firstName, String lastName, String emailAddress, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
    this.age = age;
  }

  public void setTargetAdherence(double target) {
    this.targetAdherence = target;
  }

  public void getUser() {
    System.out.println(String.format("First name: %s | Last Name: %s \r\nEmail Address: %s | Age: %d", this.firstName, this.lastName, this.emailAddress, this.age));
  }
}