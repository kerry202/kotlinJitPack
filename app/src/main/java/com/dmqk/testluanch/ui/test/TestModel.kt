package com.dmqk.testluanch.ui.test

import com.hazz.kotlinmvp.net.RetrofitManager
import com.hazz.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

class TestModel {

    fun requestData(phone: String): Observable<TestInfo> {
        return RetrofitManager.service.getData(phone).compose(SchedulerUtils.ioToMain())
    }

}