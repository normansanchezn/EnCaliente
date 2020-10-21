package com.empresa.encaliente.ui.register.childfragments.mail

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.empresa.encaliente.R
import com.empresa.encaliente.utils.Toolbox
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
                    Toolbox().createToast(requireContext(), resources.getString(R.string.error_empty_mail), false)
                }
                !Patterns.EMAIL_ADDRESS.matcher(etMail.text.toString()).matches() -> {
                    Toolbox().createToast(requireContext(), resources.getString(R.string.error_validate_email), false)
                }
                else -> {
                    findNavController().navigate(R.id.passwordFragment)
                }
            }
        }

    }
}