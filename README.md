
# Welcome to Map Codelab
### Hi there , this codelab will show you have to implement Google map on you android project.
![enter image description here](https://lh4.googleusercontent.com/NL_RhzVpJXJ3WbyVZIaWHW0IdKGikft28jHoEPbaesjqhhRyeR1O3iR5B6t3A7sL5u_mq8WoA_eyXUYEa713=w1602-h979)


### so lets start:
## Clone this repositry to your android studio 
### Follow the picures below
![enter image description here](https://lh4.googleusercontent.com/4N7Y5snD4ZT6Rh8PF1WSpozoSDx9m0jhDJ1-PIf1yh-PEw-1Ho5Jq8-GF146hEM8bmv_XcxzeXC44Ub2VLVt=w1602-h979)
Url : 
![enter image description here](https://lh6.googleusercontent.com/jtBIgWsPlQ98SefLXVUiGfQHkYmbK78PQ6C2AkkbmlU7rZcCH6tTov8dzDuYv3boNP64Q1c-fFfq3BikdEqC=w951-h979)

# Dependency
we are going to use google map dependency:

    implementation 'com.google.android.gms:play-services-maps:17.0.0'

# CodeLab Start  🤖
Let's start 🤖
## MapView

Activity Name : MapViewActivity.kt
Layout Name: activity_map_view_activity.xml
Goal : Show Map on your emulator.

### XML
**TODO MapView.1**
Go to res -> layput -> activity_map_view_activity.xml and add the following code.

    <com.google.android.gms.maps.MapView  
      android:id="@+id/mapViewXML"  
      android:layout_width="match_parent"  
      android:layout_height="match_parent"  />

### Code

**TODO MapView.2** -> Implement OnMapReady on the class definition:

    class MapViewActivity : AppCompatActivity() ,OnMapReadyCallback{}

    
 **TODO MapView.3** -> Add the variables and the companion object :

     companion object{  
        private const val MAPVIEW_BUNDLE_KEY = "MapViewBundleKKey"
        }
        private lateinit var mapView: MapView
.
 **TODO MapView.4** -> Complete OnCreate function.

     override fun onCreate(savedInstanceState: Bundle?) {  
        super.onCreate(savedInstanceState)  
        setContentView(R.layout.activity_map_view)  
    
      val mapViewBundle = savedInstanceState?.getBundle(MAPVIEW_BUNDLE_KEY)  
    
      mapView = mapViewXML  
        mapView.onCreate(mapViewBundle)  
        mapView.getMapAsync(this)  
    }

 **TODO MapView.5** -> Complete onSaveInstanceState function.

     override fun onSaveInstanceState(outState: Bundle) {  
        super.onSaveInstanceState(outState)  
        val mapViewBundle = outState.getBundle(MAPVIEW_BUNDLE_KEY)?: Bundle().apply {  
      putBundle(MAPVIEW_BUNDLE_KEY,this)  
        }  
      mapView.onSaveInstanceState(mapViewBundle)  
    }

 **TODO MapView.6** -> Complete Override onMapReady function.

     override fun onMapReady(map: GoogleMap?) {  
      
    }

 **TODO MapView.7** -> Complete the life cycle functions.

    override fun onStart() {  
        super.onStart()  
        mapView.onResume()  
    }  
      
    override fun onResume() {  
        super.onResume()  
        mapView.onResume()  
    }  
      
    override fun onStop() {  
        super.onStop()  
        mapView.onStop()  
    }  
      
    override fun onPause() {  
        super.onPause()  
        mapView.onStop()  
    }  
      
    override fun onDestroy() {  
        super.onDestroy()  
        mapView.onDestroy()  
    }
Finally **Run your project!**.
## Support MapFragment

Activity Name : SupportMapFragmentActivity.kt
Layout Name: activity_support_map_fragment.xml
Goal : Show Map on your emulator.

### XML
**TODO SupportMapFragment.1**
Go to res -> layput -> activity_support_map_fragment.xml and add the following code.

    <fragment  
      android:layout_width="match_parent"  
      android:layout_height="match_parent"  
      android:name="com.google.android.gms.maps.SupportMapFragment"  
      android:id="@+id/MapFragmentXML"  
      />

### Code

**TODO SupportMapFragment.2** -> Implement OnMapReady on the class definition:

    class SupportMapFragmentActivity : AppCompatActivity() , OnMapReadyCallback {}
**TODO SupportMapFragment.3 Complete OnCreate**

    override fun onCreate(savedInstanceState: Bundle?) {  
        super.onCreate(savedInstanceState)  
        setContentView(R.layout.activity_map_fragment)  
      
        val mapFragment = supportFragmentManager  
      .findFragmentById(R.id.MapFragmentXML) as SupportMapFragment  
      
        mapFragment.getMapAsync(this)  
      
    }

**TODO SupportMapFragment.4** -> Complete Override onMapReady function

        override fun onMapReady(map : GoogleMap?) {  

        }
    

## Marker
Activity Name : Markers.kt
Layout Name: activity_markers.xml
Goal : Place a marker on the Map.
### Code

**TODO Marker.1** -> Setup a position  :

    var position = LatLng(lat,lng)  //24.788571, 46.805764

**TODO Marker.2** -> Create variable to hold the marker  :

    val marker = MarkerOptions().position(position)  
    
**TODO Marker.3** -> Add the marker to the map  :

    map!!.addMarker(marker)

**Short Way**
    
    map.addMarker
	    MarkerOptions()
		    .position(LatLng(24.788571, 46.805764)
		    )
	    )

## Polyline
Activity Name : Polylines.kt
Layout Name: activity_polyline.xml
Goal : Draw a polyline on the Map.### Code

**TODO Polyline.1** -> specify your points  :

    var point1 = LatLng(24.788571,46.805764)  //24.788571, 46.805764  
    var point2 = LatLng(24.788571,46.805764)  //24.788571, 46.805764  

**TODO Polyline.2** ->  Add your points to a Mutable List of LatLng   :

    var points = mutableListOf<LatLng>()  
    points.add(point1)  
    points.add(point2)     

 
**TODO Polyline.3** -> Create Polyline and specify the color  :

    var polyline = PolylineOptions().addAll(points).color(Color.BLUE)  

  **TODO Polyline.4** -> Add the Polyline to the map  :

    map!!.addPolyline(polyline)

  
**Short Way**
    
    map!!.addPolyline(
		    PolylineOptions()
			    .add(LatLng(1.2,2.3),LatLng(2.0,30.0))
		    .	color(Color.BLUE)
	    )

## Polygon
Activity Name : Polygons.kt
Layout Name: activity_polygon.xml
Goal : Draw a polygon on the Map.
### Code

**TODO Polygon.1** -> specify your 3 or more points    :

    var point1 = LatLng(24.788571,46.805764)  //24.788571, 46.805764  
    var point2 = LatLng(24.788571,46.805764)  //24.788571, 46.805764  
    var point3 = LatLng(24.788571,46.805764)  //24.788571, 46.805764    

**TODO Polygon.2** ->  Add your points to a Mutable List of LatLng   :

    var points = mutableListOf<LatLng>()  
    points.add(point1)  
    points.add(point2)  
    points.add(point3)     

 
**TODO Polygon.3** -> Create Polygon and specify the fill color and stroke color   :

    var polygon = PolygonOptions()  
				        .addAll(points)  
				        .fillColor(Color.GRAY)  
				        .strokeColor(Color.BLUE)  

  **TODO Polygon.4** -> Add the Polygon to the map  :

    map!!.addPolygon(polygon)

**Short Way**
    
    map!!.addPolygon(
			 PolygonOptions()
 				 .add(LatLng(1.0,2.0),LatLng(1.0,2.0),LatLng(1.0,2.0))
    			 .fillColor(Color.GRAY)
    			 .strokeColor(Color.BLUE)
    	 )



## Circle
Activity Name : Circles.kt
Layout Name: activity_circles.xml
Goal : Draw a polygon on the Map.
### Code

**TODO Circle.1** -> specify the center    :

    var center = LatLng(1.1,2.2)  

 
**TODO Circle.2** -> specify the radius   :

    var radius = 50.0  

 
**TODO Circle.3** -> Create Circle and specify the fill color and stroke colo   :

    var circle = CircleOptions().center(center).radius(radius).fillColor(Color.BLUE)  

**TODO Circle.4** -> Add the Polygon to the map     :

    map!!.addCircle(circle)
**Short Way**

     map!!.addCircle(
		     CircleOptions()
			     .center(LatLng(1.1,2.2))
			     .radius(50.0)
			     .fillColor(Color.BLUE)
	     )



# congratulations 🎊
#### Thank you for completeing the this codelab🥳.
#### if you have any questions please let me know 🧙
