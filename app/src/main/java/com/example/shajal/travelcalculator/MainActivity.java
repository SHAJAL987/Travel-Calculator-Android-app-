package com.example.shajal.travelcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnbybus,btnbyair,btnbytrain;
    TextView tvoutput;
    EditText edtinput;

    float bybus   = (float) 2.0;
    float byair   = (float) 10.0;
    float bytrain = (float) 1.5;
    float cost    = (float) 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbybus   = (Button) findViewById(R.id.btnbybus);
        btnbyair   = (Button) findViewById(R.id.btnbyair);
        btnbytrain = (Button) findViewById(R.id.btnbytrain);

        edtinput   = (EditText) findViewById(R.id.edtinput);
        tvoutput   = (TextView) findViewById(R.id.tvoutput);


        btnbybus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float input = Float.parseFloat(edtinput.getText().toString());
                cost = input * bybus;
                tvoutput.setText(String.valueOf(cost));
            }
        });

        btnbyair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float input = Float.parseFloat(edtinput.getText().toString());
                cost = input * byair;
                tvoutput.setText(String.valueOf(cost));
            }
        });

        btnbytrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float input = Float.parseFloat(edtinput.getText().toString());
                cost = input * bytrain;
                tvoutput.setText(String.valueOf(cost));
            }
        });
    }
}
