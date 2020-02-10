package com.example.turismo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fragmento1.*

/**
 * A simple [Fragment] subclass.
 */
class Fragmento1 : Fragment() {

    var estado = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val action = Fragmento1Directions.actionFragmento1ToFragmento2()
        findNavController().navigate(action)
        return inflater.inflate(R.layout.fragment_fragmento1, container, false)
    }



    //cambiar de fragmento
    override fun onViewCreated (view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)




        tikal.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmento1_to_fragmento2))
        semuc.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmento1_to_fragmento2))
        atitlan.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmento1_to_fragmento2))

        estrella.setOnClickListener{

            if(estado == true){

                mostrar.setVisibility(View.INVISIBLE)
                nombre.setVisibility(View.VISIBLE)
                titulo.setVisibility(View.VISIBLE)
                estado =false
            }

            else{

                nombre.setVisibility(View.INVISIBLE)
                titulo.setVisibility(View.INVISIBLE)
                mostrar.setText(nombre.text)
                mostrar.setVisibility(View.VISIBLE)
                estado = true

            }
        }



    }













}
