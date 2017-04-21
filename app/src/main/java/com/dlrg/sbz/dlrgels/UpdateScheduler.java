package com.dlrg.sbz.dlrgels;

import android.util.Log;

/**
 * Created by sbz on 19.05.16.
 */

public class UpdateScheduler implements Runnable {
    private GlobalApplication app;

    UpdateScheduler(GlobalApplication g){
        app = g;
        Log.i("DLRGMaps", "Update Konstruktor");

    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
                app.getStatefromServer(0,0,0);
                //Log.i("DLRGMaps", "Update");
        }
    }
}
