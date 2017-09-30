package com.stefanygo.gascalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startButton(View v){
        Toast.makeText(getApplicationContext(), "Start Your Journey!", Toast.LENGTH_SHORT).show();
        Bundle bundle = new Bundle();
        bundle.putString("carData", " . . ");
        Intent chooseCar = new Intent(MainActivity.this,ChooseCar.class);
        chooseCar.putExtras(bundle);
        startActivity(chooseCar);
    }


}
