package com.dlrg.sbz.dlrgels;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Vector;

//int reqcomplete;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, GoogleMap.OnMapClickListener {

    private GoogleMap mMap;
    //private CameraPosition CamPos;

    Vector markersfuerview = new Vector();

    MapsActivity(){

        Log.i("DLRGMaps", "Konstruktor " + GlobalApplication.getInstance().helloFromGlobalApplication);

    }
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    private void showmarkers()
    {

        for(int i =0; i < markersfuerview.size(); i++)
        {
            Log.i("DLRGMaps", "Zeige Marker ");
            Marker testmarker = (Marker)markersfuerview.elementAt(1);
            testmarker.showInfoWindow();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("DLRGMaps", "OnCreate ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //GoogleMap.OnMarkerClickListener listener = new GoogleMap.OnMarkerClickListener();
        //mMap.setOnMarkerClickListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        //Log.i("DLRGMaps", test);
//        Button button = (Button) findViewById(R.id.mapsbutton);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Hier", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//                showmarkers();
//            }
//        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(54.0274398,10.7576738);
        //MarkerOptions hwmarker = new MarkerOptions().position(sydney).title("die HW in Scharbeutz");

        //LatLng scharbeutz = new LatLng(54.0274398,10.757);

        Vector positions = new Vector();

        LatLng t1 = new LatLng(54.010509802865386, 10.770973898470402);
        positions.add(t1);
        LatLng t2 = new LatLng(54.013399600750525, 10.76856929808855);
        positions.add(t2);
        LatLng t3 = new LatLng(54.01682225823417, 10.76546497642994);
        positions.add(t3);
        LatLng t4 = new LatLng(54.02158876649609, 10.76158583164215);
        positions.add(t4);
        LatLng t5 = new LatLng(54.02740108729025, 10.757795199751854);
        positions.add(t5);
        LatLng t6 = new LatLng(54.03165655941469, 10.754716359078884);
        positions.add(t6);
        LatLng t7 = new LatLng(54.03680512008208, 10.751505754888058);
        positions.add(t7);
        LatLng t8 = new LatLng(54.04202549191203, 10.75012106448412);
        positions.add(t8);
        LatLng t9 = new LatLng(54.04678655296428, 10.750790946185589);
        positions.add(t9);
        LatLng t10 = new LatLng(54.05189170995173, 10.753107368946075);
        positions.add(t10);
        LatLng t11 = new LatLng(54.05904625932606, 10.759190283715725);
        positions.add(t11);
        LatLng t12 = new LatLng(54.063181217047415, 10.767618119716644);
        positions.add(t12);
        LatLng t13 = new LatLng(54.07085832036117, 10.783532001078129);
        positions.add(t13);
        LatLng p = new LatLng(54.02970660722535, 10.703474096953869);
        positions.add(p);
        LatLng odf = new LatLng(53.94663582094221, 10.77440980821848);
        positions.add(odf);
        LatLng tdf1 = new LatLng(54.00750158353872, 10.773867331445217);
        //Surfschule Timmendorf
        positions.add(tdf1);
        LatLng tdf2 = new LatLng(54.00521158153442, 10.77626422047615);
        //Milchhaus
        positions.add(tdf2);
        LatLng tdf3 = new LatLng(54.00082077788394, 10.781690329313278);
        //Sportstrand
        positions.add(tdf3);
        LatLng tdf4 = new LatLng(53.998498087586256, 10.784516371786594);
        //Sealife-Center
        positions.add(tdf4);
        LatLng tdf5 = new LatLng(53.99641630619019,10.78828789293766);
        //Rudi's Imbiss
        positions.add(tdf5);
        LatLng tdf6 = new LatLng(53.994046263614976, 10.793615765869617);
        //Teehäuschenbrücke
        positions.add(tdf6);
        LatLng tdf7 = new LatLng(53.991718661813174,10.801498107612133);
        //Familienstrand
        positions.add(tdf7);
        LatLng tdf9 = new LatLng(53.994518903248874, 10.812481753528118);
        //Freistrand
        positions.add(tdf9);
        LatLng tdf10 = new LatLng(53.99452205678976, 10.818237774074078);
        //Miramar
        positions.add(tdf10);
        LatLng tdf11 = new LatLng(53.99379614480714, 10.82508746534586);
        //Surfschule Niendorf
        positions.add(tdf11);
        LatLng tdf12 = new LatLng(53.99242785599034, 10.83139669150114);
        //Niendorfer Balkon
        positions.add(tdf12);

        Vector markers = new Vector();


        MarkerOptions t1marker = new MarkerOptions().position(t1).title("Turm SBZ 1");
        markers.add(t1marker);
        MarkerOptions t2marker = new MarkerOptions().position(t2).title("Turm SBZ 2");
        markers.add(t2marker);
        MarkerOptions t3marker = new MarkerOptions().position(t3).title("Turm SBZ 3");
        markers.add(t3marker);
        MarkerOptions t4marker = new MarkerOptions().position(t4).title("Turm SBZ 4");
        markers.add(t4marker);
        MarkerOptions t5marker = new MarkerOptions().position(t5).title("Turm SBZ 5");
        markers.add(t5marker);
        MarkerOptions t6marker = new MarkerOptions().position(t6).title("Turm SBZ 6");
        markers.add(t6marker);
        MarkerOptions t7marker = new MarkerOptions().position(t7).title("Turm SBZ 7");
        markers.add(t7marker);
        MarkerOptions t8marker = new MarkerOptions().position(t8).title("Turm SBZ 8");
        markers.add(t8marker);
        MarkerOptions t9marker = new MarkerOptions().position(t9).title("Turm SBZ 9");
        markers.add(t9marker);
        MarkerOptions t10marker = new MarkerOptions().position(t10).title("Turm SBZ 10");
        markers.add(t10marker);
        MarkerOptions t11marker = new MarkerOptions().position(t11).title("Turm SBZ 11");
        markers.add(t11marker);
        MarkerOptions t12marker = new MarkerOptions().position(t12).title("Turm SBZ 12");
        markers.add(t12marker);
        MarkerOptions t13marker = new MarkerOptions().position(t13).title("Turm SBZ 13");
        markers.add(t13marker);
        MarkerOptions pmarker = new MarkerOptions().position(p).title("Pönitz");
        markers.add(pmarker);
        MarkerOptions odfmarker = new MarkerOptions().position(odf).title("Offendorf");
        markers.add(odfmarker);
        MarkerOptions tdf1marker = new MarkerOptions().position(tdf1).title("Turm TDF 1");
        markers.add(tdf1marker);
        MarkerOptions tdf2marker = new MarkerOptions().position(tdf2).title("Turm TDF 2");
        markers.add(tdf2marker);
        MarkerOptions tdf3marker = new MarkerOptions().position(tdf3).title("Turm TDF 3");
        markers.add(tdf3marker);
        MarkerOptions tdf4marker = new MarkerOptions().position(tdf4).title("HW TDF");
        markers.add(tdf4marker);
        MarkerOptions tdf5marker = new MarkerOptions().position(tdf5).title("Turm TDF 5");
        markers.add(tdf5marker);
        MarkerOptions tdf6marker = new MarkerOptions().position(tdf6).title("Turm TDF 6");
        markers.add(tdf6marker);
        MarkerOptions tdf7marker = new MarkerOptions().position(tdf7).title("Turm TDF 7");
        markers.add(tdf7marker);
        MarkerOptions tdf9marker = new MarkerOptions().position(tdf9).title("Turm TDF 9");
        markers.add(tdf9marker);
        MarkerOptions tdf10marker = new MarkerOptions().position(tdf10).title("Turm TDF 10");
        markers.add(tdf10marker);
        MarkerOptions tdf11marker = new MarkerOptions().position(tdf11).title("Turm TDF 11");
        markers.add(tdf11marker);
        MarkerOptions tdf12marker = new MarkerOptions().position(tdf12).title("Turm TDF 12");
        markers.add(tdf12marker);


        for(int i =0; i < markers.size(); i++)
        {
            Turm test = (Turm)GlobalApplication.getInstance().tuerme.elementAt(i);
            MarkerOptions testmarker = (MarkerOptions)markers.elementAt(i);
            //Log.i("DLRGMaps", GlobalApplication.getInstance().tuerme.elementAt(i).toString());
            if (test.status == 0){
                //Log.i("DLRGMaps", "Logo ");

                testmarker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo));
            }
            else if (test.status == 1){
                //Log.i("DLRGMaps", "Flagge normal");

                testmarker.icon(BitmapDescriptorFactory.fromResource(R.drawable.normal));
            }
            else if (test.status == 2){
                //Log.i("DLRGMaps", "Flagge gelb");

                testmarker.icon(BitmapDescriptorFactory.fromResource(R.drawable.gelb));
            }
            else if (test.status == 3){
                //Log.i("DLRGMaps", "Flagge rot");

                testmarker.icon(BitmapDescriptorFactory.fromResource(R.drawable.rot));
            }
        }





        Marker t1m = mMap.addMarker(t1marker);
        markersfuerview.add(t1m);
        Marker t2m = mMap.addMarker(t2marker);
        markersfuerview.add(t2m);
        Marker t3m = mMap.addMarker(t3marker);
        markersfuerview.add(t3m);
        Marker t4m = mMap.addMarker(t4marker);
        markersfuerview.add(t4m);
        Marker t5m = mMap.addMarker(t5marker);
        markersfuerview.add(t5m);
        Marker t6m = mMap.addMarker(t6marker);
        markersfuerview.add(t6m);
        Marker t7m = mMap.addMarker(t7marker);
        markersfuerview.add(t7m);
        Marker t8m = mMap.addMarker(t8marker);
        markersfuerview.add(t8m);
        Marker t9m = mMap.addMarker(t9marker);
        markersfuerview.add(t9m);
        Marker t10m = mMap.addMarker(t10marker);
        markersfuerview.add(t10m);
        Marker t11m = mMap.addMarker(t11marker);
        markersfuerview.add(t11m);
        Marker t12m = mMap.addMarker(t12marker);
        markersfuerview.add(t12m);
        Marker t13m = mMap.addMarker(t13marker);
        markersfuerview.add(t13m);
        Marker pm = mMap.addMarker(pmarker);
        markersfuerview.add(pm);
        Marker om = mMap.addMarker(odfmarker);
        markersfuerview.add(om);
        Marker tdf1m = mMap.addMarker(tdf1marker);
        markersfuerview.add(tdf1m);
        Marker tdf2m = mMap.addMarker(tdf2marker);
        markersfuerview.add(tdf2m);
        Marker tdf3m = mMap.addMarker(tdf3marker);
        markersfuerview.add(tdf3m);
        Marker tdf4m = mMap.addMarker(tdf4marker);
        markersfuerview.add(tdf4m);
        Marker tdf5m = mMap.addMarker(tdf5marker);
        markersfuerview.add(tdf5m);
        Marker tdf6m = mMap.addMarker(tdf6marker);
        markersfuerview.add(tdf6m);
        Marker tdf7m = mMap.addMarker(tdf7marker);
        markersfuerview.add(tdf7m);
        Marker tdf9m = mMap.addMarker(tdf9marker);
        markersfuerview.add(tdf9m);
        Marker tdf10m = mMap.addMarker(tdf10marker);
        markersfuerview.add(tdf10m);
        Marker tdf11m = mMap.addMarker(tdf11marker);
        markersfuerview.add(tdf11m);
        Marker tdf12m = mMap.addMarker(tdf12marker);
        markersfuerview.add(tdf12m);

        GlobalApplication.getInstance().setMarker(markersfuerview);
        //t1m.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.rot));


        //MarkerOptions hwmarker2 = new MarkerOptions().position(scharbeutz).title("die HW in Scharbeutz 2");

        //mMap.addMarker(hwmarker);

        //mMap.addMarker(hwmarker2);


        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(GlobalApplication.getInstance().CamPos));
        mMap.setTrafficEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        Log.i("DLRGMaps", "Start der MapActivity ");
        mMap.setOnMarkerClickListener(this);
        mMap.setOnMapClickListener(this);

        GlobalApplication.getInstance().getStatefromServer(0,0,0);

    }



    @Override
    public boolean onMarkerClick(Marker arg0) {
        Log.i("DLRGMaps", "Marker geklickt! " + arg0.getTitle());
        Intent intent = new Intent(this, FlagsSet.class);

        int tn = 3;

        if (arg0.getTitle().equals("Turm SBZ 1")) tn = 0;
        else if (arg0.getTitle().equals("Turm SBZ 2")) tn = 1;
        else if (arg0.getTitle().equals("Turm SBZ 3")) tn = 2;
        else if (arg0.getTitle().equals("Turm SBZ 4")) tn = 3;
        else if (arg0.getTitle().equals("Turm SBZ 5")) tn = 4;
        else if (arg0.getTitle().equals("Turm SBZ 6")) tn = 5;
        else if (arg0.getTitle().equals("Turm SBZ 7")) tn = 6;
        else if (arg0.getTitle().equals("Turm SBZ 8")) tn = 7;
        else if (arg0.getTitle().equals("Turm SBZ 9")) tn = 8;
        else if (arg0.getTitle().equals("Turm SBZ 10")) tn = 9;
        else if (arg0.getTitle().equals("Turm SBZ 11")) tn = 10;
        else if (arg0.getTitle().equals("Turm SBZ 12")) tn = 11;
        else if (arg0.getTitle().equals("Turm SBZ 13")) tn = 12;
        else if (arg0.getTitle().equals("Pönitz")) tn = 13;
        else if (arg0.getTitle().equals("Offendorf")) tn = 14;
        else if (arg0.getTitle().equals("Turm TDF 1")) tn = 15;
        else if (arg0.getTitle().equals("Turm TDF 2")) tn = 16;
        else if (arg0.getTitle().equals("Turm TDF 3")) tn = 17;
        else if (arg0.getTitle().equals("HW TDF")) tn = 18;
        else if (arg0.getTitle().equals("Turm TDF 5")) tn = 19;
        else if (arg0.getTitle().equals("Turm TDF 6")) tn = 20;
        else if (arg0.getTitle().equals("Turm TDF 7")) tn = 21;
        else if (arg0.getTitle().equals("Turm TDF 9")) tn = 22;
        else if (arg0.getTitle().equals("Turm TDF 10")) tn = 23;
        else if (arg0.getTitle().equals("Turm TDF 11")) tn = 24;
        else if (arg0.getTitle().equals("Turm TDF 12")) tn = 25;

        intent.putExtra("TurmNummer", tn);

        GlobalApplication.getInstance().CamPos = mMap.getCameraPosition();

        Log.i("DLRGMaps", "CamPos ist " + GlobalApplication.getInstance().CamPos.toString());


        //i.putExtra("str1", db.getCulturaName(arg0.getTitle()).getDescription());
        startActivity(intent);
        return false;
    }

    @Override
    public void onMapClick(LatLng point) {
        Log.i("DLRGMaps", "Map geklickt! " + point.toString());
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Maps Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.dlrg.sbz.dlrgels/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Maps Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.dlrg.sbz.dlrgels/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }


}
