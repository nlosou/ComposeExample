package com.composeexample.android.composechat.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class Chat (var firend:User,var msgs:MutableList<Msg>){

}

class Msg(val from:User,val text:String,val time:String){
    var read:Boolean by mutableStateOf(true)
}