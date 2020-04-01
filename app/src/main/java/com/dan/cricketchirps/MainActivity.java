package com.dan.cricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText editText_id;
    Button button_id;
    TextView textView_id;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_id = findViewById(R.id.editText_id);
        button_id = findViewById(R.id.button_id);
        textView_id = findViewById(R.id.textView_id);

        textView_id.setVisibility(View.GONE);

        formatter = new DecimalFormat("#0.0");

        button_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chirp = editText_id.getText().toString().trim();
                int chirps = Integer.parseInt(chirp);

                double temp = (chirps / 3) + 4;

                String results = "The approximate temperature outside is " + formatter.format(temp) + " degree Celsius";

                textView_id.setText(results);
                textView_id.setVisibility((View.VISIBLE));



            }
        });

    }
}
