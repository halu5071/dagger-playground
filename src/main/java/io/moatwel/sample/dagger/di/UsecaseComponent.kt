package io.moatwel.sample.dagger.di

import dagger.Component
import io.moatwel.sample.dagger.ApiClient
import io.moatwel.sample.dagger.ChartUsecase
import javax.inject.Singleton

@Singleton
@Component(modules = [
  UsecaseModule::class
])
interface UsecaseComponent {
  fun inject(chartUsecase: ChartUsecase)
  fun inject(apiClient: ApiClient)
}