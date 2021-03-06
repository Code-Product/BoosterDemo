package com.sihaixuan.booster.library

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 *
 * 项目名称：BoosterDemo
 * 类描述：
 * 创建人：toney
 * 创建时间：2019/6/8 23:17
 * 邮箱：xiyangfeisa@foxmail.com
 * 备注：
 * @version   1.0
 *
 */
class SimpleAdapter(private val context: Context) : RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {
    private final lateinit var data :IntArray
    init {
        data = IntArray(3)
        data.set(0,R.drawable.library_pexels_photo_733881)
        data.set(1,R.drawable.library_pexels_photo_1608113)
        data.set(2,R.drawable.library_pexels_photo_1767434)
    }
    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        Glide.with(context).load(data[position]).into(holder.image)
    }

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder = SimpleViewHolder(LayoutInflater.from(context).inflate(R.layout.library_item, parent, false))

    inner class SimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image: ImageView = view.findViewById(R.id.library_img)
    }
}