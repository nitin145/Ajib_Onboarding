package com.ajib.cbt.ui.fragments.createAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.ajib.cbt.R
import com.ajib.cbt.base.ScopedFragment
import com.ajib.cbt.databinding.TermsFragmentBinding
import org.kodein.di.KodeinAware


class TermsFragment : ScopedFragment(), KodeinAware {
    override val kodein by lazy { (activity?.applicationContext as KodeinAware).kodein }
    lateinit var mBinding: TermsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (!::mBinding.isInitialized) {
            mBinding = TermsFragmentBinding.inflate(inflater, container, false).apply {
                clickHandler = ClickHandler()
            }

        }
        return mBinding.root
    }


    inner class ClickHandler {
        fun onClickNext() {
            findNavController().navigate(
                R.id.otp_fragment, bundleOf(
                    getString(R.string.via) to getString(R.string.terms_conditions)
                )
            )
        }

    }


}