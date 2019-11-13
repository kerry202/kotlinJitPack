package com.dmqk.testluanch.ui.test

import com.dmqk.testluanch.R
import com.dmqk.testluanch.base.BaseActivity
import org.jetbrains.anko.debug

class TestActivity : BaseActivity<TestPresenter>(), TestContract.View {

    override fun createPresenter(): TestPresenter = TestPresenter()

    override fun setInfo1(url: TestInfo) {
        debug { url }
//        Test.test()
    }

    override fun setInfo2(txt: String) {


    }

    override fun requestError(txt: String) {

    }

    override fun showLoading() {

    }

    override fun dismissLoading() {

    }


    override fun initListener() {


    }

    override fun initView() {
        mPresenter.attachView(this)

    }

    override fun initData() {
        mPresenter.sendLogin("1")
    }

    override fun layoutId(): Int = R.layout.test_layout


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}