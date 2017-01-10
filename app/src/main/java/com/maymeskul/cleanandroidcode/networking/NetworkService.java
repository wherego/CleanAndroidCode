package com.maymeskul.cleanandroidcode.networking;


import com.maymeskul.cleanandroidcode.models.CityListResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}