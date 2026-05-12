package org.example;
import java.math.BigDecimal;
public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue(){
        BigDecimal subtotal = getOriginalCost();
        BigDecimal checker = new BigDecimal("11000");
        BigDecimal checker2 = new BigDecimal("10000");
        String searchText = "Honda";
        String searchText2 = "Toyota";


        if(year > 0 && year < 4){
            BigDecimal addThing = new BigDecimal("0.03");
            BigDecimal addOThing = BigDecimal.valueOf(year);
            BigDecimal addThing2 = subtotal.multiply(addThing);
            BigDecimal addThing3 = addThing2.multiply(addOThing);
            subtotal = subtotal.subtract(addThing3);
            if(subtotal.compareTo(checker) == -1){
                subtotal = checker;
            }
        }
        if(year > 3 && year < 7){
            BigDecimal addThing = new BigDecimal("0.06");
            BigDecimal addOThing = BigDecimal.valueOf(year);
            BigDecimal addThing2 = subtotal.multiply(addThing);
            BigDecimal addThing3 = addThing2.multiply(addOThing);
            subtotal = subtotal.subtract(addThing3);
            if(subtotal.compareTo(checker) == -1){
                subtotal = checker;
            }
        }
        if(year > 6 && year < 11){
            BigDecimal addThing = new BigDecimal("0.08");
            BigDecimal addOThing = BigDecimal.valueOf(year);
            BigDecimal addThing2 = subtotal.multiply(addThing);
            BigDecimal addThing3 = addThing2.multiply(addOThing);
            subtotal = subtotal.subtract(addThing3);
            if(subtotal.compareTo(checker) == -1){
                subtotal = checker;
            }
        }
        if(year > 10){
            subtotal = checker2;
        }
        if(odometer > 100000){
            if(!makeModel.contains("Honda") && !makeModel.contains("Toyota")) {
                BigDecimal percent = new BigDecimal("0.25");
                BigDecimal checker3 = subtotal.multiply(percent);
                subtotal = subtotal.subtract(checker3);
            }
        }
        return subtotal;

    }
}
