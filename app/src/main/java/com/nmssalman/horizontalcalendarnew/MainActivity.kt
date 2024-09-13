package com.nmssalman.horizontalcalendarnew

import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nmssalman.horizontalcalendar.HorizontalCalendar
import com.nmssalman.horizontalcalendarnew.ui.theme.HorizontalCalendarNewTheme
import java.util.Calendar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)

        val cal1 = Calendar.getInstance()
        cal1.add(Calendar.MONTH, - 1)

        val cal2 = Calendar.getInstance()
        cal2.add(Calendar.MONTH, 1)

        val horizontalCalendar = HorizontalCalendar.Builder(this, R.id.calendarView)
            .range(cal1, cal2)
            .datesNumberOnScreen(5)
            .build()
    }
}
