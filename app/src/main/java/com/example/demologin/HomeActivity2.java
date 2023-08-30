package com.example.demologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class HomeActivity2 extends AppCompatActivity {

    TextView uname,psw;
    String name,pswrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        uname=findViewById(R.id.user);
        psw=findViewById(R.id.psw);

        Button logoutbtn = (Button) findViewById(R.id.logoutbtn);

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        name=getIntent().getExtras().getString("username");
        pswrd=getIntent().getExtras().getString("psw");

        uname.setText(name);
        psw.setText(pswrd);


    }
}