package com.empresa.encaliente.ui.register.childfragments.datauser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.empresa.encaliente.R
import kotlinx.android.synthetic.main.fragment_data_user.*

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class DataUserFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_data_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fabConfirmUserData.setOnClickListener {
            findNavController().navigate(R.id.termsConditionsFragment)
        }
    }
}