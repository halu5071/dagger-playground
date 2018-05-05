package io.moatwel.sample.dagger

import io.moatwel.sample.dagger.di.UsecaseModule
import org.powermock.api.mockito.PowerMockito
import org.powermock.api.mockito.PowerMockito.`when`

class MockUsecaseModule : UsecaseModule() {

  override fun provideApiClient(): ApiClient {
    val mockClient = PowerMockito.mock(ApiClient::class.java)
    `when`(mockClient.getToken()).thenReturn("mock_token")
    return mockClient
  }

  override fun provideChartUsecase(): ChartUsecase {
    return PowerMockito.mock(ChartUsecase::class.java)
  }
}