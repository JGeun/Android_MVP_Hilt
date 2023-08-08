package com.jgeun.mvphilt.home.presenter

import com.jgeun.mvphilt.domain.usecase.GetPersonListUseCase
import com.jgeun.mvphilt.home.adapter.contract.PersonAdapterContract
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomePresenter @Inject constructor(
	private val getPersonListUseCase: GetPersonListUseCase
) : HomeContract.Presenter {

	private lateinit var view: HomeContract.View
	private lateinit var personAdapterModel: PersonAdapterContract.Model
	private lateinit var personAdapterView: PersonAdapterContract.View

	override fun attachView(view: HomeContract.View) {
		this.view = view

		loadItems()
	}

	override fun detachView() {
		// clear
	}

	override fun loadItems() {
		CoroutineScope(Dispatchers.IO).launch {
			getPersonListUseCase().collectLatest {
				personAdapterModel.addItems(it)
			}
		}
	}

	override fun setPersonAdapterView(adapterView: PersonAdapterContract.View) {
		this.personAdapterView = adapterView
	}

	override fun setPersonAdapterModel(adapterModel: PersonAdapterContract.Model) {
		this.personAdapterModel = adapterModel
	}
}