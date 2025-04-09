package com.composeexample.android.composechat

import android.graphics.Color.rgb
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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



object theme{

}
class chat : ComponentActivity() {

    @OptIn(ExperimentalFoundationApi::class)

    val viewModel : WeViewModel by viewModels()
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExampleTheme {
                val pagerState = rememberPagerState(0){4}
                Column {
                    HorizontalPager(pagerState) {
                        page->
                        when(page){
                            0-> chatList()
                            1->Box(Modifier.fillMaxSize()){}
                            2->Box(Modifier.fillMaxSize()){}
                            3->Box(Modifier.fillMaxSize()){}
                        }
                    }
                    WeBottomBar(viewModel.seletedTab){
                        viewModel.seletedTab=it
                    }
                }
            }
        }
    }


}

