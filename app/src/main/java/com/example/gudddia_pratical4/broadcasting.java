package com.example.gudddia_pratical4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class broadcasting extends BroadcastReceiver {
    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {



        mp = MediaPlayer.create(context, R.raw.song);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();

    }
}