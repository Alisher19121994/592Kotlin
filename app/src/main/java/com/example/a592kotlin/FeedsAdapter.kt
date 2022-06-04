package com.example.a592kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class FeedsAdapter(var context: Context, var list: ArrayList<Feeds>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.feeds_post, parent, false)
        return FeedsVeiw(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feeds = list[position]
        if (holder is FeedsVeiw) {
            holder.pro.setImageResource(feeds.profile_id)
            holder.changePro.setImageResource(feeds.changeable_profile_id)
            holder.fullname.text = feeds.fullname_id
            holder.date.text = feeds.date_of_update_id
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class FeedsVeiw(item: View) : RecyclerView.ViewHolder(item) {
        var pro: ShapeableImageView = item.findViewById(R.id.profile_id)
        var changePro: ShapeableImageView = item.findViewById(R.id.changeable_profile_id)
        var fullname: TextView = item.findViewById(R.id.fullname_id)
        var date: TextView = item.findViewById(R.id.date_of_update_id)
    }
}