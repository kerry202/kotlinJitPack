package com.dmqk.testluanch.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment<T : BasePresenter<*>> : Fragment() {

    lateinit var mPresenter: T

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayouId(), null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mPresenter = createPresenter()
        initView()

    }

    abstract fun createPresenter(): T

    abstract fun initView()

    abstract fun getLayouId(): Int

}