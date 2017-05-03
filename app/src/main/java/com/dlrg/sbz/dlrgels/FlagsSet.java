package com.dlrg.sbz.dlrgels;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;

public class FlagsSet extends AppCompatActivity {

    Turm turm = new Turm();

    private Spinner spinner1;

    int turmnummer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flags_set);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        addListenerOnSpinnerItemSelection();

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
                GlobalApplication.getInstance().getStatefromServer(turmnummer+1,1,spinner1.getSelectedItemPosition());
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
                GlobalApplication.getInstance().getStatefromServer(turmnummer+1,0,spinner1.getSelectedItemPosition());
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
                GlobalApplication.getInstance().getStatefromServer(turmnummer+1,2,spinner1.getSelectedItemPosition());
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
                GlobalApplication.getInstance().getStatefromServer(turmnummer+1,3,spinner1.getSelectedItemPosition());
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

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        //spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void setTurm(Turm cturm){
        turm = cturm;
    }

}
