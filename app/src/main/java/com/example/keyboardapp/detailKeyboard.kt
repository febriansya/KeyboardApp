package com.example.keyboardapp

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class detailKeyboard : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_keyboard)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Keyboard"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val cari: Button = findViewById(R.id.cari_barang)
        cari.setOnClickListener{
            var gourl="https://www.tokopedia.com/"
            val find = Intent(Intent.ACTION_VIEW)
            find.data = Uri.parse(gourl)
            startActivity(find)
        }

        val tvjudul:TextView = findViewById(R.id.judul)
        val tvdetail:TextView = findViewById(R.id.detail)
        val imgk:ImageView = findViewById(R.id.imgbismillah)
        val price:TextView = findViewById(R.id.harga)
        val brt:TextView = findViewById(R.id.berat)
        val ftr:TextView = findViewById(R.id.fitur)
        val tpe:TextView = findViewById(R.id.tipe_switch)
        val tky:TextView = findViewById(R.id.tipe_keyboard)

        val tjudul = intent.getStringExtra(EXTRA_JUDUL)
        val tdetail = intent.getStringExtra(EXTRA_DETAIL)
        val timage = intent.getIntExtra(EXTRA_IMAGE,0)
        val tharga = intent.getStringExtra(EXTRA_PRICE)
        val tberat = intent.getStringExtra(EXTRA_BERAT)
        val tfitur = intent.getStringExtra(EXTRA_FITUR)
        val tswitch = intent.getStringExtra(EXTRA_SWITCH)
        val tkeyboard = intent.getStringExtra(EXTRA_KEYBOARD)

        Glide.with(this)
                .load(timage)
                .apply(RequestOptions().override(300,300))
                .into(imgk)


        tvjudul.text = tjudul
        tvdetail.text = tdetail
        price.text = tharga
        brt.text = tberat
        ftr.text =  tfitur
        tpe.text = tswitch
        tky.text = tkeyboard


    }
    companion object{
        const val EXTRA_JUDUL = "extra_judul"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_BERAT = "extra_berat"
        const val EXTRA_FITUR = "extra_fitur"
        const val EXTRA_SWITCH = "extra_switch"
        const val EXTRA_KEYBOARD = "extra_keyboard"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}