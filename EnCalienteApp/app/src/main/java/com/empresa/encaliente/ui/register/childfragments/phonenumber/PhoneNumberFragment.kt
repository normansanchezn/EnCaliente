package com.empresa.encaliente.ui.register.childfragments.phonenumber

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.empresa.encaliente.R
import com.empresa.encaliente.utils.Toolbox
import kotlinx.android.synthetic.main.fragment_phone_numer.*

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class PhoneNumberFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_phone_numer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fabGoCodeConfirm.setOnClickListener {
            when {
                etPhoneNumber.text.isEmpty() -> {
                    Toolbox().createToast(requireContext(), resources.getString(R.string.error_empty_phone), false)
                }
                etPhoneNumber.text.length < 10 -> {
                    Toolbox().createToast(requireContext(), resources.getString(R.string.error_validate_phone), false)
                }
                else -> {
                    savePhone()
                    findNavController().navigate(R.id.codeConfirmFragment)
                }
            }
        }
    }

    private fun savePhone() {
        // TODO("Not yet implemented")
    }
}