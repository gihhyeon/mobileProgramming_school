package com.example.pet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView tvStart, tvPet;
    CheckBox cbStart;
    RadioGroup rGroup1;
    RadioButton btnDog, btnCat, btnRabbit;
    Button btnEnd;
    ImageView imgPet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진 보기");

        cbStart = findViewById(R.id.cbStart);
        tvPet = findViewById(R.id.tvPet);
        rGroup1 = findViewById(R.id.rGroup1);
        btnDog = findViewById(R.id.btnDog);
        btnCat = findViewById(R.id.btnCat);
        btnRabbit = findViewById(R.id.btnRabbit);
        btnEnd = findViewById(R.id.btnEnd);
        imgPet = findViewById(R.id.imgPet);

        cbStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbStart.isChecked()) {
                    tvPet.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnEnd.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                } else {
                    tvPet.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnEnd.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rGroup1.getCheckedRadioButtonId();

                if (selectedId == R.id.btnDog) {
                    imgPet.setImageResource(R.drawable.dog);
                } else if (selectedId == R.id.btnCat) {
                    imgPet.setImageResource(R.drawable.cat);
                } else if (selectedId == R.id.btnRabbit) {
                    imgPet.setImageResource(R.drawable.rabbit);
                } else {
                    Toast.makeText(getApplicationContext(), "동물을 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}