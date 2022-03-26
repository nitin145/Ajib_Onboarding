package com.ajib.cbt.ui.fragments.createAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ajib.cbt.base.ScopedFragment
import com.ajib.cbt.databinding.AccountCompletitionFragmentBinding
import org.kodein.di.KodeinAware


class AccountCompletitionFragment : ScopedFragment(), KodeinAware {
    override val kodein by lazy { (activity?.applicationContext as KodeinAware).kodein }
    lateinit var mBinding: AccountCompletitionFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (!::mBinding.isInitialized) {
            mBinding =
                AccountCompletitionFragmentBinding.inflate(inflater, container, false).apply {
                    clickHandler = ClickHandler()
                }

        }
        return mBinding.root
    }


    inner class ClickHandler {
        fun onClickNext() {
        }

    }


}