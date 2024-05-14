package org.example.records;

import java.io.Serializable;

public record Data(@Deprecated int x, int y, int z) implements Serializable {

  public static final double PI = 3.14;
  private static double someDouble = 0.0;

  public int sum() {
    return x + y + z;
  }

  public static double getPI() {
    return PI;
  }

  public static double getSomeDouble() {
    return someDouble;
  }

  public static void setSomeDouble(double someDouble) {
    Data.someDouble = someDouble;
  }

  @Override
  public String toString() {
    return "Data {y=" + y + ", z=" + z + "}";
  }
}

// can't extend with a class
//class ExtendedData extends Data {
//
//  public ExtendedData(int x, int y) {
//    super(x, y);
//  }
//}

// can't extend with another record
//record ExtendedData() extends Data { }

// not possible to extend Record class directly, only implicitly by usage of 'record' keyword
//class SomeRecord extends Record { }