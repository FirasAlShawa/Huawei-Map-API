package com.firasalshawa.mapstartup

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.Circle
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng

class Circles : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnCircleClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circles)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.MapFragmentCircleXML) as SupportMapFragment

        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(map : GoogleMap?) {

        map!!.addCircle(
            CircleOptions()
                .center(LatLng(24.788571, 46.805764))
                .radius(250.0)
                .fillColor(Color.YELLOW)
        )

        map!!.setOnCircleClickListener(this)

    }

    override fun onCircleClick(circle: Circle?) {
        Toast.makeText(this,"hi",Toast.LENGTH_SHORT).show()
    }
}