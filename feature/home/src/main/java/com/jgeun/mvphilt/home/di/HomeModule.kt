package com.jgeun.mvphilt.home.di

import com.jgeun.mvphilt.home.presenter.HomeContract
import com.jgeun.mvphilt.home.presenter.HomePresenter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface HomeModule {

	@Binds
	fun bindHomePresenter(homePresenter: HomePresenter): HomeContract.Presenter
}