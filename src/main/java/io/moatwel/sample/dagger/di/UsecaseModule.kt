package io.moatwel.sample.dagger.di

import dagger.Module
import dagger.Provides
import io.moatwel.sample.dagger.ApiClient
import io.moatwel.sample.dagger.ChartUsecase
import javax.inject.Singleton

@Module
open class UsecaseModule {

  @Provides
  @Singleton
  open fun provideChartUsecase(): ChartUsecase {
    return ChartUsecase()
  }

  @Provides
  @Singleton
  open fun provideApiClient(): ApiClient {
    return ApiClient()
  }
}