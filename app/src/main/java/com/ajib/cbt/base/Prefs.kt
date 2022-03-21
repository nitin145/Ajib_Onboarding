package com.ajib.cbt.base

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.Gson
import com.provider.citoCabs.base.MainApplication


class Prefs {

    private val PREF_NAME_GLOBAL = "GLOBAL"
    private val PREF_USER_DATA = "PREF_USER_DATA"
    private val IS_LOG_IN = "IS_LOG_IN"
    private val IS_NOTI_ON = "IS_NOTI_ON"
    private val REFERRAL_UID = "REFERRAL_UID"
    private val USER_TYPE = "USER_TYPE"
    private val USER_ID = "USER_ID"
    private val IS_PROFILE_COMPLETED = "IS_PROFILE_COMPLETED"
    private val ACCESS_TOKEN = "ACCESS_TOKEN"
    private val ELAPSED_TIME_REFER = "ELAPSED_TIME_REFER"
    private val DEVICE_TOKEN = "DEVICE_TOKEN"
    private val IS_SUBSCRIBED = "IS_SUBSCRIBED"
    private val IS_SUBSCRIBED_DATE = "IS_SUBSCRIBED_DATE"
    private val USER_IMAGE = "USER_IMAGE"
    private val USER_NAME = "USER_NAME"
    private val USER_MOBILE = "USER_MOBILE"


    private var sharedPreferences: SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(MainApplication.get().applicationContext)

    init {
        instance = this
    }

    val gson = Gson()


    companion object {
        private var instance: Prefs? = null
        fun init(): Prefs {
            if (instance == null) {
                instance = Prefs()
            }
            return instance!!
        }
    }


    fun clear() {
        sharedPreferences.edit().clear().apply()
    }

    var accessToken: String
        get() {
            val sF = MainApplication.get().applicationContext
                .getSharedPreferences(PREF_NAME_GLOBAL, Context.MODE_PRIVATE)
            return sF.getString(ACCESS_TOKEN, "") ?: ""
        }
        set(value) {
            val sF = MainApplication.get().applicationContext
                .getSharedPreferences(PREF_NAME_GLOBAL, Context.MODE_PRIVATE)
            sF.edit().putString(ACCESS_TOKEN, value).apply()
        }




}