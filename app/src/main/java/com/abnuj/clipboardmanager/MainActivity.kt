package com.abnuj.clipboardmanager

import android.hardware.Sensor
import android.hardware.SensorManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abnuj.clipboardmanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
//       val deviceSensors:List<Sensor> = sensorManager.getSensorList(Sensor.TYPE_ALL)
        if(sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) !=null)
        {
            // we have accelerometer 
        }
    }
}