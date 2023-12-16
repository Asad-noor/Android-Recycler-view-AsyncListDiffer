package com.boltuix.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.boltuix.recyclerview.databinding.RecyclerViewDesignBinding

class RecyclerViewAdapterViewHolder(val bindingDesign: RecyclerViewDesignBinding) : RecyclerView.ViewHolder(bindingDesign.root)

class RecyclerViewAdapter (private val event: (RecyclerViewDesignBinding, MyData) -> Unit): RecyclerView.Adapter<RecyclerViewAdapterViewHolder>() {
    private lateinit var context : Context
    private val itemDifferCallback = object: DiffUtil.ItemCallback<MyData>(){
        override fun areItemsTheSame(oldItem: MyData, newItem: MyData): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: MyData, newItem: MyData): Boolean {
            return oldItem == newItem
        }

    }
    // to do job asynchronously
    private val itemDiffer = AsyncListDiffer(this, itemDifferCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapterViewHolder {
        context = parent.context
        return RecyclerViewAdapterViewHolder(
            RecyclerViewDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapterViewHolder, position: Int) {
        val currentItem = itemDiffer.currentList[position]
        with(holder) {
            bindingDesign.apply {

                titleText.text = currentItem.title

                descriptionText.text = currentItem.description

                cardView.setOnClickListener {
                   event(holder.bindingDesign,currentItem)
                 }

            }
        }
    }

    override fun getItemCount(): Int = itemDiffer.currentList.size

    fun submitList(list: List<MyData?>?) {
        //itemDiffer.submitList(list)
        itemDiffer.submitList(list?.let { ArrayList(it) })
    }

}