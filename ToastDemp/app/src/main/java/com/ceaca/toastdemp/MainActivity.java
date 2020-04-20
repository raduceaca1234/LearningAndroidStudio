package com.ceaca.toastdemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sayHi(View view){
        EditText nameEdit = (EditText)findViewById(R.id.nameEditText);
        Toast.makeText(MainActivity.this, "Hi there "+nameEdit.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
