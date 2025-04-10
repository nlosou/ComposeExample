package com.composeexample.android.composechat

import androidx.activity.viewModels
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composeexample.android.MyIconPack
import com.composeexample.android.composechat.ui.theme.ComposeExampleTheme
import com.composeexample.android.myiconpack.Chat
import com.composeexample.android.myiconpack.Compass
import com.composeexample.android.myiconpack.MySpectrum
import com.composeexample.android.myiconpack.PhonebookContacts
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.layout.onSizeChanged

//如果某个界面是动态的就要抽出，
@Composable
 fun WeBottomBar(select:Int,onSelectChanged:(Int)->Unit) {
    Row(modifier = Modifier.fillMaxWidth()) {

        TabItem(if(select==0) MyIconPack.Chat else MyIconPack.Chat, "聊天",
            Modifier.weight(1f).clickable {
                onSelectChanged(0)
            },if (select==0) Color(0xFF00BB4D) else Color.Black)
        TabItem(if(select==1) MyIconPack.PhonebookContacts else MyIconPack.PhonebookContacts, "通讯录",
            Modifier.weight(1f).clickable {
                onSelectChanged(1)
            },if (select==1) Color(0xFF00BB4D) else Color.Black)
        TabItem(if(select==2) MyIconPack.Compass else MyIconPack.Compass, "发现",
            Modifier.weight(1f).clickable {
                onSelectChanged(2)
            },if (select==2) Color(0xFF00BB4D) else Color.Black)
        TabItem(if(select==3) MyIconPack.MySpectrum else MyIconPack.MySpectrum, "我的",
            Modifier.weight(1f).clickable {
                onSelectChanged(3)
            },if (select==3) Color(0xFF00BB4D) else Color.Black)
    }
}
//独立的函数才可以加状态
@Composable
 fun TabItem(icon: ImageVector, title:String, modifier: Modifier, tint: Color) {
    Column(modifier.padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Icon(imageVector = icon, contentDescription = title, Modifier.unRead(true).size(24.dp),tint=tint)
        Text(title, fontSize = 11.sp, color =tint)
    }
}

@Preview(showBackground = true)
@Composable
fun WeBotton() {
    var selectedTab by remember { mutableStateOf(0) }
    ComposeExampleTheme (){
        WeBottomBar(selectedTab){
            selectedTab=it
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    ComposeExampleTheme {
        TabItem(MyIconPack.Chat,"聊天", Modifier, tint = MaterialTheme.colorScheme.error)
    }
}