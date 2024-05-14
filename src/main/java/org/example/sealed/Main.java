package org.example.sealed;

public class Main {

  public static void main(String[] args) {
    Car car = new Car("123-123", 4);
    System.out.println(car.getMaxServiceIntervalInMonths());

    Truck truck = new Truck("444-999", 500);
    System.out.println(truck.getMaxServiceIntervalInMonths());
  }

}
