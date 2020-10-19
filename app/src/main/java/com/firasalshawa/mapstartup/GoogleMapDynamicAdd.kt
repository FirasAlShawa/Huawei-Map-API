package com.firasalshawa.mapstartup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.huawei.hms.maps.HuaweiMap
import com.huawei.hms.maps.OnMapReadyCallback
import com.huawei.hms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.activity_huawei_map_dynamic_add.*

class GoogleMapDynamicAdd : AppCompatActivity() , OnMapReadyCallback ,com.google.android.gms.maps.OnMapReadyCallback{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_huawei_map_dynamic_add)


//


        if(isOnlyHms(this)){
            val inflatedLayout = layoutInflater.inflate(R.layout.hmap,findViewById(R.id.frameLayoutXML),false)
            frameLayoutXML.addView(inflatedLayout);
            val map = supportFragmentManager.findFragmentById(R.id.hMapFragment) as SupportMapFragment
            map?.getMapAsync(this)
        }else{
            val inflatedLayout = layoutInflater.inflate(R.layout.gmap,findViewById(R.id.frameLayoutXML),false)
            frameLayoutXML.addView(inflatedLayout);
            val map = supportFragmentManager.findFragmentById(R.id.gMapFragment) as com.google.android.gms.maps.SupportMapFragment
            map?.getMapAsync(this)
        }
    }

    override fun onMapReady(p0: HuaweiMap?) {

    }

    override fun onMapReady(p0: GoogleMap?) {

    }

}

