package com.wiky.a500pxapidemo.presenter;

import com.orhanobut.logger.Logger;
import com.wiky.a500pxapidemo.entity.Photo;
import com.wiky.a500pxapidemo.model.A500PxApi;
import com.wiky.a500pxapidemo.view.IMainView;

import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 4399_wuhui on 2016/9/9.
 */
public class MainViewPresenter implements IMainViewPresenter {
    private IMainView view;

    public MainViewPresenter(IMainView view) {
        this.view = view;
    }

    @Override
    public void loadPhotoData() {
        A500PxApi.getInstance().getPhotoPopular()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Photo>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        view.loadPhotoDataFailure();
                    }

                    @Override
                    public void onNext(Photo photo) {
                        List<Photo.PhotosBean> photos = photo.getPhotos();
                        view.loadPhotoDataSuccess("https://500px.com"+photos.get(0).getUrl());
                        Logger.d(photos.get(0).getImage_url());
                    }
                });
    }
}
