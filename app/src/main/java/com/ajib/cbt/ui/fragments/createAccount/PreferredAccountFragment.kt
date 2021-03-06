package com.ajib.cbt.ui.fragments.createAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ajib.cbt.R
import com.ajib.cbt.base.ScopedFragment
import com.ajib.cbt.databinding.EmploymentDetailsFragmentBinding
import com.ajib.cbt.databinding.PreferredAccountFragmentBinding
import org.kodein.di.KodeinAware


class PreferredAccountFragment : ScopedFragment(), KodeinAware {
    override val kodein by lazy { (activity?.applicationContext as KodeinAware).kodein }
    lateinit var mBinding: PreferredAccountFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (!::mBinding.isInitialized) {
            mBinding = PreferredAccountFragmentBinding.inflate(inflater, container, false).apply {
                clickHandler = ClickHandler()
            }

        }
        return mBinding.root
    }


    inner class ClickHandler {
        fun onClickNext() {
            findNavController().navigate(R.id.preferred_currency_fragment)
        }

    }


}