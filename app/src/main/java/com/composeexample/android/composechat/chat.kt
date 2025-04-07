package com.composeexample.android.composechat

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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

class chat : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExampleTheme {
                Column {
                    //WeBottomBar()
                }
            }
        }
    }




}

//如果某个见面是动态的就要抽出，
@Composable
private fun WeBottomBar(select:Int) {
    Row(Modifier.fillMaxWidth()) {
        TabItem(if(select==0) MyIconPack.Chat else MyIconPack.Chat, "聊天",Modifier.weight(1f),if (select==0) Color.Green else Color.Black)
        TabItem(if(select==1) MyIconPack.PhonebookContacts else MyIconPack.PhonebookContacts, "通讯录",Modifier.weight(1f),if (select==1) Color.Green else Color.Black)
        TabItem(if(select==2) MyIconPack.Compass else MyIconPack.Compass, "发现",Modifier.weight(1f),if (select==2) Color.Green else Color.Black)
        TabItem(if(select==3) MyIconPack.MySpectrum else MyIconPack.MySpectrum, "我的",Modifier.weight(1f),if (select==3) Color.Green else Color.Black)
    }
}
//独立的函数才可以加状态
@Composable
private fun TabItem( icon:ImageVector,title:String,modifier: Modifier,tint:Color) {
    Column(Modifier.padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Icon(imageVector = icon, contentDescription = title,Modifier.size(24.dp),tint=tint)
        Text(title, fontSize = 11.sp, color =tint)
    }
}

@Preview(showBackground = true)
@Composable
private fun WeBotton() {
    WeBottomBar(0)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    ComposeExampleTheme {
        //TabItem(MyIconPack.Chat,"聊天",Modifier.weight(1f))
    }
}