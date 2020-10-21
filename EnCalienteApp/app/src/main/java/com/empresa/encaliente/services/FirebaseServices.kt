package com.empresa.encaliente.services

import android.content.Context
import android.util.Log
import com.empresa.encaliente.R
import com.empresa.encaliente.utils.Toolbox
import com.google.firebase.auth.FirebaseAuth

/**
 * Created by Norman Sánchez on 20/10/20.
 */
class FirebaseServices {

    private val firebaseAuth = FirebaseAuth.getInstance()

    fun loginWithFirebaseAuth(context: Context, mail: String?, password: String?) {
        firebaseAuth.signInWithEmailAndPassword(mail!!, password!!).addOnCompleteListener { task ->
            if (task.isSuccessful) {
//                val goHome = Intent(context, HomeActivity::class.java)
//                goHome.putExtra("email", task.result!!.user!!.email)
//                goHome.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//                context.startActivity(goHome)
            } else {
                Toolbox().createToast(context, context.resources.getString(R.string.error_login), false)
            }
        }
    }

    fun createUserWithFirebaseAuth(context: Context, mail: String?, password: String?) {
        firebaseAuth.createUserWithEmailAndPassword(mail!!, password!!)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toolbox().createToast(context, context.resources.getString(R.string.register_done), false)
//                    val goHome = Intent(context, HomeActivity::class.java)
//                    goHome.putExtra("email", task.result!!.user!!.email)
//                    goHome.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//                    context.startActivity(goHome)
                } else {
                    Toolbox().createToast(context, context.resources.getString(R.string.error_register), false)
                }
            }.addOnFailureListener { e ->
                Log.i("ERROR", e.message!!)
                Toolbox().createToast(context, e.message.toString(), false)
            }
    }

    fun closeSession() {
        firebaseAuth.signOut()
    }
}