package com.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView info;
    private EditText E1,E2;
    private Button B1;
    String use,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1=(EditText)findViewById(R.id.ename);
        E2=(EditText)findViewById(R.id.epass);
        info=(TextView) findViewById(R.id.etxt);
        B1=(Button) findViewById(R.id.ebtn);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                use=E1.getText().toString();
                pass=E2.getText().toString();
                if (use.equals("shahana") && pass.equals("123"))
                {
                    Toast.makeText(getApplicationContext(),"login successful",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,Main.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"login unsuccessful",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}