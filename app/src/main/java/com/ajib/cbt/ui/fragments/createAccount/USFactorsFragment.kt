package com.ajib.cbt.ui.fragments.createAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ajib.cbt.R
import com.ajib.cbt.base.ScopedFragment
import com.ajib.cbt.databinding.UsFactorsFragmentBinding
import org.kodein.di.KodeinAware


class USFactorsFragment : ScopedFragment(), KodeinAware {
    override val kodein by lazy { (activity?.applicationContext as KodeinAware).kodein }
    lateinit var mBinding: UsFactorsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (!::mBinding.isInitialized) {
            mBinding = UsFactorsFragmentBinding.inflate(inflater, container, false).apply {
                clickHandler = ClickHandler()
            }
        }
        onCheckedChangeListenerd()
        return mBinding.root
    }


    inner class ClickHandler {
        fun onClickNext() {
            findNavController().navigate(R.id.preferred_account_fragment)
        }


    }

    fun onCheckedChangeListenerd() {
        mBinding.lOne.toggle.setOnCheckedChangeListener { p0, p1 ->
            when (p1) {
                R.id.yes -> {
                    findNavController().navigate(R.id.scan_us_passport_frgament)
                }
            }
        }
        mBinding.lTwo.toggle.setOnCheckedChangeListener { p0, p1 ->
            when (p1) {
                R.id.yes -> {
                    findNavController().navigate(R.id.scan_us_passport_frgament)
                }
            }
        }
        mBinding.lThree.toggle.setOnCheckedChangeListener { p0, p1 ->
            when (p1) {
                R.id.yes -> {
                    findNavController().navigate(R.id.scan_us_passport_frgament)
                }
            }
        }
        mBinding.lFour.toggle.setOnCheckedChangeListener { p0, p1 ->
            when (p1) {
                R.id.yes -> {
                    findNavController().navigate(R.id.scan_us_passport_frgament)
                }
            }
        }
        mBinding.lFice.toggle.setOnCheckedChangeListener { p0, p1 ->
            when (p1) {
                R.id.yes -> {
                    findNavController().navigate(R.id.scan_us_passport_frgament)
                }
            }
        }
    }


}