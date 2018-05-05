package io.moatwel.sample.dagger;

import javax.inject.Inject;

public class ChartUsecase {

  @Inject
  ApiClient apiClient;

  public String getToken() {
    return apiClient.getToken();
  }
}
