package com.ajib.cbt.base

import android.app.Activity
import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule


class MainApplication : Application(), KodeinAware {

    companion object {
        lateinit var instance: MainApplication
        fun get(): MainApplication = instance


    }


    private var mCurrentActivity: Activity? = null


    fun getCurrentActivity(): Activity? {
        return mCurrentActivity
    }

    fun setCurrentActivity(mCurrentActivity: Activity?) {
        this.mCurrentActivity = mCurrentActivity
    }


    override val kodein: Kodein = Kodein.lazy {
        import(androidXModule(this@MainApplication))


    }

    override fun onCreate() {
        super.onCreate()


    }


}