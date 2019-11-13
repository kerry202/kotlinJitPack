package com.hazz.kotlinmvp.net

import com.dmqk.testluanch.base.MyApp
import com.dmqk.testluanch.https.*
import com.hazz.kotlinmvp.api.ApiService
import com.hazz.kotlinmvp.api.UrlConstant
import okhttp3.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

object RetrofitManager{

    val service: ApiService by lazy (LazyThreadSafetyMode.SYNCHRONIZED){
        getRetrofit().create(ApiService::class.java)
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(UrlConstant.BASE_URL)
                .client(getOkHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()

    }

    private fun getOkHttpClient(): OkHttpClient {

        //设置 请求的缓存的大小跟位置
        val cacheFile = File(MyApp.mContext.cacheDir, "cache")
        val cache = Cache(cacheFile, 1024 * 1024 * 50) //50Mb 缓存的大小

        return OkHttpClient.Builder()
                .addInterceptor(QueryParameterInterceptor())  //参数添加
                .addInterceptor(HeaderInterceptor())
                .addInterceptor(NetCacheInterceptor())
                .addInterceptor(LoggingInterceptor())
                .cache(cache)  //添加缓存
                .connectTimeout(60L, TimeUnit.SECONDS)
                .readTimeout(60L, TimeUnit.SECONDS)
                .writeTimeout(60L, TimeUnit.SECONDS)
                .build()
    }


}
