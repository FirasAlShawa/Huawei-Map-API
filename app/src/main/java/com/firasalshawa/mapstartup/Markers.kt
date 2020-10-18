package com.firasalshawa.mapstartup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Markers : AppCompatActivity() ,OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_markers)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.MapFragmentMarkerXML) as SupportMapFragment

        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap?) {
        //TODO Marker.1 Setup a position

        //TODO Marker.2 Create variable to hold the marker ID

        //TODO Marker.3 Add the marker to the map
    }
}