package com.example.songye02.diasigame.model;

import com.example.songye02.diasigame.model.shapeview.HeartShapeView;

/**
 * Created by songye02 on 2017/4/21.
 */

public interface Collisonable {
    public abstract boolean collisonWith(HeartShapeView view);
}
