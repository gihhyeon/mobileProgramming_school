package com.example.practice4_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvSelect, tvLike;
    Switch switchStart;

    RadioGroup radioGroupVersion;
    RadioButton rbS, rbT, rbU;
    ImageView imgVersion;
    Button btnExit, btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        switchStart = findViewById(R.id.switchStart);
        tvLike = findViewById(R.id.tvLike);
        radioGroupVersion = findViewById(R.id.radioGroupVersion);
        rbS = findViewById(R.id.rbS);
        rbT = findViewById(R.id.rbT);
        rbU = findViewById(R.id.rbU);
        imgVersion = findViewById(R.id.imgVersion);
        btnExit = findViewById(R.id.btnExit);
        btnRestart = findViewById(R.id.btnRestart);

        switchStart.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tvLike.setVisibility(View.VISIBLE);
                    imgVersion.setVisibility(View.VISIBLE);
                    radioGroupVersion.setVisibility(View.VISIBLE);
                    btnExit.setVisibility(View.VISIBLE);
                    btnRestart.setVisibility(View.VISIBLE);
                } else {
                    tvLike.setVisibility(View.INVISIBLE);
                    imgVersion.setVisibility(View.INVISIBLE);
                    radioGroupVersion.setVisibility(View.INVISIBLE);
                    btnExit.setVisibility(View.INVISIBLE);
                    btnRestart.setVisibility(View.INVISIBLE);
                    imgVersion.setImageDrawable(null);
                    rbS.setChecked(false);
                    rbT.setChecked(false);
                    rbU.setChecked(false);
                }
            }
        });

        RadioGroup radioGroupVersion = findViewById(R.id.radioGroupVersion);

        radioGroupVersion.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbS) {
                    imgVersion.setImageResource(R.drawable.android13);
                } else if (checkedId == R.id.rbT) {
                    imgVersion.setImageResource(R.drawable.android14);
                } else if (checkedId == R.id.rbU) {
                    imgVersion.setImageResource(R.drawable.android13);
                }
            }
        });


        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchStart.setChecked(false);
            }
        });

    }
}