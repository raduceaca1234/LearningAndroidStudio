package com.ceaca.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();

    }

    public void guessIt(View view){
        EditText editText = (EditText)findViewById(R.id.editText2);
        int userGuest = Integer.parseInt(editText.getText().toString());

        if(userGuest>randomNumber)
            makeToast("Lower!");
        else if(userGuest<randomNumber)
            makeToast("Higher!");
        else
        {
            makeToast("That's right! Play again!");
            Random random = new Random();
            randomNumber = random.nextInt(20)+1;
        }
        //Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        randomNumber = random.nextInt(20)+1;
    }
}
