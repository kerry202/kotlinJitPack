package com.dmqk.testluanch.ui.main

import com.dmqk.testluanch.base.IBaseView
import com.dmqk.testluanch.base.IPresenter
import com.dmqk.testluanch.ui.test.TestInfo

interface MainContract {

    interface View : IBaseView {

        fun setInfo1(url: TestInfo)

        fun setInfo2(txt: String)

        fun requestError(txt: String)

    }

    interface Presenter : IPresenter<View> {

        fun sendLogin(data: String)

        fun sendRegist(data: String)


    }

}