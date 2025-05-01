package com.composeexample.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composeexample.android.ui.theme.ComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var nums by mutableStateOf(mutableListOf(1,2,3))
        var nums2= mutableStateListOf(1,2,3)
        var flag by mutableStateOf(1)
        enableEdgeToEdge()
        setContent {
            ComposeExampleTheme {
                Column (Modifier.padding(100.dp)){
                    Text(flag.toString(),Modifier.clickable {
                        //赋值才能触发setValue
                        flag++
                    })
                    Button(
                        onClick = {

                            nums2.add(nums2.last()+1)

                        }
                    ) {
                        Text("加一")
                    }
                    nums2.forEach {
                        Text(it.toString())
                    }
                }
            }
        }
    }
}

