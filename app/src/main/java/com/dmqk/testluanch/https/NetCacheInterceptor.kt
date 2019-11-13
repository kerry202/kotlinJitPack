package com.dmqk.testluanch.https

import java.io.IOException

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class NetCacheInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val response = chain.proceed(request)
        val onlineCacheTime = 60
        return response.newBuilder()
            .header("Cache-Control", "public, max-age=$onlineCacheTime")
            .removeHeader("Pragma")
            .build()
    }
}