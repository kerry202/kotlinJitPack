package com.hazz.kotlinmvp.api

import com.dmqk.testluanch.ui.test.TestInfo
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {




    @GET("/game/v1/homePage")
    fun getData(@Query("modelType") num: String): Observable<TestInfo>


}