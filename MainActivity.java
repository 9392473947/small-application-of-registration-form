package com.example.myregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickregister (View view)  {
        TextView textViewfirstname = findViewById(R.id.textViewfirstname);
        TextView textViewlastname = findViewById(R.id.textViewlastname);
        TextView textViewemail = findViewById(R.id.textViewemail);

        EditText editTextTextfirstname = findViewById(R.id.editTextTextfirstname);
        EditText editTextlastname = findViewById(R.id.editTextlastname);
        EditText editTextemail = findViewById(R.id.editTextemail);

        textViewfirstname.setText("first name: " + editTextTextfirstname.getText().toString());
        textViewlastname.setText("first name: " + editTextlastname.getText().toString());
        textViewemail.setText("first name: " + editTextemail.getText().toString());

    }
}