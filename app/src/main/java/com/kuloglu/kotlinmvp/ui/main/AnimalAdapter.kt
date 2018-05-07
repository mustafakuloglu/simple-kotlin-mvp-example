package com.kuloglu.kotlinmvp.ui.main

import android.support.v7.widget.RecyclerView
import android.view.View
import com.kuloglu.kotlinmvp.R
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import com.kuloglu.kotlinmvp.model.Data
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_anime.view.*


class AnimalAdapter : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    private val mData = mutableListOf<Data>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_anime, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dog = mData[position]
    Picasso.get().load(dog.url).resize(120,120).centerCrop().into(holder.image)
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    class ViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var image: ImageView = itemView.image

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View) {

        }
    }

    internal fun getItem(id: Int): Data {
        return mData[id]
    }

    fun setList(list: List<Data>) {
        mData.clear()
        mData.addAll(list)
        notifyDataSetChanged()
    }


}
