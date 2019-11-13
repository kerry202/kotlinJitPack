package com.dmqk.testluanch.ui.test

import com.dmqk.testluanch.base.IBaseView
import com.dmqk.testluanch.base.IPresenter

interface TestContract {

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