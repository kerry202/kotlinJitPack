package com.dmqk.testluanch.ui.main

import com.dmqk.testluanch.ui.test.TestInfo
import com.hazz.kotlinmvp.net.RetrofitManager
import com.hazz.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

class MainModel {

    fun requestData(phone:String): Observable<TestInfo> {
        return RetrofitManager.service.getData(phone).compose(SchedulerUtils.ioToMain())
    }
}