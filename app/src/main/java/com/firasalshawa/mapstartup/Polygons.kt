package com.firasalshawa.mapstartup

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolygonOptions

class Polygons : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polygons)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.MapFragmentPolygonXML) as SupportMapFragment

        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap?) {
        //TODO Polygon.1 -> specify your 3 or more points

        //TODO Polygon.2 -> Add your points to a Mutable List of LatLng

        //TODO Polygon.3 -> Create Polygon and specify the fill color and stroke color

        //TODO Polygon.4 -> Add the Polygon to the map
    }
}



