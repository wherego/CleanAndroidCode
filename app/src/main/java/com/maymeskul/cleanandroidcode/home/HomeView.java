package com.maymeskul.cleanandroidcode.home;

import com.maymeskul.cleanandroidcode.models.CityListResponse;

public interface HomeView {

    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getCityListSuccess(CityListResponse cityListResponse);

}