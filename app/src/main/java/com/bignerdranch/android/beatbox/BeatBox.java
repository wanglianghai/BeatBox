package com.bignerdranch.android.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;

/**
 * Created by Administrator on 2017/4/25/025.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";
    private AssetManager mAssetManager;
    public BeatBox(Context context){
        mAssetManager = context.getAssets();
        loadSounds();
    }
    private void loadSounds(){
        String[] soundList;
        try {
            soundList = mAssetManager.list(SOUNDS_FOLDER);
            Log.i(TAG, "loadSounds: " + soundList.length);
        } catch (IOException e) {
            Log.e(TAG, "loadSounds: ", e);
            return;
        }
    }
}
