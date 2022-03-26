package com.ajib.cbt.ui.activities

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import com.ajib.cbt.R
import com.ajib.cbt.base.ScopedActivity
import com.ajib.cbt.databinding.AuthHandlerActivityBinding

class AuthHandlerActivity : ScopedActivity(), NavController.OnDestinationChangedListener {

    lateinit var mBinding: AuthHandlerActivityBinding
    lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment
    var listener: onClickListeners? = null

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setStatusBarColor(R.color.themeColor)
        mBinding = DataBindingUtil.setContentView(
            this,
            R.layout.auth_handler_activity
        )
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        navController.addOnDestinationChangedListener(this)


        mBinding.ivBack.setOnClickListener {
            onBackPressed()
        }
    }


    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {

        when (destination.id) {
            R.id.get_started_fragment -> {
                mBinding.clBottomView.isVisible = false
            }
            else -> mBinding.clBottomView.isVisible = true

        }

        setProgress(destination)


    }

    fun setProgress(destination: NavDestination) {
        when (destination.id) {
            R.id.get_started_fragment -> mBinding.mfProgressBar.progress = 6
            R.id.enter_mobile_fragment -> mBinding.mfProgressBar.progress = 12
            R.id.scan_front_id_frgament -> mBinding.mfProgressBar.progress = 18
            R.id.scan_back_id_frgament -> mBinding.mfProgressBar.progress = 24
            R.id.personal_details_fragment -> mBinding.mfProgressBar.progress = 30
            R.id.take_selfie_fragment -> mBinding.mfProgressBar.progress = 36
            R.id.address_details_fragment -> mBinding.mfProgressBar.progress = 42
            R.id.employment_details_fragment -> mBinding.mfProgressBar.progress = 48
            R.id.us_factors_fragment -> mBinding.mfProgressBar.progress = 54
            R.id.preferred_account_fragment -> mBinding.mfProgressBar.progress = 60
            R.id.preferred_currency_fragment -> mBinding.mfProgressBar.progress = 66
            R.id.branch_fragment -> mBinding.mfProgressBar.progress = 72
            R.id.terms_fragment -> mBinding.mfProgressBar.progress = 78
            R.id.create_password_fragment -> mBinding.mfProgressBar.progress = 84
            R.id.face_id_fragment -> mBinding.mfProgressBar.progress = 92
            R.id.account_completition_fragment -> mBinding.mfProgressBar.progress = 100
        }
    }

    override fun onBackPressed() {
        if (!navController.navigateUp()) {
            super.onBackPressed()
        }

    }


    interface onClickListeners {
        fun onClickNext()
    }

}