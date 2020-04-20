package com.example.practicamvp.presenter

import Offer

interface CuponPresenter {
     fun loadList()
     fun showErrorLoadCupon(message: String?)
     fun sendListCupones(cupones: List<Offer>?)
    //   fun sendListCupones(cupones: List<Offer>?)
}