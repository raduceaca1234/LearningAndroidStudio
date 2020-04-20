package com.ceaca.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText editText = (EditText)findViewById(R.id.dollarEdittext);
        Double dollarAmountDouble = Double.parseDouble(editText.getText().toString());
        Double euroAmount = dollarAmountDouble * 0.92;
        Toast.makeText(MainActivity.this,"EUR = " + String.format("%.2f",euroAmount),Toast.LENGTH_SHORT).show();
        Log.i("amout",editText.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
