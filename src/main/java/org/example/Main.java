package org.example;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BigDecimal subtotal = new BigDecimal("74000");
        Vehicle vehicle = new Vehicle("coolCar", "2020", subtotal, "Tesla", 11, 145000);
        House house = new House("Asheville, NC 28803", 1, 2000, 1200);

        System.out.println(vehicle.getValue());
        System.out.println(house.getValue());
        System.out.println("done");
    }
}