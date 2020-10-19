package com.empresa.encaliente.ui.register.childfragments.codeconfirm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.empresa.encaliente.R
import com.empresa.encaliente.utils.Utils
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
            Utils().createToast(requireContext(), "Se envió el OTP", false)
        }

        fabConfirmOtp.setOnClickListener {
            findNavController().navigate(R.id.mailFragment)
        }
    }
}