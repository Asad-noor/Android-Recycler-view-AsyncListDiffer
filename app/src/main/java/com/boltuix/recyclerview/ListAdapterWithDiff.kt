package com.boltuix.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.boltuix.recyclerview.databinding.RecyclerViewDesignBinding

class ListAdapterWithDiff (private val event: (RecyclerViewDesignBinding, MyData) -> Unit): ListAdapter<MyData, ListAdapterWithDiff.ListAdapterViewHolder>(MyDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapterViewHolder {
        return ListAdapterViewHolder(
            RecyclerViewDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListAdapterViewHolder, position: Int) {
        val currentItem = getItem(position)
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

    class ListAdapterViewHolder(val bindingDesign: RecyclerViewDesignBinding) : RecyclerView.ViewHolder(bindingDesign.root)

    class MyDiffUtil: DiffUtil.ItemCallback<MyData>(){
        override fun areItemsTheSame(oldItem: MyData, newItem: MyData): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: MyData, newItem: MyData): Boolean {
            return oldItem == newItem
        }
    }
}