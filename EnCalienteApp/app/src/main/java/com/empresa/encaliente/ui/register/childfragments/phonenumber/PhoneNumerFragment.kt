package com.empresa.encaliente.ui.register.childfragments.phonenumber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.empresa.encaliente.R
import kotlinx.android.synthetic.main.fragment_phone_numer.*

class PhoneNumerFragment : Fragment() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_phone_numer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)

        fabGoCodeConfirm.setOnClickListener {
            navController.navigate(R.id.codeConfirmFragment)
        }
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            PhoneNumerFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}