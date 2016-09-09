package com.wiky.a500pxapidemo.model;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wiky on 2016/9/8.
 */
public interface I500PxService {
    @GET("photos")
    Call<ResponseBody> getPhoto(@Query("consumer_key") String consumer_key, @Query("feature") String feature);
}