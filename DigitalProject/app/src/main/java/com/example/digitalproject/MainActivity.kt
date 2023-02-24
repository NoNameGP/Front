package com.example.digitalproject

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity(), GpsDialogInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var naviButton: LinearLayout = findViewById(R.id.navigation_lo)
        var setButton: LinearLayout = findViewById(R.id.setting_lo)

        naviButton.setOnClickListener {
            val gpsDialog = GpsDialog(this, this)
            gpsDialog.show()
        }

        setButton.setOnClickListener {
            //startActivity(Intent(this, GpsDialog::class.java))
        }
    }

    override fun onAllOkBtnClicked() {

    }

}