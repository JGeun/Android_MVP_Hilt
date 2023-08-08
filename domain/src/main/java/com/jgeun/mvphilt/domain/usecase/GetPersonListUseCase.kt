package com.jgeun.mvphilt.domain.usecase

import com.jgeun.mvphilt.domain.repository.MvpHiltRepository
import javax.inject.Inject

class GetPersonListUseCase @Inject constructor(
	private val repository: MvpHiltRepository
){
	operator fun invoke() = repository.fetchData()
}