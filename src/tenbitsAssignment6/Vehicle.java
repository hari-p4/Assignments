package com.company.tenbitsAssignment6;

public class Vehicle {

    private int price;
    private int capacity;
    public static void main(String[] args){
        Vehicle sedan = new Sedan();
        sedan.SameMethod(sedan);
    }

    public Vehicle SameMethod(Vehicle vehicle){

       if(vehicle != null){
           System.out.println("This is a VehicleClass");
       }
        return  new Vehicle();
    }
}

class Sedan extends Vehicle  {
    private int price;
    private int capacity;

    public Sedan SameMethod(Sedan sedan){

        if(sedan != null){
            System.out.println("This is SdeanClass");
        }
        return new Sedan();

    }
}

class SUV extends Vehicle  {
    private int price;
    private int capacity;

    public  SUV SameMethod(SUV suv){

            if(suv != null){
                System.out.println("This is SUVClass");
            }
        return new SUV();
    }
}

class Truck extends Vehicle  {
    private int price;
    private int capacity;

   
    public Truck SameMethod(Truck truck){

        if(truck != null){
            System.out.println("This is TruckClass");
        }
        return  new Truck();
    }
}