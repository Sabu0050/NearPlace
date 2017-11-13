package com.sabututexp.nearplace.api;


import android.app.Application;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by s on 14/11/17.
 */

public class ApiService extends Application {
    ApiInterface apiInterface = null ;
    static ApiService myService;
    @Override
    public void onCreate() {
        super.onCreate();
        myService = this;
    }

    public ApiInterface getApiService() {
        if (apiInterface == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().retryOnConnectionFailure(true).readTimeout(80, TimeUnit.SECONDS).connectTimeout(80, TimeUnit.SECONDS).addInterceptor(interceptor).build();

            Retrofit retrofit = new Retrofit.Builder().baseUrl(BaseUrl.PLACE_API_BASE_URL).addConverterFactory(getApiConvertorFactory()).client(client).build();

            apiInterface = retrofit.create(ApiInterface.class);
            return apiInterface;
        } else {
            return apiInterface;
        }
    }

    private static GsonConverterFactory getApiConvertorFactory() {
        return GsonConverterFactory.create();
    }


    public static ApiService getApp() {
        return myService;
    }
}
