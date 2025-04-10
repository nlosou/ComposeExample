package com.composeexample.android.composechat

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun Home(viewModel: WeViewModel) {
    val pagerState = rememberPagerState(0) { 4 }
    Column() { // 添加 padding
        HorizontalPager(pagerState, Modifier.weight(1f)) { page ->
            when (page) {
                0 -> chatList(viewModel.chats)
                1 -> Box(Modifier.fillMaxSize()) {}
                2 -> Box(Modifier.fillMaxSize()) {}
                3 -> Box(Modifier.fillMaxSize()) {}
            }
        }
        WeBottomBar(viewModel.seletedTab) {
            viewModel.seletedTab = it
        }
    }
}