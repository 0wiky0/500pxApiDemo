package com.wiky.a500pxapidemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.wiky.a500pxapidemo.R;
import com.wiky.a500pxapidemo.presenter.IMainViewPresenter;
import com.wiky.a500pxapidemo.presenter.MainViewPresenter;

public class MainActivity extends AppCompatActivity implements IMainView{

    private TextView text;
    private IMainViewPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.init("Wiky");

        text = (TextView) findViewById(R.id.txt_result);

        presenter = new MainViewPresenter(this);
        presenter.loadPhotoData();
    }

    @Override
    public void loadPhotoDataSuccess(String resultStr) {
        text.setText(resultStr);
    }

    @Override
    public void loadPhotoDataFailure() {
        text.setText("获取失败");
    }
}
