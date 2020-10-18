package com.empresa.encaliente.ui.register.childfragments.phonenumber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.empresa.encaliente.R
import kotlinx.android.synthetic.main.fragment_phone_numer.*

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class PhoneNumerFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_phone_numer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        fabGoCodeConfirm.setOnClickListener {
            findNavController().navigate(R.id.codeConfirmFragment)
        }
    }
}