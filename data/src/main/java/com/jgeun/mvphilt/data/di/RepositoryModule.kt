package com.jgeun.mvphilt.data.di

import com.jgeun.mvphilt.data.repository.MvpHiltRepositoryImpl
import com.jgeun.mvphilt.domain.repository.MvpHiltRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

	@Binds
	fun bindsMvpHiltRepository(
		mvpHiltRepositoryImpl: MvpHiltRepositoryImpl
	): MvpHiltRepository
}