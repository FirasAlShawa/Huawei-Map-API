package com.firasalshawa.mapstartup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class Markers : AppCompatActivity() ,OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_markers)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.MapFragmentMarkerXML) as SupportMapFragment

        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap?) {
        //TODO: 3.1 Setup a position

        //TODO: 3.2 Create variable to hold the marker ID

        //TODO: 3.3 Add the marker to the map

        map!!.setOnMarkerClickListener(GoogleMap.OnMarkerClickListener {
            Toast.makeText(this, "my Marker", Toast.LENGTH_SHORT).show()
            true
        })

        map!!.addMarker(MarkerOptions().position(LatLng(24.788571, 46.805764)).title("Hi"))
            .showInfoWindow()
    }


}