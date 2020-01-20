package com.company.tenbitsAssignment8;

import java.util.HashMap;
import java.util.Map;

public class VehicleService {
    Map<String, String> typeandModel = new HashMap<>();
    Map<String, Integer> typeandYear = new HashMap<>();

    private   void vehicleCRUDMap(){


        typeandModel.put("SUV", "crv");
        typeandModel.put("Sedan", "corolla");
        typeandModel.put("truck", "colorado");
        typeandModel.put("convertible", "chevrolet camaro");

        typeandYear.put("suv", 2018);

    }
    public  void searchVehicle( String m ){
            vehicleCRUDMap();

        if(typeandModel.containsKey(m)){
            String modelName = typeandModel.get(m);
                 System.out.println(modelName);
        }
        else {
            System.out.println("No value found");
        }

    }
    public void createValueinMap(String type, String model){
        vehicleCRUDMap();
        typeandModel.put(type, model);
        String recentEntryType = typeandModel.get(type);
        System.out.println( type+ "  has  " + recentEntryType);
    }
    public void removeValuefromMap(String type){
        vehicleCRUDMap();
        System.out.println("The value associated with " +type+ " has been removed from HashMap");
        typeandModel.remove(type);
        System.out.println("Remaining Entry set(s) are " +typeandModel);

    }


}
