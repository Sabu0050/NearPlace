package com.sabututexp.nearplace.api;

import com.sabututexp.nearplace.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by s on 14/11/17.
 */

public interface ApiInterface {
    @GET("api/place/nearbysearch/json?key=AIzaSyDt_agsL-VjfCQRH4aUzIzKFtMdz1nzLFI&sensor=true")
    Call<ApiResponse> getNearbyPlaces(@Query("location") String location, @Query("radius") int radius,@Query("type") String type);
}
