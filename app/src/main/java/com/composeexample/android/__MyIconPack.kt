package com.composeexample.android

import androidx.compose.ui.graphics.vector.ImageVector
import com.composeexample.android.myiconpack.Alarm
import com.composeexample.android.myiconpack.ArrowDown
import com.composeexample.android.myiconpack.Car
import com.composeexample.android.myiconpack.Chat
import com.composeexample.android.myiconpack.CheckCircle
import com.composeexample.android.myiconpack.Clothes
import com.composeexample.android.myiconpack.ColorPalette
import com.composeexample.android.myiconpack.Compass
import com.composeexample.android.myiconpack.Cosmetic
import com.composeexample.android.myiconpack.Drugs
import com.composeexample.android.myiconpack.Image
import com.composeexample.android.myiconpack.Leaf
import com.composeexample.android.myiconpack.LetterT
import com.composeexample.android.myiconpack.ListSelect
import com.composeexample.android.myiconpack.Location
import com.composeexample.android.myiconpack.MapMarked
import com.composeexample.android.myiconpack.MapPoint
import com.composeexample.android.myiconpack.Moon
import com.composeexample.android.myiconpack.MySpectrum
import com.composeexample.android.myiconpack.NavigationPointer
import com.composeexample.android.myiconpack.PencilLine
import com.composeexample.android.myiconpack.PhonebookContacts
import com.composeexample.android.myiconpack.Point
import com.composeexample.android.myiconpack.Radioupnp
import com.composeexample.android.myiconpack.RedoLine
import com.composeexample.android.myiconpack.SnowLine
import com.composeexample.android.myiconpack.Sport
import com.composeexample.android.myiconpack.TShirt
import com.composeexample.android.myiconpack.Umbrella
import com.composeexample.android.myiconpack.UndoLine
import com.composeexample.android.myiconpack.Water
import com.composeexample.android.myiconpack.WeatherSunny
import com.composeexample.android.myiconpack.Wind
import com.composeexample.android.myiconpack.Wind2
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Alarm, ArrowDown, Car, Chat, CheckCircle, Clothes, ColorPalette, Compass,
        Cosmetic, Drugs, Image, Leaf, LetterT, ListSelect, Location, MapMarked, MapPoint, Moon,
        MySpectrum, NavigationPointer, PencilLine, PhonebookContacts, Point, Radioupnp, RedoLine,
        SnowLine, Sport, TShirt, Umbrella, UndoLine, Water, WeatherSunny, Wind, Wind2)
    return __AllIcons!!
  }
