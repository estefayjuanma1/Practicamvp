package com.example.practicamvp.view

import Offer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicamvp.R
import com.example.practicamvp.presenter.DescriptionPresenter
import com.example.practicamvp.presenter.DescriptionPresenterImp
import kotlinx.android.synthetic.main.activity_descripcion.*

class DescripcionActivity : AppCompatActivity() , DescriptionView{

    private var descriptionPresenter: DescriptionPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descripcion)

        descriptionPresenter = DescriptionPresenterImp(this)
        val cupon = intent?.getSerializableExtra("Cupon") as Offer
        getCupon(cupon)
    }

    fun getCupon(cupon: Offer) {
        descriptionPresenter?.loadcupon(cupon)
    }

    override fun cargarCupon(cupon: Offer) {
        if (!cupon.description.isNullOrEmpty())
            tv_descripciond.text = cupon.description

        tv_titulod.text = cupon.title

    }


//    private fun cargarDescripcion(cupon: Offer){
//        if (!cupon.description.isNullOrEmpty()) {
//            tv_descripciond.text = cupon.description
//        }
//        tv_titulod.text = cupon.title
//        }
    }

