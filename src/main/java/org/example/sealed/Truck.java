package org.example.sealed;


// modifiers for permitted subclasses
// final - not allowing any further extension
// sealed - allowing but controlled using permits
// non-sealed - allowing further extension completely
public non-sealed class Truck extends Vehicle implements Service {

  private final int capacity;

  public Truck(String registrationNumber, int capacity) {
    super(registrationNumber);
    this.capacity = capacity;
  }

  public int getCapacity() {
    return capacity;
  }

  @Override
  public int getMaxServiceIntervalInMonths() {
    return 55;
  }
}
