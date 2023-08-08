package com.jgeun.mvphilt.data.repository

import com.jgeun.mvphilt.domain.model.Person
import com.jgeun.mvphilt.domain.repository.MvpHiltRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MvpHiltRepositoryImpl @Inject constructor(

): MvpHiltRepository {

	private val mockData = listOf(
		Person(id = 1L, name = "John", age = 87),
		Person(id = 2L, name = "Amy", age = 27),
		Person(id = 3L, name = "Kal", age = 31),
		Person(id = 4L, name = "Joe", age = 14),
		Person(id = 5L, name = "Kim", age = 37),
		Person(id = 6L, name = "John", age = 56),
		Person(id = 7L, name = "Zoe", age = 90),
		Person(id = 8L, name = "Park", age = 25),
		Person(id = 9L, name = "Jul", age = 60),
		Person(id = 10L, name = "Jay", age = 30),
	)

	override fun fetchData() = flow {
		emit(mockData)
	}
}