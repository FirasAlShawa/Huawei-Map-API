package com.firasalshawa.mapstartup

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Polygon
import com.google.android.gms.maps.model.Polyline
import com.google.android.gms.maps.model.PolylineOptions

class Polylines : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polyline)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.MapFragmentPolylineXML) as SupportMapFragment

        mapFragment.getMapAsync(this)

    }

    override fun onMapReady(map: GoogleMap?) {
            //TODO Polyline.1 -> specify your point

            //TODO Polyline.2 -> Add your points to a Mutable List of LatLng

            //TODO Polyline.3 -> Create Polyline and specify the color

            //TODO Polyline.4 -> Add the Polyline to the map
    }
}