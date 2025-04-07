package com.composeexample.android.compose_component_rendering_process

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.LayoutScopeMarker
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.IntrinsicMeasurable
import androidx.compose.ui.layout.IntrinsicMeasureScope
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layout
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.composeexample.android.example.layoutSlide
import com.composeexample.android.ui.theme.ComposeExampleTheme



/*

对比一下 Compose 中的自定义 Layout
的两种方式，一种是针对某个组件进行的功能扩展，类似于
 View 体系中对某个已有的 View 或直接继承 View 进行的自定义
 ，它其实是自定义一个 Modifier 方法；另一种是针对某个容器组件的
 自定义，类似于 View 体系中对某个已有的 ViewGroup 或直接继承 View
 Group 进行自定义，它其实就是一个 Layout 组件，是布局的主要核心组件。接下
 来让我们看看更加复杂的自定义 Layout。
 */


//自定义Modifier方法
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


//自定义组件
@Composable
fun MyOwnColumn(
    modifier: Modifier,
    content:@Composable  () ->Unit
){
    Layout(
        modifier = modifier,
        content = content
    ){ measurables, constraints ->
        // 对 children 进行测量和放置
        val placeables = measurables.map { measurable ->
            // 测量每个 child 的尺寸
            measurable.measure(constraints)
        }
        var yPosition = 0  // 记录下一个元素竖直方向上的位置
        var xPosition= 0
        layout(constraints.maxWidth, constraints.maxHeight) {
            // 摆放 children
            placeables.forEach { placeable ->
                placeable.placeRelative(xPosition, yPosition)
                //yPosition += placeable.height
                xPosition +=placeable.width

            }
        }
    }
}

@Composable
fun IntrinsicRow(
    modifier: Modifier,
    content: @Composable ()-> Unit
){
    Layout(
        content=content,
        modifier=Modifier,
        measurePolicy = object : MeasurePolicy {
            override fun MeasureScope.measure(
                measurables: List<Measurable>,
                constraints: Constraints
            ): MeasureResult {
                TODO("Not yet implemented")
            }

            override fun IntrinsicMeasureScope.minIntrinsicHeight(
                measurables: List<IntrinsicMeasurable>,
                width: Int
            ): Int {
                var maxHeight=0
                measurables.forEach {
                    maxHeight=it.minIntrinsicHeight(width).coerceAtLeast(maxHeight)
                }

                return maxHeight
            }
        }
    )
}



@Preview
@Composable
fun Text_(){
    ComposeExampleTheme{
        IntrinsicRow(modifier = Modifier.fillMaxSize().height(IntrinsicSize.Min))
        {
            Text(text = "left")


        }
    }
}
@Preview
@Composable
fun Text_2(){
    ComposeExampleTheme{
        Text("Noser",Modifier.padding(top = 24.dp))
    }
}
@Preview
@Composable
fun Text_23(){
    ComposeExampleTheme{
        MyOwnColumn(Modifier){
            Text("282882")
            Text("282882")
            Text("282882")
        }

    }
}



