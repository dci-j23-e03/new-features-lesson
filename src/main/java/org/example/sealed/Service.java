package org.example.sealed;

public sealed interface Service permits Car, Truck, ExtendedService {

  int getMaxServiceIntervalInMonths();

  default int getMaxDistanceBetweenServicesInKilometers() {
    return 100000;
  }
}
