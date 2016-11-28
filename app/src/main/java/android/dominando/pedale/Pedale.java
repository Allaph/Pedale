package android.dominando.pedale;

import android.dominando.pedale.model.Bike;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pedale extends AppCompatActivity {

    Bike bicicleta1;
    TextView textViewName, textViewPrice, textViewColor, textViewWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedale);

        bicicleta1 = new Bike("Caloi", 200, "blue", 8);

        textViewName   = (TextView) findViewById(R.id.name_bike);
        textViewPrice  = (TextView) findViewById(R.id.price_bike);
        textViewColor  = (TextView) findViewById(R.id.color_bike);
        textViewWeight = (TextView) findViewById(R.id.weight_bike);

        String price  = bicicleta1.getPrice().toString();
        String weight = bicicleta1.getWeight().toString();

        textViewName.setText(bicicleta1.getName());
        textViewPrice.setText(price);
        textViewColor.setText(bicicleta1.getColor());
        textViewWeight.setText(weight);

        System.out.println("Name: "   + bicicleta1.getName());
        System.out.println("Price: "  + bicicleta1.getPrice());
        System.out.println("Color: "  + bicicleta1.getColor());
        System.out.println("Weight: " + bicicleta1.getWeight());
    }
}
