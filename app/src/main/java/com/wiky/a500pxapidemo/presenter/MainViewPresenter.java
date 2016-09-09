package com.wiky.a500pxapidemo.presenter;

import com.wiky.a500pxapidemo.model.A500PxApi;
import com.wiky.a500pxapidemo.view.IMainView;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        A500PxApi.getInstance().getPhotoPopular().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String resultStr = response.body().string();
                    view.loadPhotoDataSuccess(resultStr);
                } catch (IOException e) {
                    view.loadPhotoDataFailure();
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                view.loadPhotoDataFailure();
                t.printStackTrace();
            }
        });
    }
}
