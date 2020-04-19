package com.ceaca.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    public void logIn(View view){
        EditText userName = (EditText)findViewById(R.id.usernameEditText);
        EditText passWord = (EditText)findViewById(R.id.passwordEditText);

        Log.i("Info",userName.getText().toString());
        Log.i("Info",passWord.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
