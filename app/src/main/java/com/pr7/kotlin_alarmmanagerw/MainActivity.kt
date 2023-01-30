package com.pr7.kotlin_alarmmanagerw

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var numberPicker: NumberPicker
    lateinit var numberPicker2: NumberPicker
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberPicker=findViewById(R.id.numberpicker)
        numberPicker2=findViewById(R.id.numberpicker2)
        textView=findViewById(R.id.textview1)

        val cats = arrayOf("Барсик", "Мурзик", "Рыжик", "Васька", "Пушок", "Снежок")



        numberPicker.wrapSelectorWheel=false
        numberPicker.minValue=0
        numberPicker.maxValue=cats.size-1
        numberPicker.displayedValues=cats


        numberPicker2.maxValue=59
        numberPicker.descendantFocusability = NumberPicker.FOCUS_BLOCK_DESCENDANTS // блокируем появление клавиатуры


        numberPicker.setOnValueChangedListener { _, _, newVal ->
            textView.text = "Выбранное значение: ${cats[newVal]}"
        }


    }
}