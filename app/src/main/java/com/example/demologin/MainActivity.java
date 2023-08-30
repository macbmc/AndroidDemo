package com.example.demologin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = (EditText) findViewById(R.id.usrnametext);
        EditText password = (EditText) findViewById(R.id.passtext);

        Button loginbtn = (Button) findViewById(R.id.Signinbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().toString().trim().length()==0||password.getText().toString().trim().length()==0)
                {
                    Toast.makeText(MainActivity.this,"Login failed,check credentials",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Login succesful ",Toast.LENGTH_SHORT).show();
                    String uname=username.getText().toString();
                    String psw=password.getText().toString();
                    Intent intent = new Intent(MainActivity.this,HomeActivity2.class);
                    intent.putExtra("username",uname);
                    intent.putExtra("psw",psw);
                    startActivity(intent);
                }

            }
        });
    }
}