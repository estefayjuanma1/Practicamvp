package com.example.practicamvp.presenter

import Offer
import com.example.practicamvp.model.DescriptionInteractor
import com.example.practicamvp.model.DescriptionInteractorImp
import com.example.practicamvp.view.DescriptionView

class DescriptionPresenterImp(var descriptionView: DescriptionView): DescriptionPresenter {

  private var descriptionInteractor : DescriptionInteractor = DescriptionInteractorImp(this)
  override fun cargarCupon(cupon: Offer) {
      descriptionView.cargarCupon(cupon)
  }

  override fun loadcupon(cupon: Offer) {
      descriptionInteractor.loadcupon(cupon)
  }
}