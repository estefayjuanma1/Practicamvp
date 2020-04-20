package com.example.practicamvp.view

import Offer
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practicamvp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cupon_list_item.view.*

class Adapter(cuponList: ArrayList<Offer>) :
    RecyclerView.Adapter<Adapter.CuponesViewHolder>(){

    private var cuponList = ArrayList<Offer>()

    init {
        this.cuponList = cuponList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CuponesViewHolder {
     var itemView =
         LayoutInflater.from(parent.context).inflate(R.layout.cupon_list_item,parent,false)
        return CuponesViewHolder(itemView)
    }

    override fun getItemCount(): Int = cuponList.size



    override fun onBindViewHolder(holder: CuponesViewHolder, position: Int) {
        val cupon = cuponList[position]
        holder.setCupon(cupon)
    }

    class CuponesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView),
            View.OnClickListener{

        private var cupon : Offer? = null

        init {
            itemView.setOnClickListener(this)
        }

        fun setCupon(cupon: Offer){
            this.cupon = cupon
            itemView.tv_titulo.text = cupon.title
            itemView.tv_status.text = cupon.status
            itemView.tv_codigo.text = cupon.code
            if(!cupon.imageUrl.isNullOrEmpty()) {
                Picasso.get().load(cupon.imageUrl).into(itemView.iv_picture)
            }
        }

        override fun onClick(v: View?) {
            val intent = Intent(itemView.context, DescripcionActivity::class.java)
            intent.putExtra("Cupon",cupon)
            itemView.context.startActivity(intent)
        }

    }


}