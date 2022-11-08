package io.proj3ct.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private CarEngine carEngine;
    @Value("${car.manufacturer}")
    private String manufacture;

    private String model;

    public Car(String model){
        this.model = model;
    }

    public Car(){}
    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void getEngineModel(){
        System.out.println(carEngine.getEngineType());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
