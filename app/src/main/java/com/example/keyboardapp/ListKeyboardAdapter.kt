package com.example.keyboardapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListKeyboardAdapter(private val listKeyboard:ArrayList<Keyboard>) : RecyclerView.Adapter<ListKeyboardAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName:TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail:TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgGambar:ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup,i: Int): ListViewHolder {
            val view:View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_keyboard,viewGroup,false)
            return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        val keyboard = listKeyboard[position]
        val(judul,detail,img,harga,berat,fitur,tswitch,tkeyboard)  = listKeyboard[position]


        Glide.with(holder.itemView.context)
                .load(img)
                .apply(RequestOptions().override(55,55))
                .into(holder.imgGambar)
        holder.tvName.text = judul
        holder.tvDetail.text = detail



        val kcontext = holder.itemView.context

        holder.itemView.setOnClickListener{

            val kdetail = Intent(kcontext,detailKeyboard::class.java)

            kdetail.putExtra(detailKeyboard.EXTRA_DETAIL,detail)
            kdetail.putExtra(detailKeyboard.EXTRA_JUDUL,judul)
            kdetail.putExtra(detailKeyboard.EXTRA_IMAGE,img)
            kdetail.putExtra(detailKeyboard.EXTRA_PRICE,harga)
            kdetail.putExtra(detailKeyboard.EXTRA_BERAT,berat)
            kdetail.putExtra(detailKeyboard.EXTRA_FITUR,fitur)
            kdetail.putExtra(detailKeyboard.EXTRA_SWITCH,tswitch)
            kdetail.putExtra(detailKeyboard.EXTRA_KEYBOARD,tkeyboard)
            kcontext.startActivity(kdetail)
        }
    }

    override fun getItemCount(): Int {
            return listKeyboard.size
    }
}
