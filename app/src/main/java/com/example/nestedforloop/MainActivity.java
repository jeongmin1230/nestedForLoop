package com.example.nestedforloop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

// 두 개의 주사위를 던져서 눈의 합이 6이 되는 모든 경우의 수를 출력
public class MainActivity extends AppCompatActivity {
    TextView tvNumberOfCases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPrintNumberOfCases(View view) {

        tvNumberOfCases = (TextView) findViewById(R.id.tvNumberOfCases);

        int dice1, dice2;
        for(dice1=1; dice1<=6; dice1++) {
            for(dice2=1; dice2<=6; dice2++) {
                if(dice1+dice2==6) {
                    Log.i("jeongmin", "dice1 : " + dice1 + ", dice2 : " + dice2 + "\n");
                    tvNumberOfCases.append(dice1 + " + " + dice2 + " = 6\n");
                }
            }
        }
    }
}