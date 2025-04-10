package com.composeexample.android.composechat

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.composeexample.android.MyIconPack
import com.composeexample.android.composechat.data.Chat
import com.composeexample.android.composechat.data.Msg
import com.composeexample.android.composechat.data.User
import com.composeexample.android.myiconpack.Chat

class WeViewModel: ViewModel() {
    var seletedTab by mutableIntStateOf(0)
    var chats by mutableStateOf(
        listOf(
            Chat(
                firend = User(
                    id = "gaolaoshi",
                    name = "高老师",
                    MyIconPack.Chat
                ),
                mutableStateListOf(
                    Msg(
                        User(
                            id = "gaolaoshi",
                            name = "高老师",
                            MyIconPack.Chat
                        ),
                        text = "锄禾日当午",
                        time = "14:20",
                    ),
                    Msg(
                        User.Me,
                        text = "汗滴禾下土",
                        time = "14:20"
                    ),
                    Msg(
                        User(
                            id = "gaolaoshi",
                            name = "高老师",
                            MyIconPack.Chat
                        ),
                        text = "谁知盘中餐",
                        time = "14:20"
                    ),
                    Msg(
                        User.Me,
                        text = "粒粒皆辛苦",
                        time = "14:20"
                    ),
                    Msg(
                        User(
                            id = "gaolaoshi",
                            name = "高老师",
                            MyIconPack.Chat
                        ),
                        text = "唧唧复唧唧，木兰当户织。不闻机杼声，惟闻女叹息。",
                        time = "14:20"
                    ),
                    Msg(
                        User.Me,
                        text = "双免傍地走，安能辨我是雄雌？",
                        time = "14:20"
                    ),
                    Msg(
                        User(
                            id = "gaolaoshi",
                            name = "高老师",
                            MyIconPack.Chat
                        ),
                        text = "床前明月光，疑是地上霜。",
                        time = "14:20"
                    ),
                    Msg(
                        User.Me,
                        text = "吃饭吧？",
                        time = "14:20"
                    )
                )
            ),
            Chat(
                firend = User(
                    id = "gaolaoshi",
                    name = "高老师",
                    MyIconPack.Chat
                ),
                mutableStateListOf(
                    Msg(
                        User(
                            id = "gaolaoshi",
                            name = "高老师",
                            MyIconPack.Chat
                        ),
                        text = "锄禾日当午",
                        time = "14:20"
                    ),
                    Msg(
                        User.Me,
                        text = "汗滴禾下土",
                        time = "14:20"
                    ),
                    Msg(
                        User(
                            id = "gaolaoshi",
                            name = "高老师",
                            MyIconPack.Chat
                        ),
                        text = "谁知盘中餐",
                        time = "14:20"
                    ),
                    Msg(
                        User.Me,
                        text = "粒粒皆辛苦",
                        time = "14:20"
                    ),
                    Msg(
                        User(
                            id = "gaolaoshi",
                            name = "高老师",
                            MyIconPack.Chat
                        ),
                        text = "唧唧复唧唧，木兰当户织。不闻机杼声，惟闻女叹息。",
                        time = "14:20"
                    ),
                    Msg(
                        User.Me,
                        text = "双免傍地走，安能辨我是雄雌？",
                        time = "14:20"
                    ),
                    Msg(
                        User(
                            id = "gaolaoshi",
                            name = "高老师",
                            MyIconPack.Chat
                        ),
                        text = "床前明月光，疑是地上霜。",
                        time = "14:20"
                    ),

                )
            )

        )
    )
    var currentChat : Chat? by mutableStateOf(null)
    var chatting by mutableStateOf(false)

    fun startChat(
        viewModel: WeViewModel,
        chat: Chat
    ) {
        viewModel.chatting = true
        viewModel.currentChat = chat
    }
}