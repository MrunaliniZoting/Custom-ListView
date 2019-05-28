package com.mrunal.customlistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataItems extends AppCompatActivity {
TextView txtName,txtEmail,txtRoll,txtMob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_items);

        txtName=findViewById(R.id.txtName);
        txtEmail=findViewById(R.id.txtEmail);
        txtRoll=findViewById(R.id.txtRoll);
        txtMob=findViewById(R.id.txtMob);

        String name= getIntent().getExtras().getString("Name");
        String email=getIntent().getExtras().getString("Email");
        int roll=getIntent().getExtras().getInt("Roll");
        int mob=getIntent().getExtras().getInt("Mob");
        txtName.setText(name);
        txtEmail.setText(email);
        txtMob.setText(""+mob);
        txtRoll.setText(""+roll);



    }
}
