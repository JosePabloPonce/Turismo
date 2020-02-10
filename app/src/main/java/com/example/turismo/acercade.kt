package com.example.turismo


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_acercade.*

/**
 * A simple [Fragment] subclass.
 */
class acercade : Fragment() {
    private var root: View? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        root = inflater.inflate(R.layout.fragment_acercade, container,false)
        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        avatarmio.setImageResource(R.drawable.miavatar)
    }

}
