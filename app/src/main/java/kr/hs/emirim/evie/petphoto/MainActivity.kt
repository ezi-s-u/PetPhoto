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
    lateinit var btnFisnish : Button
    lateinit var btnFirst : Button
    lateinit var imgv : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchStart = findViewById(R.id.switch_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        btnFisnish = findViewById(R.id.btn_done)
        btnFirst = findViewById(R.id.btn_first)
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

        btnFisnish.setOnClickListener(btnListener)
        btnFirst.setOnClickListener(btnListener)


    }
    var btnListener = View.OnClickListener {
        when (it.id) {
            R.id.btn_done -> finish()
            R.id.btn_first -> {
                linear.visibility = View.INVISIBLE
                switchStart.
            }
        }
    }
}