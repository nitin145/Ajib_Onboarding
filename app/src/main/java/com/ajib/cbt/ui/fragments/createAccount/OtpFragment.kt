package com.ajib.cbt.ui.fragments.createAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ajib.cbt.R
import com.ajib.cbt.base.ScopedFragment
import com.ajib.cbt.databinding.OtpFragmentBinding
import org.kodein.di.KodeinAware


class OtpFragment : ScopedFragment(), KodeinAware {
    override val kodein by lazy { (activity?.applicationContext as KodeinAware).kodein }
    lateinit var mBinding: OtpFragmentBinding
    var enteredText = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (!::mBinding.isInitialized) {
            mBinding = OtpFragmentBinding.inflate(inflater, container, false).apply {
                clickHandler = ClickHandler()
            }

        }
        return mBinding.root
    }


    inner class ClickHandler {
        fun onClickNext() {
            findNavController().navigate(R.id.scan_front_id_frgament)
        }

        fun enterOne() {
            enteredText = mBinding.etCode.text.toString() + "1"
            mBinding.etCode.setText(enteredText)

        }

        fun enterTwo() {
            enteredText = mBinding.etCode.text.toString() + "2"
            mBinding.etCode.setText(enteredText)

        }

        fun enterThree() {
            enteredText = mBinding.etCode.text.toString() + "3"
            mBinding.etCode.setText(enteredText)

        }

        fun enterFour() {
            enteredText = mBinding.etCode.text.toString() + "4"
            mBinding.etCode.setText(enteredText)

        }

        fun enterFive() {
            enteredText = mBinding.etCode.text.toString() + "5"
            mBinding.etCode.setText(enteredText)

        }

        fun enterSix() {
            enteredText = mBinding.etCode.text.toString() + "6"
            mBinding.etCode.setText(enteredText)

        }

        fun enterSeven() {
            enteredText = mBinding.etCode.text.toString() + "7"
            mBinding.etCode.setText(enteredText)

        }

        fun enterEight() {
            enteredText = mBinding.etCode.text.toString() + "8"
            mBinding.etCode.setText(enteredText)

        }

        fun enterNine() {
            enteredText = mBinding.etCode.text.toString() + "9"
            mBinding.etCode.setText(enteredText)

        }
        fun enterZero() {
            enteredText = mBinding.etCode.text.toString() + "0"
            mBinding.etCode.setText(enteredText)

        }


        fun clear() {
            if (mBinding.etCode.text.length - 1 >= 1) {
                mBinding.etCode.setText(
                    mBinding.etCode.text.substring(
                        0,
                        mBinding.etCode.text.length - 1
                    )
                )

            }else{
                mBinding.etCode.setText("")

            }


        }
    }


}