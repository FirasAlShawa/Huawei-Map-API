package com.firasalshawa.mapstartup

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.Circle
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng

class Circles : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circles)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.MapFragmentCircleXML) as SupportMapFragment

        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(map : GoogleMap?) {
        //TODO: 6.1 -> specify the center

        //TODO: 6.2 -> specify the radius

        //TODO: 6.3 -> Create Circle and specify the fill color and stroke color

        //TODO: 6.4 -> Add the Polygon to the map

    }
}