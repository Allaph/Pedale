package android.dominando.pedale;

import android.dominando.pedale.model.Bike;
import android.dominando.pedale.model.Person;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.SQLOutput;

public class Pedale extends AppCompatActivity {

    Bike bicicleta1;
    Person cliente;
    TextView textViewName, textViewPrice, textViewColor, textViewWeight;
    TextView textViewNamePerson, textViewAddress, textViewCpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedale);

        bicicleta1 = new Bike("Caloi", 200, "blue", 8);

        cliente = new Person("Gabriel", "Farol", "10794897460");

        textViewName   = (TextView) findViewById(R.id.name_bike);
        textViewPrice  = (TextView) findViewById(R.id.price_bike);
        textViewColor  = (TextView) findViewById(R.id.color_bike);
        textViewWeight = (TextView) findViewById(R.id.weight_bike);

        textViewNamePerson = (TextView) findViewById(R.id.namePerson_person);
        textViewAddress = (TextView) findViewById(R.id.address_person);
        textViewCpf = (TextView) findViewById(R.id.cpf_person);

        String price  = bicicleta1.getPrice().toString();
        String weight = bicicleta1.getWeight().toString();

        textViewName.setText(bicicleta1.getName());
        textViewPrice.setText(price);
        textViewColor.setText(bicicleta1.getColor());
        textViewWeight.setText(weight);

        textViewNamePerson.setText(cliente.getName());
        textViewAddress.setText(cliente.getAddress());
        textViewCpf.setText(cliente.getCpf());
    }
}

