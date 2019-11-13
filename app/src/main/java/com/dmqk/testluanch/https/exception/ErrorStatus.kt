package com.hazz.kotlinmvp.net.exception


object ErrorStatus {

    @JvmField
    val SUCCESS = 200

    @JvmField
    val UNKNOWN_ERROR = 503


    @JvmField
    val SERVER_ERROR = 500


    @JvmField
    val NETWORK_ERROR = 502


    @JvmField
    val API_ERROR = 400

}