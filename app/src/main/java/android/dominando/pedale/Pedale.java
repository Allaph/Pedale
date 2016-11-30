package android.dominando.pedale;

import android.dominando.pedale.model.Bike;
import android.dominando.pedale.model.Person;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Pedale extends AppCompatActivity {

    Bike bikeOne;
    Bike bikeTwo;
    Bike bikeThree;

    List<Bike> bikes;

    Person cliente;

    TextView textViewName;
    TextView textViewPrice;
    TextView textViewColor;
    TextView textViewWeight;
    TextView textViewNamePerson;
    TextView textViewAddress;
    TextView textViewCpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedale);

        bikes = new ArrayList<>();

        bikeOne   = new Bike("Caloi", 200f, "blue", 8);
        bikeTwo   = new Bike("Monark", 500f, "black", 12);
        bikeThree = new Bike("Oggi", 1000f, "red", 9);

        bikes.add(bikeOne);
        bikes.add(bikeTwo);
        bikes.add(bikeThree);

        cliente = new Person("Gabriel", "Farol", "10794897460");

        textViewName   = (TextView) findViewById(R.id.name_bike);
        textViewPrice  = (TextView) findViewById(R.id.price_bike);
        textViewColor  = (TextView) findViewById(R.id.color_bike);
        textViewWeight = (TextView) findViewById(R.id.weight_bike);

        textViewNamePerson = (TextView) findViewById(R.id.namePerson_person);
        textViewAddress = (TextView) findViewById(R.id.address_person);
        textViewCpf = (TextView) findViewById(R.id.cpf_person);

        String price  = bikeOne.getPromotion(10f).toString();
        String weight = bikeOne.getWeight().toString();

        textViewName.setText(bikeOne.getName());
        textViewPrice.setText(price);
        textViewColor.setText(bikeOne.getColor());
        textViewWeight.setText(weight);

        textViewNamePerson.setText(cliente.getaddName("Rosa"));
        textViewAddress.setText(cliente.getAddress());
        textViewCpf.setText(cliente.getCpf());
    }
}

