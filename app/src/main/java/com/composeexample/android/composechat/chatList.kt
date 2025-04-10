package com.composeexample.android.composechat

import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composeexample.android.composechat.data.Chat

@Composable
fun chatList(chats:List<Chat>,viewModel: WeViewModel) {
    Box(Modifier.background(Color(0xFFE8EBEA)).fillMaxSize()){
        LazyColumn(Modifier.background(Color(0xFFFFFFFFF))) {
            itemsIndexed(chats){
                    index,chat->
                chatListItem(chat,viewModel)
                if(index<chats.lastIndex){
                    HorizontalDivider()
                }
            }
        }
    }
}

@Composable
private fun chatListItem(chat: Chat,viewModel: WeViewModel) {
    Row(Modifier.fillMaxWidth()
        .clickable {
            viewModel.startChat( chat)
        }
    ) {
        Icon(
            chat.firend.avatar, chat.firend.name,
            Modifier
                .padding(4.dp)
                .size(48.dp)
                .unRead(!chat.msgs.last().read)
                .clip(
                    RoundedCornerShape(4.dp)
                )
        )
        Column(
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)) {
            Text(chat.firend.name, fontSize = 17.sp)
            Text(chat.msgs.last().text, fontSize = 14.sp)
        }
        Text(
            chat.msgs.last().time,
            Modifier.padding(8.dp, 8.dp, 12.dp, 8.dp),
            fontSize = 11.sp
        )
    }
}

fun Modifier.unRead(show:Boolean):Modifier=this.drawWithContent{
    drawContent()
    if(show){
        drawCircle(Color.Red,5.dp.toPx(), Offset(size.width-1.dp.toPx(),1.dp.toPx()))
    }

}
@Preview
@Composable
fun djjdjd(){
}