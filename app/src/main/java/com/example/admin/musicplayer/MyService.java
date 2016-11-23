package com.example.admin.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Admin on 23-11-2016.
 */
public class MyService extends Service {


    MediaPlayer mMediaPlayer;
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MY Service Application", "I am running inside onCreate()");
        mMediaPlayer = MediaPlayer.create(this, R.raw.music);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MY Service Application", "I am running inside onStartCommand()");


        if(!mMediaPlayer.isPlaying())
        {
            mMediaPlayer.start();
        }


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMediaPlayer.stop();
        mMediaPlayer.release();


        Log.d("MY Service Application", "I am running inside onDestroy()");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        throw new UnsupportedOperationException("Not yet implemented");
    }
}
