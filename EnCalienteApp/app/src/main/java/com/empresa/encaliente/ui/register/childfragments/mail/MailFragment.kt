package com.empresa.encaliente.ui.register.childfragments.mail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.empresa.encaliente.R
import com.empresa.encaliente.utils.Utils
import kotlinx.android.synthetic.main.fragment_mail.*

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class MailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fabConfirmMail.setOnClickListener {
            when {
                etMail.text.isEmpty() -> {
                    Utils().createToast(requireContext(), "¡Debes ingresar un correo electrónico!", false)
                }
                !etMail.text.contains("@") && !etMail.text.contains(".") -> {
                    Utils().createToast(requireContext(), "Debes ingresar un correo electrónico válido", false)
                }
                else -> {
                    findNavController().navigate(R.id.passwordFragment)
                }
            }
        }

    }
}