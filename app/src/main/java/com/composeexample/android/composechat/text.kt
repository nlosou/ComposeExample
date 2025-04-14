package com.composeexample.android.composechat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.composeexample.android.composechat.ui.theme.ComposeExampleTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class text : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        var name by mutableStateOf(0)
        //MutableState->StateObject->StateRecord->Compose支持事务功能
        setContent {
            ComposeExampleTheme {
                Column {
                    Text(name.toString())
                    Button(onClick = {
                        name++
                    }) {
                            Text("加一")
                    }
                }

            }
        }

    }
}