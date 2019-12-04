package com.example.todoapp.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.todoapp.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {2

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

        button_add.setOnClickListener {

            val action= HomeFragmentDirections.actionAddNote()
            Navigation.findNavController(it).navigate(action)



        }

    }


}
