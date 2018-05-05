package io.moatwel.sample.dagger

import io.moatwel.sample.dagger.di.DaggerUsecaseComponent
import io.moatwel.sample.dagger.di.UsecaseModule
import javax.inject.Inject

@Inject
lateinit var chartUsecase: ChartUsecase

fun main(args: Array<String>) {
  println("App Started")
  chartUsecase = ChartUsecase()
  val component = DaggerUsecaseComponent.builder().usecaseModule(UsecaseModule()).build()
  component.inject(chartUsecase)
  println("Token: ${chartUsecase.token}")

  println("App Terminated")
}
