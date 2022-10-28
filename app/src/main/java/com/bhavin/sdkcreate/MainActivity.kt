package com.bhavin.sdkcreate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bhavin.duesdk.ToastMessage.Companion.toastMessage
import com.bhavin.sdkcreate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toastMesage.setOnClickListener {
            toastMessage(this@MainActivity,"Bana..na...")
        }
    }

}