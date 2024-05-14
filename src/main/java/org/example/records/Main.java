package org.example.records;

public class Main {

  public static void main(String[] args) {
    // record object is immutable, we can't update it after creation
    Data data = new Data(5, 10, 11);
    System.out.println(data);
    System.out.println(data.x());
    System.out.println(data.y());

    // equals
    var data1 = new Data(55, 6, 11);
    System.out.println(data.equals(data1));

    // hascode
    System.out.println(data.hashCode());
    System.out.println(data1.hashCode());

    // field access
    int fieldSum = data.sum();
    System.out.println(fieldSum);

    System.out.println(Data.PI);

  }
}