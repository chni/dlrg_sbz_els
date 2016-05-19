package com.example.christoph.maptest2;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

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

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


//int reqcomplete;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, GoogleMap.OnMapClickListener {

    private GoogleMap mMap;
    //private CameraPosition CamPos;

    MapsActivity(){

        Log.i("DLRGMaps", "Konstruktor " + GlobalApplication.getInstance().helloFromGlobalApplication);

    }
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

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

        Vector markers = new Vector();


        MarkerOptions t1marker = new MarkerOptions().position(t1).title("Turm 1");
        markers.add(t1marker);
        MarkerOptions t2marker = new MarkerOptions().position(t2).title("Turm 2");
        markers.add(t2marker);
        MarkerOptions t3marker = new MarkerOptions().position(t3).title("Turm 3");
        markers.add(t3marker);
        MarkerOptions t4marker = new MarkerOptions().position(t4).title("Turm 4");
        markers.add(t4marker);
        MarkerOptions t5marker = new MarkerOptions().position(t5).title("Turm 5");
        markers.add(t5marker);
        MarkerOptions t6marker = new MarkerOptions().position(t6).title("Turm 6");
        markers.add(t6marker);
        MarkerOptions t7marker = new MarkerOptions().position(t7).title("Turm 7");
        markers.add(t7marker);
        MarkerOptions t8marker = new MarkerOptions().position(t8).title("Turm 8");
        markers.add(t8marker);
        MarkerOptions t9marker = new MarkerOptions().position(t9).title("Turm 9");
        markers.add(t9marker);
        MarkerOptions t10marker = new MarkerOptions().position(t10).title("Turm 10");
        markers.add(t10marker);
        MarkerOptions t11marker = new MarkerOptions().position(t11).title("Turm 11");
        markers.add(t11marker);
        MarkerOptions t12marker = new MarkerOptions().position(t12).title("Turm 12");
        markers.add(t12marker);
        MarkerOptions t13marker = new MarkerOptions().position(t13).title("Turm 13");
        markers.add(t13marker);
        MarkerOptions pmarker = new MarkerOptions().position(p).title("Pönitz");
        markers.add(pmarker);
        MarkerOptions odfmarker = new MarkerOptions().position(odf).title("Offendorf");
        markers.add(odfmarker);


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


        Vector markersfuerview = new Vector();

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

        GlobalApplication.getInstance().getStatefromServer();

    }



    @Override
    public boolean onMarkerClick(Marker arg0) {
        Log.i("DLRGMaps", "Marker geklickt! " + arg0.getTitle());
        Intent intent = new Intent(this, FlagsSet.class);

        int tn = 3;

        if (arg0.getTitle().equals("Turm 1")) tn = 0;
        else if (arg0.getTitle().equals("Turm 2")) tn = 1;
        else if (arg0.getTitle().equals("Turm 3")) tn = 2;
        else if (arg0.getTitle().equals("Turm 4")) tn = 3;
        else if (arg0.getTitle().equals("Turm 5")) tn = 4;
        else if (arg0.getTitle().equals("Turm 6")) tn = 5;
        else if (arg0.getTitle().equals("Turm 7")) tn = 6;
        else if (arg0.getTitle().equals("Turm 8")) tn = 7;
        else if (arg0.getTitle().equals("Turm 9")) tn = 8;
        else if (arg0.getTitle().equals("Turm 10")) tn = 9;
        else if (arg0.getTitle().equals("Turm 11")) tn = 10;
        else if (arg0.getTitle().equals("Turm 12")) tn = 11;
        else if (arg0.getTitle().equals("Turm 13")) tn = 12;
        else if (arg0.getTitle().equals("Pönitz")) tn = 13;
        else if (arg0.getTitle().equals("Offendorf")) tn = 14;

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
                Uri.parse("android-app://com.example.christoph.maptest2/http/host/path")
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
                Uri.parse("android-app://com.example.christoph.maptest2/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }


}
