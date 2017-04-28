package com.example.songye02.diasigame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonRotate;
    private Button buttonParabola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置无标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        buttonRotate = (Button)findViewById(R.id.btn_rotate);
        buttonRotate.setOnClickListener(v->{ Intent intent = new Intent(MainActivity.this,RotateActivity.class);
            startActivity(intent);});

        buttonParabola = (Button)findViewById(R.id.btn_parabola);
        buttonParabola.setOnClickListener(v->{Intent intent = new Intent(MainActivity.this,ParabolaActivity.class);
            startActivity(intent);});
    }


}
