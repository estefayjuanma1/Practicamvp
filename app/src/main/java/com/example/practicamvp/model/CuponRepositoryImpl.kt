package com.example.practicamvp.model

import com.example.practicamvp.presenter.CuponPresenter
import cupones
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CuponRepositoryImpl (var cuponPresenter: CuponPresenter) : CuponRepository{

    override fun loadList() {
        val API_KEY="f5061e2538cc06e04b1b73e615bc7056"

        ApiService.create()
            .getTopRated(API_KEY)
            .enqueue(object : Callback<cupones> {
                override fun onFailure(call: Call<cupones>, t: Throwable) {
                    cuponPresenter.showErrorLoadCupon(t.message)

                }

                override fun onResponse(call: Call<cupones>, response: Response<cupones>) {
                    if (response.isSuccessful) {
                        cuponPresenter.sendListCupones(response.body()?.offers)
                    }
                }
            })
    }
}