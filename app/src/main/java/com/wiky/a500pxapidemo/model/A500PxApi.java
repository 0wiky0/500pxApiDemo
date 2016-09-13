package com.wiky.a500pxapidemo.model;

import com.wiky.a500pxapidemo.entity.Photo;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * 500PxApi
 * Created by wiky on 2016/9/8.
 */
public class A500PxApi {
    private static final String BASE_URL = "https://api.500px.com/v1/";
    private static final String CONSUMER_KEY = "zYEzTxATp1TW5WkBHb29SWsWwMyYW7xcG4Cia4dG";

    private I500PxService i500PxService;

    /**
     * https://github.com/500px/api-documentation/blob/master/endpoints/photo/GET_photos.md
     */
    public Observable<Photo> getPhotoPopular() {
        return i500PxService.getPhoto(CONSUMER_KEY, "popular",1,"6,4");
    }

    //单例
    private A500PxApi() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        i500PxService = retrofit.create(I500PxService.class);
    }

    private static class SingletonHolder {
        private static final A500PxApi INSTANCE = new A500PxApi();
    }

    public static A500PxApi getInstance() {
        return SingletonHolder.INSTANCE;
    }
}