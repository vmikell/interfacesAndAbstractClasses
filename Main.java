package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(60);

        CarInterface fossilCarInterface = new FossilFuelcar("Mercedes");
        fossilCarInterface.start();
        fossilCarInterface.move(100);


    }
}
