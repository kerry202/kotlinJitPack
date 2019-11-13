package com.dmqk.testluanch.util

import android.content.Context
import android.content.SharedPreferences

import com.dmqk.testluanch.base.MyApp


object SPUtil {

    private val KEY = "test"

    private val sp: SharedPreferences
        get() = MyApp.mContext.getSharedPreferences(KEY, Context.MODE_PRIVATE)


    fun putBoolean(key: String, value: Boolean) {
        val sp = sp
        sp.edit().putBoolean(key, value).apply()
    }


    @JvmOverloads
    fun getBoolean(key: String, defValue: Boolean = false): Boolean {
        val sp = sp
        return sp.getBoolean(key, defValue)
    }

    fun putString(key: String, value: String) {
        val sp = sp
        sp.edit().putString(key, value).apply()
    }

    fun putLong(key: String, value: Long) {
        val sp = sp
        sp.edit().putLong(key, value).apply()
    }

    fun getLong(key: String, defValue: Long): Long {
        val sp = sp
        return sp.getLong(key, defValue)
    }

    fun getString(key: String, defValue: String = ""): String? {
        val sp = sp
        return sp.getString(key, defValue)
    }

    fun putInt(key: String, value: Int) {
        val sp = sp
        sp.edit().putInt(key, value).apply()
    }


    @JvmOverloads
    fun getInt(key: String, defValue: Int = -1): Int {
        val sp = sp
        return sp.getInt(key, defValue)
    }

    fun remove(key: String) {
        val sp = sp
        val editor = sp.edit()
        editor.remove(key)
        editor.apply()
    }

    fun clear() {
        val sp = sp
        sp.edit().clear().apply()
    }

}
