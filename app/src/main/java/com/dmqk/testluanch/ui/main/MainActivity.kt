package com.dmqk.testluanch.ui.main

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Message
import com.dmqk.testluanch.R
import com.dmqk.testluanch.base.BaseActivity
import com.dmqk.testluanch.ui.test.TestInfo
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast

class MainActivity : BaseActivity<MainPresenter>(), MainContract.View {

    var count = 0
    val mHandler: Handler = @SuppressLint("HandlerLeak")
    object : Handler() {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            if (count == 3) {
                count = 0
            }
            when (count) {
                0 -> homeSmart.showEmptyView()
                1 -> homeSmart.showErrorView()
                2 -> homeSmart.showLodingView()
            }
            sendEmptyMessageDelayed(count, 2000)
            count++
        }
    }

    override fun setInfo1(url: TestInfo) {


    }

    override fun setInfo2(txt: String) {
    }

    override fun requestError(txt: String) {
    }

    override fun showLoading() {

    }

    override fun dismissLoading() {
    }

    override fun createPresenter(): MainPresenter = MainPresenter()

    override fun initListener() {
        mPresenter.attachView(this)

    }

    override fun initView() {
        mHandler.sendEmptyMessageDelayed(count, 2000)

        empty.onClick {
            toast("empty")
            homeSmart.showEmptyView()
        }

        loding.onClick {
            toast("loding")
            homeSmart.showLodingView()
        }
        error.onClick {
            homeSmart.showErrorView()
            toast("error")
        }
    }

    override fun initData() {


    }


    override fun layoutId(): Int = R.layout.activity_main


}
