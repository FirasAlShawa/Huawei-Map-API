package com.firasalshawa.mapstartup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback

//TODO: 1.2 Implement OnMapReady on the class definition
class MapViewActivity : AppCompatActivity() , OnMapReadyCallback {

    //TODO: 1.3 Add the variables and the companion object


    //TODO 1.4 Complete OnCreate function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_view_activity)
    }

    override fun onMapReady(p0: GoogleMap?) {
        TODO("Not yet implemented")
    }

    //TODO: 1.5 Complete onSaveInstanceState function


    //TODO: 1.6 Complete Override onMapReady function


    //TODO: 1.7 Complete the life cycle functions


}