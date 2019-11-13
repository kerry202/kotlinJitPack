package com.dmqk.testluanch.https

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class QueryParameterInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val request: Request
        val modifiedUrl = originalRequest.url().newBuilder()
            // Provide your custom parameter here
            .addQueryParameter("udid", "d2807c895f0348a180148c9dfa6f2feeac0781b5")
            .addQueryParameter("deviceModel", "")
            .build()
        request = originalRequest.newBuilder().url(modifiedUrl).build()

        return chain.proceed(request)
    }
}