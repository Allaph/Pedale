package android.dominando.pedale.model;

/**
 * Created by Absyd on 26/11/2016.
 */

public class Bike {

    private String mName;
    private Integer mPrice;
    private String mColor;
    private Integer mWeight;

    public Bike(String name, Integer price, String color, Integer weight) {
        this.mName   = name;
        this.mPrice  = price;
        this.mColor  = color;
        this.mWeight = weight;

    }

    public String getName() {
        return mName;
    }
    public Integer getPrice(){
        return mPrice;
    }

    public String getColor() {
        return mColor;
    }

    public Integer getWeight() {
        return mWeight;
    }
}
