package com.composeexample.android.composechat.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.composeexample.android.MyIconPack
import com.composeexample.android.myiconpack.Sport

class User(
    val id: String,
    val name: String,
     val avatar: ImageVector
) {
    companion object{
        val Me:User=User("383883","838383",MyIconPack.Sport)
    }
}