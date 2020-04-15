package com.example.wellnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Patterns;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity{
    private Button button1;
    EditText email, password;
    boolean isEmailValid, isPasswordValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = (EditText)findViewById(R.id.Email);
        password = (EditText)findViewById(R.id.Password);



        button1 = (Button) findViewById(R.id.Cbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValidation();
                if(isEmailValid && isPasswordValid){
                    openContentTable();
                }
            }
        });
    }

    public void setValidation(){
        if(email.getText().toString().isEmpty()){
            email.setError(getResources().getString(R.string.emailError));
            isEmailValid = false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
            email.setError(getResources().getString(R.string.errorInvalidEmail));
            isEmailValid = false;
        }
        else{
            isEmailValid = true;
        }

        // Check for a valid password.
        if (password.getText().toString().isEmpty()) {
            password.setError(getResources().getString(R.string.passwordError));
            isPasswordValid = false;
        } else if (password.getText().length() < 6) {
            password.setError(getResources().getString(R.string.errorInvalidPassword));
            isPasswordValid = false;
        } else  {
            isPasswordValid = true;
        }

        if (isEmailValid && isPasswordValid) {
            //Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();
        }

    }


    public void openContentTable(){
        Intent intent = new Intent(this, ContentTable.class);
        startActivity(intent);
    }
}
