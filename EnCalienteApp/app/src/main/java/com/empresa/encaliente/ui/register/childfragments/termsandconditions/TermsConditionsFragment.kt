package com.empresa.encaliente.ui.register.childfragments.termsandconditions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.empresa.encaliente.R
import com.empresa.encaliente.utils.Toolbox
import kotlinx.android.synthetic.main.fragment_terms_conditions.*

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class TermsConditionsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_terms_conditions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fabConfirmTermsAndCondition.setOnClickListener {
            if (cbTermsConditions.isChecked){
                // We can follow with the next screen
                Toolbox().createToast(requireContext(), "Sí podemos avanzar", false)
            } else {
                Toolbox().createToast(requireContext(), resources.getString(R.string.error_validate_terms_and_conditions), true)
            }
        }
    }
}