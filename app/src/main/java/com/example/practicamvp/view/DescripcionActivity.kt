package com.example.practicamvp.view

import Offer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicamvp.R
import kotlinx.android.synthetic.main.activity_descripcion.*

class DescripcionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descripcion)

        val cupon = intent?.getSerializableExtra("Cupon") as Offer
        cargarDescripcion(cupon)
    }

    private fun cargarDescripcion(cupon: Offer){
        if (!cupon.description.isNullOrEmpty()) {
            tv_descripciond.text = cupon.description
        }
        tv_titulod.text = cupon.title
        }
    }

