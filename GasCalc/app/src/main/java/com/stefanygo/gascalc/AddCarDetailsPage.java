package com.stefanygo.gascalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddCarDetailsPage extends AppCompatActivity {
    private EditText carMake, carModel, carYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car_details_page);
    }

    public void addCarButton(View v){
        carMake = (EditText)findViewById(R.id.cMake);
        carModel = (EditText)findViewById(R.id.cModel);
        carYear = (EditText)findViewById(R.id.cYear);
        String make = carMake.getText().toString();
        String mod = carModel.getText().toString();
        String year = carYear.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("carData", make+"."+mod+"."+year);
        Intent addCar = new Intent(AddCarDetailsPage.this,ChooseCar.class);
        addCar.putExtras(bundle);
        startActivity(addCar);
    }
}
