package com.dmqk.testluanch.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BasePresenter<T : IBaseView> : IPresenter<T> {

    var mRootView: T? = null

    private var compositeDisposable = CompositeDisposable()

    override fun attachView(mRootView: T) {
        this.mRootView = mRootView

    }

    override fun detachView() {
        mRootView = null
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.clear()
        }
    }

    fun addSubscription(disposable: Disposable) {

    }
}