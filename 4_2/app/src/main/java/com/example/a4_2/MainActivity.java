package com.example.a4_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    EditText number1, number2;
    TextView resultView;
    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.edtText1);
        number2 = (EditText) findViewById(R.id.edtText2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMod = (Button) findViewById(R.id.btnMod);

        resultView = (TextView) findViewById(R.id.textResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "값을 다 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    resultView.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "값을 다 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    resultView.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "값을 다 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    resultView.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "값을 다 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(num2) == 0) {
                    Toast.makeText(getApplicationContext(), "0이 아닌 다른 값으로 나눠주세요", Toast.LENGTH_SHORT).show();
                } else {
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    resultView.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "값을 다 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    resultView.setText("계산 결과 : " + result.toString());
                }
            }
        });


    }
}