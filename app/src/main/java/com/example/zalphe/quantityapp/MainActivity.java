package com.example.zalphe.quantityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variabel global
    Button pindahHalaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //mainprogram yg pertama di run
        //variabel lokal

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pindahHalaman = (Button)findViewById(R.id.btnpindah); //binding data trhd id

        pindahHalaman.setOnClickListener(new View.OnClickListener() {//membuat objek listener
            @Override
            public void onClick(View v) {
                //cara 1
                Intent i = new Intent(MainActivity.this, Main2Activity.class); //mendefinisikan dari activity mana mau kemana
                startActivity(i); //mengaktifkan activity i

                //intent perlu perizinan, setting di manifest
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantityTextView);
        quantityTextView.setText("" + number);
    }

    public void submitOrder(View v) {
        int coffee = 9;
        display(1);
        displayPrice(coffee * 5);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.priceTextView);
        priceTextView.setText("That would be $" + number + "\n Thankyou! hhe");
    }

    public void increment(View v) {
        display(3);
    }

    public void decrement(View v) {
        display(1);
    }



}
