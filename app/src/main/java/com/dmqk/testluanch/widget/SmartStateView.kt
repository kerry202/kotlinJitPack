package com.dmqk.testluanch.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat
import com.dmqk.testluanch.R
import org.jetbrains.anko.sdk27.coroutines.onClick

class SmartStateView : RelativeLayout {


    var emptyId: Int = 0
    var lodingId: Int = 0
    var errorId: Int = 0
    var contentId: Int = 0

    constructor(context: Context) : super(context) {

    }


    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs, defStyleAttr)

    }


    fun init(context: Context, attrs: AttributeSet, defStyleAttr: Int) {

        val osb = context.obtainStyledAttributes(attrs, R.styleable.SmartStateView, defStyleAttr, 0)
        emptyId = osb.getResourceId(R.styleable.SmartStateView_emptyView, R.layout.empty_view)
        lodingId = osb.getResourceId(R.styleable.SmartStateView_loadingView, R.layout.loding_view)
        errorId = osb.getResourceId(R.styleable.SmartStateView_errorView, R.layout.error_view)
        contentId = osb.getResourceId(R.styleable.SmartStateView_loadingView, 0)

    }

    fun showContentView() {

    }


    fun showErrorView() {
        removeAllViews()
        addView(View.inflate(context,  R.layout.error_view, null))
    }

    fun showEmptyView() {
        removeAllViews()
        addView(View.inflate(context, R.layout.empty_view, null))
    }


    fun showLodingView() {
        removeAllViews()
        addView(View.inflate(context,  R.layout.loding_view, null))
    }
}