package com.example.digitalproject

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.digitalproject.databinding.GpsDialogBinding

class GpsDialog(context : Context, DialogInterface: GpsDialogInterface) : Dialog(context) {

    private var gpsDialogInterface: GpsDialogInterface = DialogInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gps_dialog)

        var allOkButton : TextView = findViewById(R.id.gpsAccessAnswer1_tv)

        // 뒤로가기 버튼, 빈 화면 터치를 통해 dialog가 사라지지 않도록
        setCancelable(false)
        // 배경 투명하게 바꿔줌
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        allOkButton.setOnClickListener {
            dismiss()
        }

    }
}