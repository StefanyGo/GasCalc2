package com.stefanygo.gascalc;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ChooseCar extends AppCompatActivity {
    FloatingActionButton fab;
    RadioGroup rg;
    RadioButton rb;
    Car newCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_car);
        Bundle extras = getIntent().getExtras();
        String carDetailsIntent = extras.getString("carData");
        String[] carDetails = carDetailsIntent.split(".");
        System.out.println(carDetails);
       // newCar = new Car(carDetails[0],carDetails[1], carDetails[2]);
       // addRadioButtons(1, newCar.getModel(), newCar.getMake(), newCar.getYear());

        fab = (FloatingActionButton)findViewById(R.id.fabPlus);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(ChooseCar.this,AddCarDetailsPage.class));
            }
        });

    }
    public void rbClick(View v) {
        int rbID = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(rbID);
        Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_LONG).show();
    }

    public void addRadioButtons(int number, String model, String make, String year){
        for (int row = 0; row < 1; row++) {

            for (int i = 0; i < number; i++) {
                RadioButton rdbtn = new RadioButton(this);
                rdbtn.setId((row * 2) + i);
                rdbtn.setText(model+", "+make+", "+year);

                rdbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        rbClick(view);
                    }
                });

                rg.addView(rdbtn);
            }
        }
    }
}
