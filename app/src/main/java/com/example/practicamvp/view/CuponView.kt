package com.example.practicamvp.view

import Offer

interface CuponView {
     fun showErrorLoadCupon(message: String?)
     fun showListCupones (cupones: List<Offer>?)
}