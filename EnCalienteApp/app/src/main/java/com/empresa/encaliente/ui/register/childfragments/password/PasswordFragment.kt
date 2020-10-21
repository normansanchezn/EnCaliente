package com.empresa.encaliente.ui.register.childfragments.password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.empresa.encaliente.R
import com.empresa.encaliente.utils.Toolbox
import kotlinx.android.synthetic.main.fragment_password.*


/**
 * Created by Norman Sánchez on 18/10/20.
 */
class PasswordFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabConfirmPassword.setOnClickListener {
            when {
                etPasswordRegister.text.toString().isEmpty() -> {
                    Toolbox().createToast(requireContext(), resources.getString(R.string.error_empty_pass), false)
                }
                etPasswordRegister.text.length <= 8 -> {
                    Toolbox().createToast(requireContext(), resources.getString(R.string.error_validate_pass), false)
                }
                else -> {
                    findNavController().navigate(R.id.dataUserFragment)
                }
            }
        }
    }
}