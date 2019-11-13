package com.dmqk.testluanch.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.jetbrains.anko.AnkoLogger

abstract class BaseActivity<T : BasePresenter<*>> : AppCompatActivity() ,AnkoLogger {

    var eventBus = MyApp.mEventBus

    lateinit var mPresenter: T

    val mActivity by lazy {
        this
    }

    @Subscribe
    fun onEvent(obj: Any) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        mPresenter = createPresenter()
        if (!EventBus.getDefault().isRegistered(this)) {
            eventBus.register(this)
        }

        initData()
        initView()
        initListener()

    }

    abstract fun createPresenter(): T


    abstract fun initListener()


    abstract fun initView()

    abstract fun initData()

    abstract fun layoutId(): Int

    override fun onDestroy() {
        super.onDestroy()
        eventBus.unregister(this)
        mPresenter.let {
            it.detachView()
        }
    }
}