package com.dmqk.testluanch.base

interface IPresenter<in V : IBaseView> {

    fun attachView(mRootView: V)

    fun detachView()

}