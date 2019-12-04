package com.example.todoapp.ui


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.todoapp.R
import com.example.todoapp.db.Note
import com.example.todoapp.db.NoteDatabase
import kotlinx.android.synthetic.main.fragment_add_node.*

/**
 * A simple [Fragment] subclass.
 */
class addNodeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_node, container, false)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        floatingActionButton.setOnClickListener {

            val noteTitle = et_title.text.toString().trim()
            val noteBody = et_note.text.toString().trim()

            if(noteTitle.isEmpty()){
                et_title.error="title required"
                et_title.requestFocus()
                return@setOnClickListener
            }

            if(noteBody.isEmpty()){
                et_note.error="body required"
                et_note.requestFocus()
                return@setOnClickListener
            }


            val note=Note(noteTitle,noteBody)

            //inserting the title,body in the database
            NoteDatabase(activity!!).getNoteDao().addNote(note)
        }
    }




}
