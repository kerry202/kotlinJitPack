package com.dmqk.testluanch.base

import android.app.Application
import android.content.Context
import android.os.SystemClock
import org.greenrobot.eventbus.EventBus

class MyApp : Application() {

    companion object {
        lateinit var mContext: Context
        lateinit var mEventBus: EventBus
    }


    override fun onCreate() {
        super.onCreate()
        mContext = this
        mEventBus = EventBus.getDefault()

        SystemClock.sleep(2000)

    }

}