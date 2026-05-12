package org.example;

import java.math.BigDecimal;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String address, int condition, int squareFoot, int lotSize) {
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public BigDecimal getValue(){
        BigDecimal squareF = BigDecimal.valueOf(squareFoot);
        BigDecimal lotS = BigDecimal.valueOf(lotSize);
        BigDecimal lotz = BigDecimal.valueOf(0.25);
        lotS = lotS.multiply(lotz);
        BigDecimal subtotal = BigDecimal.valueOf(0);
        if(condition == 1){
            BigDecimal pricePerSquareFeet = BigDecimal.valueOf(180);
            subtotal = squareF.multiply(pricePerSquareFeet);
        }
        if(condition == 2){
            BigDecimal pricePerSquareFeet = BigDecimal.valueOf(130);
            subtotal = squareF.multiply(pricePerSquareFeet);
        }
        if(condition == 3){
            BigDecimal pricePerSquareFeet = BigDecimal.valueOf(90);
            subtotal = squareF.multiply(pricePerSquareFeet);
        }
        if(condition == 4){
            BigDecimal pricePerSquareFeet = BigDecimal.valueOf(80);
            subtotal = squareF.multiply(pricePerSquareFeet);
        }
    subtotal = subtotal.add(lotS);
    return subtotal;

    }
}
