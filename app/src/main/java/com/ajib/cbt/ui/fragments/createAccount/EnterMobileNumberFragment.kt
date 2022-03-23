package com.ajib.cbt.ui.fragments.createAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ajib.cbt.base.ScopedFragment
import com.ajib.cbt.databinding.EnterMobileFragmentBinding
import com.ajib.cbt.databinding.GetStartedFragmentBinding
import org.kodein.di.KodeinAware


class EnterMobileNumberFragment : ScopedFragment(), KodeinAware {
    override val kodein by lazy { (activity?.applicationContext as KodeinAware).kodein }
    lateinit var mBinding: EnterMobileFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (!::mBinding.isInitialized) {
            mBinding = EnterMobileFragmentBinding.inflate(inflater, container, false).apply {
                clickHandler = ClickHandler()
            }

        }
        return mBinding.root
    }


    inner class ClickHandler {
        fun onClickNext() {
            findNavController()
        }
    }


}