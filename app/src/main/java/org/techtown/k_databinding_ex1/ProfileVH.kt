package org.techtown.k_databinding_ex1

import androidx.recyclerview.widget.RecyclerView
import org.techtown.k_databinding_ex1.databinding.RcvListItemBinding

class ProfileVH(val binding: RcvListItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(data: ProfileData) {
        binding.user = data
    }
}