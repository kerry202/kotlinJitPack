package com.dmqk.testluanch.https


import java.io.IOException
import okhttp3.Interceptor
import okhttp3.Response

class LoggingInterceptor : Interceptor {

    private val byteCount = 1024 * 1024

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        val response = chain.proceed(request)
        val responseBody = response.peekBody(byteCount.toLong())
        val data = responseBody.string()
        return response
    }
}