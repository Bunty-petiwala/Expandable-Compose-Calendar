package com.mabn.calendarlibrary.core

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape

data class CalendarTheme(
    val backgroundColor: Color,
    val headerBackgroundColor: Color,
    val dayBackgroundColor: Color,
    val selectedDayBackgroundColor: Color,
    val dayValueTextColor: Color,
    val selectedDayValueTextColor: Color,
    val headerTextColor: Color,
    val weekDaysTextColor: Color,
    val selectedWeekDaysTextColor: Color,
    val dayShape: Shape
)

val appGradientStart = Color(0xFF2096F3)


@get:Composable
val Colors.textColor: Color get() = if (isLight) Color.Black else Color.White

val calendarDefaultTheme: CalendarTheme
    @Composable
    @ReadOnlyComposable
    get() = CalendarTheme(
        backgroundColor = Color.Transparent,
        headerBackgroundColor = Color.Transparent,
        dayBackgroundColor = Color.Transparent,
        selectedDayBackgroundColor = MaterialTheme.colors.primary,
        dayValueTextColor = MaterialTheme.colors.onBackground,
        selectedDayValueTextColor = MaterialTheme.colors.onBackground,
        headerTextColor = MaterialTheme.colors.onBackground,
        weekDaysTextColor = MaterialTheme.colors.onBackground,
        selectedWeekDaysTextColor = MaterialTheme.colors.primary,
        dayShape = RectangleShape

    )