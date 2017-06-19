package com.example.songye02.diasigame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.songye02.diasigame.callback.ButtonVisibilityCallBack;
import com.example.songye02.diasigame.test.GameSurfaceView;

public class GameActivity extends AppCompatActivity implements ButtonVisibilityCallBack,View.OnClickListener {

    private GameSurfaceView mySurfaceView;
    private Button btnSmallJump;
    private Button btnBigJump;
    private Button btnPause;
    private boolean isPause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置无标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.acitvity_game);
        mySurfaceView = (GameSurfaceView)findViewById(R.id.my_surface_view);
        mySurfaceView.setButtonVisibilityCallBack(this);
        btnSmallJump = (Button)findViewById(R.id.button_jump_small);
        btnBigJump = (Button)findViewById(R.id.button_jump_big);
        btnSmallJump.setOnClickListener(mySurfaceView);
        btnBigJump.setOnClickListener(mySurfaceView);
        btnPause = (Button)findViewById(R.id.btn_pause);
        btnPause.setOnClickListener(this);
        hideButton();
    }

    @Override
    public void showButton() {
        runOnUiThread(()->{btnSmallJump.setVisibility(View.VISIBLE);
            btnBigJump.setVisibility(View.VISIBLE);});

    }

    @Override
    public void hideButton() {
        runOnUiThread(()->{btnSmallJump.setVisibility(View.GONE);
            btnBigJump.setVisibility(View.GONE);});

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pause:
                isPause = !isPause;
                mySurfaceView.dealWithPauseEvent(isPause);
        }
    }

    @Override
    protected void onPause() {
        if(!isFinishing()){
            super.onPause();
            isPause = true;
            mySurfaceView.dealWithPauseEvent(true);
        }
    }
}
