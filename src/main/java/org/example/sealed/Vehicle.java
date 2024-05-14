package org.example.sealed;

public abstract sealed class Vehicle permits Truck, Car {

  private final String registrationNumber;

  public Vehicle(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }
}
