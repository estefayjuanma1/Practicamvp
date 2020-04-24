package com.example.practicamvp.model

import Offer
import com.example.practicamvp.presenter.DescriptionPresenter

class DescriptionInteractorImp(var descriptionPresenter: DescriptionPresenter) : DescriptionInteractor {

    private var descriptionRepository: DescriptionRepository = DescriptionRepositoryImp(descriptionPresenter)

    override fun loadcupon(cupon: Offer) {
        descriptionRepository.loadcupon(cupon)
    }


}