package com.dlrg.sbz.dlrgels;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class FlagsSet extends AppCompatActivity {

    Turm turm = new Turm();

    int turmnummer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flags_set);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent mIntent = getIntent();
        turmnummer = mIntent.getIntExtra("TurmNummer", 0);

        Log.i("DLRGMaps", "FlagSet " + turmnummer);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Station besetzt", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Turm test = (Turm)GlobalApplication.getInstance().tuerme.elementAt(turmnummer);
                test.status = 1;
                GlobalApplication.getInstance().getStatefromServer(turmnummer+1,1,2);
            }
        });

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        //fab2.setX(-800);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Station nicht besetzt", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Turm test = (Turm)GlobalApplication.getInstance().tuerme.elementAt(turmnummer);
                test.status = 0;
                GlobalApplication.getInstance().getStatefromServer(turmnummer+1,0,2);
            }
        });

        FloatingActionButton fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        //fab2.setX(-800);
        fab3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.make(view, "Gelb", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Turm test = (Turm)GlobalApplication.getInstance().tuerme.elementAt(turmnummer);
                test.status = 2;
                GlobalApplication.getInstance().getStatefromServer(turmnummer+1,2,2);
            }
        });
        FloatingActionButton fab4 = (FloatingActionButton) findViewById(R.id.fab4);
        //fab2.setX(-800);
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Rot", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Turm test = (Turm)GlobalApplication.getInstance().tuerme.elementAt(turmnummer);
                test.status = 3;
                GlobalApplication.getInstance().getStatefromServer(turmnummer+1,3,2);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onBackPressed() {//force update of view
        Turm test = (Turm)GlobalApplication.getInstance().tuerme.elementAt(turmnummer);
        GlobalApplication.getInstance().updateView(turmnummer,test.status);
        finish();
    }

    public void setTurm(Turm cturm){
        turm = cturm;
    }

}
