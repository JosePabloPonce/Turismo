package com.example.turismo


import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_comentariofragment.*
import kotlinx.android.synthetic.main.fragment_comentariofragment.view.*
import kotlinx.android.synthetic.main.fragment_fragmento2.view.*

/**
 * A simple [Fragment] subclass.
 */
class comentariofragment : Fragment() {

    private var root: View? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        root = inflater.inflate(R.layout.fragment_comentariofragment, container,false)
        // Inflate the layout for this fragment
        arguments?.let {

            val args = comentariofragmentArgs.fromBundle(it)

            args.comentariohecho

            root!!.textviewcomentario.text =args.comentariohecho

        }

        return root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.opciones2, menu)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.comentario) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, textviewcomentario.text)
                type = "text/plain"
            }
            startActivity(sendIntent)
            // Toast.makeText(activity, "sort", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
