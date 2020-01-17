package com.company.tenbitsAssignment7;

public class Truck implements  ISUV, ISedan, ITruck {

public  static void main(String [] a){
    Truck t = new Truck();
    t.sedan(25000);
    t.suv(38000);
    t.truck(54000);
}

    @Override
    public void suv(int price) {
        System.out.println("This is the price of SUV  "+ price);
    }

    @Override
    public void sedan(int price) {
        System.out.println("This is the price of SEDAN  "+ price);
    }

    @Override
    public void truck(int price) {
        System.out.println("This is the price of TRUCK  "+ price);
    }
}
