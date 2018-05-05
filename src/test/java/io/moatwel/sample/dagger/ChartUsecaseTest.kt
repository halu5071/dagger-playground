package io.moatwel.sample.dagger

import io.moatwel.sample.dagger.di.DaggerUsecaseComponent
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import javax.inject.Inject

@RunWith(PowerMockRunner::class)
@PrepareForTest(value = [
  ChartUsecase::class,
  ApiClient::class
])
class ChartUsecaseTest {

  @Inject
  lateinit var chartUsecase: ChartUsecase

  @Before
  fun setup() {
    chartUsecase = ChartUsecase()
    DaggerUsecaseComponent.builder().usecaseModule(MockUsecaseModule()).build().inject(chartUsecase)
  }

  @Test
  fun test_token() {
    assertThat(chartUsecase.token, `is`("mock_token"))
  }
}