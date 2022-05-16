package com.example.assignement6_bcsd
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignement6_bcsd.databinding.ItemRecyclerBinding

class MainAdapter : RecyclerView.Adapter<Holder>(){

    var listData = mutableListOf<Member>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val member = listData[position]
        holder.setData(member)
    }
    override fun getItemCount(): Int {
        return listData.size
    }
}
class Holder(val binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root){
    fun setData(member: Member){
        binding.recyclerText.text = member.name
    }
}