package android.dominando.pedale.model;

/**
 * Created by Absyd on 26/11/2016.
 */

public class Bike {

    private String mName;
    private Integer mPrice;

    public Bike(String name, Integer price) {
        this.mName  = name;
        this.mPrice = price;

    }

    public String getName() {
        return mName;
    }
    public Integer getPrice(){
        return mPrice;
    }
}
