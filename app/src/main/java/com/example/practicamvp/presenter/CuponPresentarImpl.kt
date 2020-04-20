package com.example.practicamvp.presenter

import Offer
import com.example.practicamvp.model.CuponInteractor
import com.example.practicamvp.model.CuponInteraptorImpl
import com.example.practicamvp.view.CuponView

class CuponPresentarImpl (var cuponView: CuponView) : CuponPresenter{

    private var cuponInteractor : CuponInteractor = CuponInteraptorImpl(this)


    override fun loadList() {
        cuponInteractor.loadList()
    }

    override fun showErrorLoadCupon(message: String?) {
        cuponView.showErrorLoadCupon(message)
    }

    override fun sendListCupones(cupones: List<Offer>?) {
        cuponView.showListCupones(cupones)
    }
}