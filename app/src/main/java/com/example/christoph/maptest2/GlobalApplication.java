package com.example.christoph.maptest2;

/**
 * Created by christoph on 08.05.16.
 */
import android.app.Application;
import android.util.Log;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

import java.util.Vector;

public class GlobalApplication extends Application {

    public String helloFromGlobalApplication = "Daten aus der Globalen App.";
    public CameraPosition CamPos;
    public Vector tuerme = new Vector();

    GlobalApplication(){
        Log.i("DLRGMaps", "START");

        LatLng center = new LatLng(54.03986359132022,10.772223137319088);
        double rotation = 75.0;

        CameraPosition oldPos = new CameraPosition(center,(float)13.868389,0,0);

        CamPos = CameraPosition.builder(oldPos).bearing((float) rotation).build();

        Turm t1 = new Turm();
        t1.status = 0;
        tuerme.add(t1);
        Turm t2 = new Turm();
        t2.status = 0;
        tuerme.add(t2);
        Turm t3 = new Turm();
        t3.status = 0;
        tuerme.add(t3);
        Turm t4 = new Turm();
        t4.status = 0;
        tuerme.add(t4);
        Turm t5 = new Turm();
        t5.status = 0;
        tuerme.add(t5);
        Turm t6 = new Turm();
        t6.status = 0;
        tuerme.add(t6);
        Turm t7 = new Turm();
        t7.status = 0;
        tuerme.add(t7);
        Turm t8 = new Turm();
        t8.status = 0;
        tuerme.add(t8);
        Turm t9 = new Turm();
        t9.status = 0;
        tuerme.add(t9);
        Turm t10 = new Turm();
        t10.status = 0;
        tuerme.add(t10);
        Turm t11 = new Turm();
        t11.status = 0;
        tuerme.add(t11);
        Turm t12 = new Turm();
        t12.status = 0;
        tuerme.add(t12);
        Turm t13 = new Turm();
        t13.status = 0;
        tuerme.add(t13);
        Turm p = new Turm();
        p.status = 0;
        tuerme.add(p);
        Turm odf = new Turm();
        odf.status = 0;
        tuerme.add(odf);



    }

    private static GlobalApplication singleton;

    public static GlobalApplication getInstance() {
        return singleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
}