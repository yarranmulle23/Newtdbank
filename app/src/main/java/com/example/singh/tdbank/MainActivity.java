package com.example.singh.tdbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void transfer (View view) {
        Intent intent = new Intent(this, Transfer.class);
        startActivity(intent);

    }
    public void paynow (View view) {
        Intent intent = new Intent(this, Paynow.class);
        startActivity(intent);
    }
    public void depo (View view) {
        Intent intent = new Intent(this, Deposit.class);
        startActivity(intent);
    }
    public void me (View view) {
        Intent intent = new Intent(this, TDforme.class);
        startActivity(intent);
    }
    public void inve (View view) {
        Intent intent = new Intent(this, Investing.class);
        startActivity(intent);
    }
    public void bill (View view) {
        Intent intent = new Intent(this, Bills.class);
        startActivity(intent);
    }
    public void sear (View view) {
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }
    public void transfers (View view) {
        Intent intent = new Intent(this, Newtransfer.class);
        startActivity(intent);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
