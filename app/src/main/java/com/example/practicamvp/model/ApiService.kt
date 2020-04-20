package com.example.practicamvp.model
import com.google.gson.GsonBuilder
import retrofit2.http.GET
import retrofit2.http.Query
import cupones
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call

interface ApiService {

    @GET("getOffers/?format=json")
    fun getTopRated(@Query("API_KEY") apiKey: String): Call<cupones>

    companion object{
        val urlAPI = "http://feed.linkmydeals.com/"

        fun create(): ApiService {
  //          val gson= GsonBuilder().setLenient().create()


            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(urlAPI)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()

            return retrofit.create(ApiService::class.java)
        }
    }
}