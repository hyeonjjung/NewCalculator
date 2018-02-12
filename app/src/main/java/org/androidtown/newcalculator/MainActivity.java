package org.androidtown.newcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addClick(View v) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(Integer.parseInt(number1.getText().toString())+Integer.parseInt(number2.getText().toString())));
    }
    public void subtractClick(View v) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(Integer.parseInt(number1.getText().toString())-Integer.parseInt(number2.getText().toString())));
    }
    public void multiplyClick(View v) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(Integer.parseInt(number1.getText().toString())*Integer.parseInt(number2.getText().toString())));
    }
    public void divideClick(View v) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        result.setText(String.valueOf(Integer.parseInt(number1.getText().toString())/Integer.parseInt(number2.getText().toString())));
    }
}
