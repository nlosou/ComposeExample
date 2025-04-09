package com.composeexample.android.composechat

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WeViewModel: ViewModel() {
    var seletedTab by mutableIntStateOf(0)
}