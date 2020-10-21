package com.empresa.encaliente.ui.register.childfragments.codeconfirm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.empresa.encaliente.R
import com.empresa.encaliente.utils.Toolbox
import kotlinx.android.synthetic.main.fragment_code_confirm.*

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class CodeConfirmFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_code_confirm, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvSendAgainOtp.setOnClickListener {
            Toolbox().createToast(requireContext(), resources.getString(R.string.send_otp), false)
        }

        fabConfirmOtp.setOnClickListener {
            when {
                etOtp.text.isEmpty() -> {
                    Toolbox().createToast(requireContext(), resources.getString(R.string.error_otp_empty), false)
                }
                etOtp.text.length < 6 -> {
                    Toolbox().createToast(requireContext(), resources.getString(R.string.error_otp_validate), false)
                }
                else -> {
                    if (otpExist()){
                        findNavController().navigate(R.id.mailFragment)
                    } else {
                        Toolbox().createToast(requireContext(), resources.getString(R.string.error_dont_exist_otp), false)
                    }
                }
            }
        }
    }

    private fun otpExist(): Boolean {
        // Return false for don't exist
        return true
    }
}