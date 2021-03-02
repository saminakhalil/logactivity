package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity<getDetail> extends AppCompatActivity {
    EditText emailet;
    EditText psaaet;
    TextInputLayout emailtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilization();

    }

    private void initilization() {
                emailet =findViewById(R.id.emailbt);
                psaaet=findViewById(R.id.passbts);
                emailtv=findViewById(R.id.emaillo);
    }
         private void getDetailt(){
        String email = emailet.getText().toString();
             String pass = psaaet.getText().toString();
             if(email.isEmpty()){
                 emailet.setError("email required");
             }
             else if(pass.isEmpty())
             {psaaet.setError("password required");
             }
             else{
                 Intent intend1 = new Intent(MainActivity.this,profile.class);
                 startActivity(intend1);
             }

         }

    public void login(View view) {
        getDetailt();


    }

    public void signup(View view) {
        Intent sign = new Intent(MainActivity.this,signup.class);
        startActivity(sign);
    }
}
