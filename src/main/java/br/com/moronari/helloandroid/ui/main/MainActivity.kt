package br.com.moronari.helloandroid.ui.main
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.guizaia.helloandroid.R

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome= intent.getStringExtra("nome")
        val telefone= intent.getStringExtra("telefone")

        tvNome.text = getString(R.string.saudacao, nome)

    }

}
