package com.dmqk.testluanch.https


import java.io.IOException

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response


class HeaderInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()
        builder.addHeader("X-Access-Token", "")
        return chain.proceed(builder.build())
    }
}