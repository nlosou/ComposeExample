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
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composeexample.android.MyIconPack
import com.composeexample.android.composechat.ui.theme.ComposeExampleTheme
import com.composeexample.android.myiconpack.Chat
import com.composeexample.android.myiconpack.ColorPalette
import com.composeexample.android.myiconpack.Compass
import com.composeexample.android.myiconpack.MySpectrum
import com.composeexample.android.myiconpack.PhonebookContacts

class chat : ComponentActivity() {

    private val viewModel : WeViewModel by viewModels()
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExampleTheme {
                // 使用 Scaffold
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("消息") },
                            actions = {
                                IconButton(
                                    onClick = {
                                    }
                                ) {
                                    Icon(MyIconPack.ColorPalette,"")
                                }
                            }
                        )
                    },
                    content = { padding ->
                        Box(Modifier.padding(padding)){
                            Home(viewModel)
                            ChatSituation(viewModel)
                        }
                    }
                )
            }
        }
    }

    @Deprecated("This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    override fun onBackPressed() {
        if(!viewModel.endChat()){
            super.onBackPressed()
        }
    }
}


