package com.example.turismo


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fragmento2.*
import kotlinx.android.synthetic.main.fragment_fragmento2.view.*

/**
 * A simple [Fragment] subclass.
 */
class fragmento2 : Fragment() {

    private var root: View? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        root = inflater.inflate(R.layout.fragment_fragmento2, container,false)
        // Inflate the layout for this fragment
       // root!!.lema.text="hola"

        arguments?.let {

            val args = fragmento2Args.fromBundle(it)
            args.titulolugar
            root!!.titleplace.text =args.titulolugar
        }


        return root
    }



}
