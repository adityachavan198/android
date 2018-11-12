package com.kossine.location;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = "";
        LocationManager lm = (LocationManager) getSystemService(LOCATION_SERVICE);
        if (lm.isProviderEnabled(LocationManager.GPS_PROVIDER))
            s = LocationManager.GPS_PROVIDER;
        else if (lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER))
            s = LocationManager.NETWORK_PROVIDER;
        TextView text = (TextView) findViewById(R.id.textView);

        text.setText(s);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }


        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10, 10, new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

               double latitude= location.getLatitude();
                double longitude=location.getLongitude();

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:"+location.getLatitude()+","+location.getLongitude()));
                startActivity(intent);


            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {


            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        });



    }
}
