package com.prototype.iasjem.evenorodd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userAnswer;
    TextView resultForNumber;
    Button buttonSubmit;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userAnswer = findViewById(R.id.userAnswer);
        resultForNumber = findViewById(R.id.resultOfNumber);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultForNumber.setText(evenOrOdd(Integer.parseInt(userAnswer.getText().toString())));
                Log.d("EvenOrOdd", "N = " + Integer.parseInt(userAnswer.getText().toString()));
                Log.d("EvenOrOdd", "Answer: " + evenOrOdd(Integer.parseInt(userAnswer.getText().toString())));
            }
        });

    }

    private String evenOrOdd(int n){
        if (n % 2 == 0) {  return "EVEN";  }
        return "ODD";
    }

}
