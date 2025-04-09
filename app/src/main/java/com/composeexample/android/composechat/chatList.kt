package com.composeexample.android.composechat

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composeexample.android.composechat.data.Chat

@Composable
fun chatList(chats:List<Chat>) {
    LazyColumn {
        items(chats){
            chat->
            Icon(chat.firend.avatar,chat.firend.name,Modifier.size(48.dp).clip(RoundedCornerShape(4.dp)))
        }
    }
}


@Preview
@Composable
fun djjdjd(){
}