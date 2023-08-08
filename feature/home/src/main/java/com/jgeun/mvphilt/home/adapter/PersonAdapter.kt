package com.jgeun.mvphilt.home.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jgeun.mvphilt.domain.model.Person
import com.jgeun.mvphilt.home.adapter.contract.PersonAdapterContract
import com.jgeun.mvphilt.home.databinding.ItemPersonBinding

class PersonAdapter() : ListAdapter<Person, PersonAdapter.ViewHolder>(PersonDiffCallback),
	PersonAdapterContract.View,
	PersonAdapterContract.Model
{

	class ViewHolder(
		private val binding: ItemPersonBinding
	) : RecyclerView.ViewHolder(binding.root) {

		fun bind(person: Person) {
			Log.e("Test@@@", "person: $person")
			binding.person = person
		}
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val binding = ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return ViewHolder(binding)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bind(currentList[position])
	}

	override fun addItems(personList: List<Person>) {
		submitList(personList)
	}

	object PersonDiffCallback : DiffUtil.ItemCallback<Person>() {
		override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
			return oldItem == newItem
		}

		override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
			return oldItem.id == newItem.id
		}
	}
}