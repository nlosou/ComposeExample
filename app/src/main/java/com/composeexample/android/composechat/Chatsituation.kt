package com.composeexample.android.composechat

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.IntOffset
import androidx.lifecycle.ViewModel

@Composable
fun ChatSituation(viewModel: WeViewModel){

    val offsetX by animateFloatAsState( if(viewModel.chatting) 0f else 1f, label = "")
    Box(
        Modifier
            .offsetPercent(offsetX)
            .background(Color.Blue)
            .fillMaxSize()
    ){

    }
}

fun Modifier.offsetPercent(offsetx:Float=0f,offsety : Float=0f)=
    this.layout{
               measurable, constraints ->
        val placeable=measurable.measure(constraints)
        val offsetx=offsetx*placeable.width
        val offsety=offsety*placeable.height
        layout(placeable.width,placeable.height){
            placeable.placeRelative(offsetx.toInt(),offsety.toInt())
        }
    }