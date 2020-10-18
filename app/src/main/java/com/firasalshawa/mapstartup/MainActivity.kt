package com.firasalshawa.mapstartup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.Polyline
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MapViewBtnXML.setOnClickListener {
            var intent = Intent(this,MapViewActivity::class.java)
            startActivity(intent)
        }

        SupportMapFragmentBtnXML.setOnClickListener {
            var intent = Intent(this,SupportMapFragmentActivity::class.java)
            startActivity(intent)
        }

        MarkerBtnXML.setOnClickListener {
            var intent = Intent(this,Markers::class.java)
            startActivity(intent)
        }

        PolylineBtnXML.setOnClickListener {
            var intent = Intent(this,Polylines::class.java)
            startActivity(intent)
        }

        PolygonBtnXML.setOnClickListener {
            var intent = Intent(this,Polygons::class.java)
            startActivity(intent)
        }

        CircleBtnXML.setOnClickListener {
            var intent = Intent(this,Circles::class.java)
            startActivity(intent)
        }

    }

}