package com.example.practicamvp.model

import com.example.practicamvp.presenter.CuponPresenter

class CuponInteraptorImpl (var cuponPresenter : CuponPresenter) : CuponInteractor {

    private var cuponRepository: CuponRepository = CuponRepositoryImpl(cuponPresenter)

    override fun loadList() {
        cuponRepository.loadList()
    }

}