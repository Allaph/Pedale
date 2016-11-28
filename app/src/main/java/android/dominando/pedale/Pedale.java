package android.dominando.pedale;

import android.dominando.pedale.model.Bike;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pedale extends AppCompatActivity {

    Bike bicicleta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedale);
        bicicleta1 = new Bike("Caloi" ,200);
        System.out.println("Name: " + bicicleta1.getName());
        System.out.println("Price: " + bicicleta1.getPrice());
    }
}
