package com.wiky.a500pxapidemo.model;

import com.wiky.a500pxapidemo.entity.Photo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wiky on 2016/9/8.
 */
public interface I500PxService {
    /**
     * 获取图片
     *
     * @param consumer_key 至https://500px.com/settings/applications注册应用获取
     * @param feature      图片特征 Global features
     *                     'popular' — Return photos in Popular. Default sort: rating.
     *                     'highest_rated' — Return photos that have been in Popular. Default sort: highest_rating.
     *                     'upcoming' — Return photos in Upcoming. Default sort: time when Upcoming was reached.
     *                     'editors' — Return photos in Editors' Choice. Default sort: time when selected by an editor.
     *                     'fresh_today' — Return photos in Fresh Today. Default sort: time when reached fresh.
     *                     'fresh_yesterday' — Return photos in Fresh Yesterday. Default sort: same as 'fresh_today'.
     *                     'fresh_week' — Return photos in Fresh This Week. Default sort: same as 'fresh_today'.
     * @return
     */
    @GET("photos")
    Observable<Photo> getPhoto(@Query("consumer_key") String consumer_key, @Query("feature") String feature);

    /**
     * 获取图片
     *
     * @param consumer_key 至https://500px.com/settings/applications注册应用获取
     * @param feature      图片特征 Global features
     *                     'popular' — Return photos in Popular. Default sort: rating.
     *                     'highest_rated' — Return photos that have been in Popular. Default sort: highest_rating.
     *                     'upcoming' — Return photos in Upcoming. Default sort: time when Upcoming was reached.
     *                     'editors' — Return photos in Editors' Choice. Default sort: time when selected by an editor.
     *                     'fresh_today' — Return photos in Fresh Today. Default sort: time when reached fresh.
     *                     'fresh_yesterday' — Return photos in Fresh Yesterday. Default sort: same as 'fresh_today'.
     *                     'fresh_week' — Return photos in Fresh This Week. Default sort: same as 'fresh_today'.
     * @param rpp          rpp — The number of results to return. Can not be over 100, default 20.
     * @return
     */
    @GET("photos")
    Observable<Photo> getPhoto(@Query("consumer_key") String consumer_key, @Query("feature") String feature, @Query("rpp") int rpp);


    /**
     * 获取图片
     *
     * @param consumer_key 至https://500px.com/settings/applications注册应用获取
     * @param feature      图片特征 Global features
     *                     'popular' — Return photos in Popular. Default sort: rating.
     *                     'highest_rated' — Return photos that have been in Popular. Default sort: highest_rating.
     *                     'upcoming' — Return photos in Upcoming. Default sort: time when Upcoming was reached.
     *                     'editors' — Return photos in Editors' Choice. Default sort: time when selected by an editor.
     *                     'fresh_today' — Return photos in Fresh Today. Default sort: time when reached fresh.
     *                     'fresh_yesterday' — Return photos in Fresh Yesterday. Default sort: same as 'fresh_today'.
     *                     'fresh_week' — Return photos in Fresh This Week. Default sort: same as 'fresh_today'.
     * @param rpp          The number of results to return. Can not be over 100, default 20.
     * @param image_size   The photo size(s) to be returned. See the documentation on photo sizes.
     * @return
     */
    @GET("photos")
    Observable<Photo> getPhoto(@Query("consumer_key") String consumer_key, @Query("feature") String feature, @Query("rpp") int rpp, @Query("image_size") String image_size);
}