package org.example.sealed;

import java.io.Serializable;

public final class Car extends Vehicle implements Service {

  private final int seatsNumber;

  public Car(String registrationNumber, int seatsNumber) {
    super(registrationNumber);
    this.seatsNumber = seatsNumber;
  }

  public int getSeatsNumber() {
    return seatsNumber;
  }

  @Override
  public int getMaxServiceIntervalInMonths() {
    return 16;
  }
}
