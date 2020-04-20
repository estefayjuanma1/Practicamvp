package com.example.practicamvp.view

import Offer
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practicamvp.R
import com.example.practicamvp.model.ApiService
import com.example.practicamvp.presenter.CuponPresentarImpl
import com.example.practicamvp.presenter.CuponPresenter
import cupones
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log


class MainActivity : AppCompatActivity(), CuponView {

    private var cuponPresenter: CuponPresenter? = null
    private var listcupone:List<Offer>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cuponPresenter = CuponPresentarImpl(this)
        getCupons()
    }
    fun getCupons(){
        cuponPresenter?.loadList()
    }

    override fun showErrorLoadCupon(message: String?) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        Log.d("Hola",message)
    }

    override fun showListCupones(cupones: List<Offer>?) {
        this.listcupone = cupones
        rv.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false)
        val cuponesAdapter = Adapter(listcupone as ArrayList<Offer>)
        rv.adapter = cuponesAdapter
    }

}