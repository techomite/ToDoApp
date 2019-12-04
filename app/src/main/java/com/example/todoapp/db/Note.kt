package com.example.todoapp.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title:String,
    val note:String
){
    @PrimaryKey
    var id:Int=0
}