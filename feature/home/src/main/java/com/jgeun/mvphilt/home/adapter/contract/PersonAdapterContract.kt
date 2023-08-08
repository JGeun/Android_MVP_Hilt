package com.jgeun.mvphilt.home.adapter.contract

import com.jgeun.mvphilt.domain.model.Person

interface PersonAdapterContract {
	interface View {
		// click 이벤트
	}

	interface Model {
		fun addItems(personList: List<Person>)

	}
}