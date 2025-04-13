package com.composeexample.android.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.composeexample.android.example.ui.theme.ComposeExampleTheme

class layoutSlide : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    var offsetx by remember { mutableStateOf(0.dp) }
    var offsety by remember { mutableStateOf(0.dp) }
    val animatedOffsetx by animateDpAsState(targetValue = offsetx,)
    val animatedOffsety by animateDpAsState(targetValue = offsety)


    Box(
        modifier = Modifier.fillMaxSize().pointerInput(Unit){
            detectDragGestures { change, dragAmount ->
                change.consume()
                offsety+=dragAmount.y.toDp()
                offsetx+=dragAmount.x.toDp()
            }
        }.offset { IntOffset(animatedOffsetx.roundToPx(), animatedOffsety.roundToPx()) }
    ) {
        Button(onClick = {

        }) { Text("滑动") }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ComposeExampleTheme {
        Greeting2("Android")
    }
}