package kr.hs.emirim.evie.petphoto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    lateinit var switchStart: Switch
    lateinit var rg : RadioGroup
    lateinit var linear : LinearLayout
    lateinit var btnDone : Button
    lateinit var btnFist : Button
    lateinit var imgv : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchStart = findViewById(R.id.switch_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        btnDone = findViewById(R.id.btn_done)
        btnFist = findViewById(R.id.btn_first)
        imgv = findViewById(R.id.imgv)
        linear.visibility = View.INVISIBLE

        switchStart.setOnCheckedChangeListener { compoundbutton, b ->
            if(switchStart.isChecked) {
                linear.visibility = View.VISIBLE
            } else {
                linear.visibility = View.INVISIBLE
            }
        }

        rg.setOnCheckedChangeListener { compoundbutton, b ->
            when(rg.checkedRadioButtonId){
                R.id.radio_dog -> imgv.setImageResource(R.drawable.dog) // img 변경할 때 사용하는 메서드
                R.id.radio_cat -> imgv.setImageResource(R.drawable.cat)
                R.id.radio_rabbit -> imgv.setImageResource(R.drawable.rabbit)
            }
        }

    }
}