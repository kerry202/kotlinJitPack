package com.dmqk.testluanch.ui.test

import android.util.Log
import com.dmqk.testluanch.base.BasePresenter
import com.hazz.kotlinmvp.net.exception.ExceptionHandle

class TestPresenter : BasePresenter<TestContract.View>(), TestContract.Presenter {

    override fun sendLogin(data: String) {
        mRootView?.showLoading()

        addSubscription(
            testModel.requestData(data)
                .subscribe({
                    mRootView?.apply {
                        dismissLoading()
                        setInfo1(it)

                        Log.d(" AAA3 : ", it.message)
                    }
                }, {
                    mRootView?.apply {

                        Log.d(" AAA4 : ", " error ")
                        setInfo2(ExceptionHandle.handleException(it))
                    }
                })
        )

    }

    override fun sendRegist(data: String) {

    }

    private val testModel: TestModel by lazy {
        TestModel()
    }


}