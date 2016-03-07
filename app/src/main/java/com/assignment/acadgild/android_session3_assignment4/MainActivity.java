package com.assignment.acadgild.android_session3_assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText txtEmail, txtPW;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = (EditText) findViewById(R.id.etEmail);
        txtPW = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        txtEmail.requestFocus();

        btnLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (txtEmail.getText().toString().equals("mukund@gmail.com") && txtPW.getText().toString().equals("mukund")) {
                            Toast.makeText(MainActivity.this, "Login Successfully" , Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Login Un-Successfully" + txtEmail.getText().toString() + " --- " + txtPW.getText().toString(), Toast.LENGTH_SHORT).show();
                            txtEmail.setText("");
                            txtPW.setText("");
                            txtEmail.requestFocus();
                        }
                    }
                }
        );
    }
}
