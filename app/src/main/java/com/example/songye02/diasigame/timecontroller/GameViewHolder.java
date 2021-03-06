package com.example.songye02.diasigame.timecontroller;

import com.example.songye02.diasigame.callback.ButtonVisibilityCallBack;
import com.example.songye02.diasigame.model.BaseShowableView;
import com.example.songye02.diasigame.model.shapeview.HeartShapeView;
import com.example.songye02.diasigame.model.shapeview.PortraitView;

import java.util.List;

/**
 * Created by songye02 on 2017/6/19.
 */

public class GameViewHolder extends BaseViewHolder<BaseShowableView> {
    public HeartShapeView heartShapeView;
    public PortraitView portraitView;
    public ButtonVisibilityCallBack buttonVisibilityCallBack;

    public GameViewHolder(List<BaseShowableView> mMoveables,
                           HeartShapeView heartShapeView,
                           PortraitView portraitView) {
        super(mMoveables);
        this.heartShapeView = heartShapeView;
        this.portraitView = portraitView;
    }

    public void setButtonVisibilityCallBack(ButtonVisibilityCallBack buttonVisibilityCallBack){
        this.buttonVisibilityCallBack = buttonVisibilityCallBack;
    }
}
