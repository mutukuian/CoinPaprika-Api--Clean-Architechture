package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.common.Constants.BASE_URL
import com.example.cleanarchitecture.data.remote.CoinPaprikaApi
import com.example.cleanarchitecture.data.repository.CoinRepositoryImpl
import com.example.cleanarchitecture.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesPaprikaApi() : CoinPaprikaApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun providesCoinRepository(api: CoinPaprikaApi) : CoinRepository{
        return CoinRepositoryImpl(api)
    }
}