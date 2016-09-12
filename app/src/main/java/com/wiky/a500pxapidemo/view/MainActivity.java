package com.wiky.a500pxapidemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.orhanobut.logger.Logger;
import com.wiky.a500pxapidemo.R;
import com.wiky.a500pxapidemo.presenter.IMainViewPresenter;
import com.wiky.a500pxapidemo.presenter.MainViewPresenter;

public class MainActivity extends AppCompatActivity implements IMainView {

    private ImageView imageView;
    private IMainViewPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.init("Wiky");

        imageView = (ImageView) findViewById(R.id.imageView);

        presenter = new MainViewPresenter(this);
        presenter.loadPhotoData();
    }

    @Override
    public void loadPhotoDataSuccess(String resultStr) {
        Glide.with(this).load(resultStr).asBitmap().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(imageView);
    }

    @Override
    public void loadPhotoDataFailure() {
    }
}
