package com.example.myapplication

import android.graphics.Color
import android.graphics.Color.GREEN
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular:Button = bt_calcular
        val resultado: TextView = resultado

        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(falta.text.toString())
            val nota2 = Integer.parseInt(Nota2.text.toString())
            val media = (nota1 + nota2)/ 2
            val faltas = Integer.parseInt(falta.text.toString())

            if(media >= 6 && faltas <= 10 ){
                resultado.setText("Aluno foi Aprovado "+"\n"+ "Nota Final: "+ media + "\n"+"faltas"+nota1)
                resultado.setTextColor(Color.GREEN)

            }else{
                resultado.setText("Aluno foi Reprovado "+"\n"+ "Nota Final: "+ media + "\n"+"faltas"+nota1)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}