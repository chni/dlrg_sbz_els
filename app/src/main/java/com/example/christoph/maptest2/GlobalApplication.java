package com.example.christoph.maptest2;

/**
 * Created by christoph on 08.05.16.
 */
import android.app.Application;
import android.util.Base64;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class GlobalApplication extends Application {

    public String helloFromGlobalApplication = "Daten aus der Globalen App.";
    public CameraPosition CamPos;
    public String ServerResponse;
    public Vector tuerme = new Vector();
    private Vector marker;

    GlobalApplication(){
        Log.i("DLRGMaps", "START");

        LatLng center = new LatLng(54.03986359132022,10.772223137319088);
        double rotation = 75.0;

        CameraPosition oldPos = new CameraPosition(center,(float)13.868389,0,0);

        CamPos = CameraPosition.builder(oldPos).bearing((float) rotation).build();

        //getStatefromServer();

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

        //UpdateScheduler up = new UpdateScheduler(this);
        new Thread(new UpdateScheduler(this)).start();

    }

    private static GlobalApplication singleton;

    public static GlobalApplication getInstance() {
        return singleton;
    }

    public void getStatefromServer(int tn, int st, int grund){ // wenn tn == 0, nur abfrage, sonst setzen des Turms
        RequestQueue mRequestQueue;

// Instantiate the cache
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap

// Set up the network to use HttpURLConnection as the HTTP client.
        Network network = new BasicNetwork(new HurlStack());

// Instantiate the RequestQueue with the cache and network.
        mRequestQueue = new RequestQueue(cache, network);

// Start the queue
        mRequestQueue.start();

        String url ="http://h2145564.stratoserver.net/flags2/appserver.php";
        if (tn!=0){
            url = url+"?turm="+tn+"&status="+st+"&grund="+grund;
            Log.i("DLRGMaps", "URL: "+url);
        }

        //
        GlobalApplication.getInstance().ServerResponse = "";

// Formulate the request and handle the response.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //Log.i("DLRGMaps", "RESPONSE: "+response);
                        String[] turmstati = response.split(";");
                        //Log.i("DLRGMaps", "Anzahl der Tuerme: "+turmstati.length);
                        for(int i = 0;i<turmstati.length; i++){
                            //Log.i("DLRGMaps", "Setze Turm Nummer: "+(i+1));
                            //Log.i("DLRGMaps", "RESPONSE: "+turmstati[i].toString());
                            String[] statuspart = turmstati[i].split(",");
                            //Log.i("DLRGMaps", "RESPONSE: "+statuspart[0].toString());
                            int turmnummer = Integer.parseInt(statuspart[0].toString());
                            int status = Integer.parseInt(statuspart[1].toString());

                            updateView(turmnummer-1,status);

                            Turm test = (Turm)GlobalApplication.getInstance().tuerme.elementAt(turmnummer-1);
                            test.status = status;
                        }
                        //marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.gelb));
                        GlobalApplication.getInstance().ServerResponse = response;
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle error
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                //add params <key,value>
                return params;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<String, String>();
                // add headers <key,value>
                String credentials = "paul"+":"+"hudson";
                String auth = "Basic "
                        + Base64.encodeToString(credentials.getBytes(),
                        Base64.NO_WRAP);
                headers.put("Authorization", auth);
                return headers;
            }
        };


// Add the request to the RequestQueue.
        //mRequestQueue = null;
        //System.gc();
        //mRequestQueue = new RequestQueue(cache, network);


        mRequestQueue.add(stringRequest);


    }

    public void updateView(int nummer, int status){
        Marker changemarker = (Marker)marker.elementAt(nummer);
        if (status == 0){
            //Log.i("DLRGMaps", "Logo ");

            changemarker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.logo));
        }
        else if (status == 1){
            //Log.i("DLRGMaps", "Flagge normal");

            changemarker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.normal));
        }
        else if (status == 2){
            //Log.i("DLRGMaps", "Flagge gelb");

            changemarker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.gelb));
        }
        else if (status == 3){
            //Log.i("DLRGMaps", "Flagge rot");

            changemarker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.rot));
        }
    }

    public void setMarker(Vector m){
        marker = m;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
}