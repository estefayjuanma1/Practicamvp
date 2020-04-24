package com.example.practicamvp.model
import Offer
import com.example.practicamvp.presenter.DescriptionPresenter

class DescriptionRepositoryImp(var descriptionPresenter: DescriptionPresenter) : DescriptionRepository {
    override fun loadcupon(cupon: Offer) {
        descriptionPresenter.cargarCupon(cupon)
    }


}