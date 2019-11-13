package com.dmqk.testluanch.ui.main

import com.dmqk.testluanch.base.BasePresenter
import com.hazz.kotlinmvp.net.exception.ExceptionHandle

class MainPresenter : BasePresenter<MainContract.View>(), MainContract.Presenter {
    override fun sendRegist(data: String) {
        mRootView?.showLoading()

        addSubscription(testModel.requestData(data)
            .subscribe({
                mRootView?.apply {
                    dismissLoading()
                    setInfo1(it)
                }
            }, {
                mRootView?.apply {
                    setInfo2(ExceptionHandle.handleException(it))
                }
            }))
    }

    override fun sendLogin(data: String) {

    }

    private val testModel: MainModel by lazy {
        MainModel()
    }


}