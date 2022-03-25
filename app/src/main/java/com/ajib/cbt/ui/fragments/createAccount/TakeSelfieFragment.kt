package com.ajib.cbt.ui.fragments.createAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.ajib.cbt.R
import com.ajib.cbt.base.ScopedFragment
import com.ajib.cbt.databinding.TakeSelfieFragmentBinding
import org.kodein.di.KodeinAware


class TakeSelfieFragment : ScopedFragment(), KodeinAware {
    override val kodein by lazy { (activity?.applicationContext as KodeinAware).kodein }
    lateinit var mBinding: TakeSelfieFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (!::mBinding.isInitialized) {
            mBinding = TakeSelfieFragmentBinding.inflate(inflater, container, false).apply {
                clickHandler = ClickHandler()
            }

        }
        return mBinding.root
    }


    inner class ClickHandler {
        fun onClickNext() {
            if (mBinding.bNext.text == getString(R.string.capture)) {
                mBinding.lMobileNumber.isVisible = false
                mBinding.clResult.isVisible = true
                mBinding.bNext.text = "Next"
            } else {
                findNavController().navigate(R.id.address_details_fragment)

            }
        }

    }


}