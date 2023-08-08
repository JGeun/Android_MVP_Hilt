package com.jgeun.mvphilt.domain.repository

import com.jgeun.mvphilt.domain.model.Person
import kotlinx.coroutines.flow.Flow

interface MvpHiltRepository {

	fun fetchData(): Flow<List<Person>>
}