package android.dominando.pedale.model;

/**
 * Created by Absyd on 26/11/2016.
 */

public class Bike {

    private String mName;
    private Float mPrice;
    private String mColor;
    private Integer mWeight;

    public Bike(String name, Float price, String color, Integer weight) {
        this.mName   = name;
        this.mPrice  = price;
        this.mColor  = color;
        this.mWeight = weight;

    }

    public String getName() {
        return mName;
    }

    public Float getPrice(){
        return mPrice;
    }

    public String getColor() {
        return mColor;
    }

    public Integer getWeight() {
        return mWeight;
    }

    public Float getPromotion(Float discount){
        Float newPrice;
        newPrice = mPrice - discount;
        return newPrice;
    }
}
