package com.composeexample.android.compose_component_rendering_process

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.LayoutScopeMarker
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.layout
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.composeexample.android.ui.theme.ComposeExampleTheme

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.firstBaselineToTop(
    firstBaseLineToTop:Dp
) = Modifier.layout{ measurable, constraints ->// 调用 layout 方法去测量和放置子元素组件
    val placeable=measurable.measure(constraints)
    check(placeable[FirstBaseline]!=AlignmentLine.Unspecified)
    val firstBaseline=placeable[FirstBaseline]//
    val plceableY=firstBaseLineToTop.roundToPx()-firstBaseline
    val height=placeable.height+plceableY
    layout(placeable.width,height){
        placeable.placeRelative(0,plceableY)
    }
}

@Preview
@Composable
fun Text_(){
    ComposeExampleTheme{
        Text("Noser",Modifier.firstBaselineToTop(24.dp))
    }
}
@Preview
@Composable
fun Text_2(){
    ComposeExampleTheme{
        Text("Noser",Modifier.padding(top = 24.dp))
    }
}