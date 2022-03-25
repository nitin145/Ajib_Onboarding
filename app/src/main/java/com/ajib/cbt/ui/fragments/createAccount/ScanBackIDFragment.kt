package com.ajib.cbt.ui.fragments.createAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ajib.cbt.R
import com.ajib.cbt.base.ScopedFragment
import com.ajib.cbt.databinding.ScanBackIdFrgamentBinding
import org.kodein.di.KodeinAware


class ScanBackIDFragment : ScopedFragment(), KodeinAware {
    override val kodein by lazy { (activity?.applicationContext as KodeinAware).kodein }
    lateinit var mBinding: ScanBackIdFrgamentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (!::mBinding.isInitialized) {
            mBinding = ScanBackIdFrgamentBinding.inflate(inflater, container, false).apply {
                clickHandler = ClickHandler()
            }

        }
        return mBinding.root
    }


    inner class ClickHandler {
        fun onClickNext() {
            findNavController().navigate(R.id.personal_details_fragment)
        }
    }


}