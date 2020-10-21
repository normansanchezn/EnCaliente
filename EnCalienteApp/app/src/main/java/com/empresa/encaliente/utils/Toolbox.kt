package com.empresa.encaliente.utils

import android.content.Context
import android.widget.Toast

/**
 * Created by Norman Sánchez on 18/10/20.
 */
class Toolbox {

    fun createToast(context:Context, txt: String, isDuration:Boolean){
        if (isDuration) {
            Toast.makeText(context, txt, Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, txt, Toast.LENGTH_SHORT).show()
        }
    }

}