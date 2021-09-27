package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    int num1, num2;
    public EditText editText;
    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.secondNumber);
        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }
    public boolean getNumbers(){
        // defining the edit text 1 to e1
        e1 = (EditText) findViewById(R.id.firstNumber);

        // defining the edit text 2 to e2
        e2 = (EditText) findViewById(R.id.secondNumber);

        // taking input from text box 1
        String s1 = e1.getText().toString();

        // taking input from text box 2
        String s2 = e2.getText().toString();

        // condition to check if box is not empty
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {
            return false;

        } else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);
        }

        return true;

    }
    public void doSum(View v){
       if(getNumbers()){
           int sum = num1 + num2;
           goToActivity2(sum);

       }
    }
    public void doSubtract(View v){
        if(getNumbers()){
            int sum = num1 - num2;
            goToActivity2(sum);

        }
    }
    public void doMultiply(View v){
        if(getNumbers()){
            int sum = num1 * num2;
            goToActivity2(sum);

        }
    }
    public void doDivide(View v){
        if(getNumbers()){
            int sum = num1 / num2;
            goToActivity2(sum);

        }
    }
    public void goToActivity2(Integer s) {
        Intent intent = new Intent(this, Results.class);
        String str = String.valueOf(s);
        intent.putExtra("message",str);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}