package com.example.turismo


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_acercade.*
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
            val args2 = fragmento2Args.fromBundle(it)
            val args3 = fragmento2Args.fromBundle(it)

            args.titulolugar
            args2.lemalugar
            args3.infolugar
            root!!.titleplace.text =args.titulolugar
            root!!.lema.text =args2.lemalugar
            root!!.info.text =args2.infolugar

        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        comentar.setOnClickListener{
            comentar.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmento2_to_comentariofragment))
            val action = fragmento2Directions.actionFragmento2ToComentariofragment().setComentariohecho(comentariofinal.text.toString())
            findNavController().navigate(action)
        }



    }

}
