package com.jgeun.mvphilt.home.presenter

import com.jgeun.mvphilt.home.adapter.contract.PersonAdapterContract
interface HomeContract {

	interface View {
		// View Event
	}

	interface Presenter {

		fun loadItems()

		fun attachView(view: View)

		fun detachView()

		/**
		 * [PersonAdapterContract] 와 관련된 기능들
		 */
		fun setPersonAdapterView(adapterView: PersonAdapterContract.View)
		fun setPersonAdapterModel(adapterModel: PersonAdapterContract.Model)
	}
}