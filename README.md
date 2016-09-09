﻿# 相关知识
- MVP : [MODEL VIEW PRESENTER (MVP) IN ANDROID][1] 
- RxJava : [给 Android 开发者的 RxJava 详解](http://gank.io/post/560e15be2dca930e00da1083)
- Retrofit : [官方文档](http://square.github.io/retrofit/)
- 500px API ：[documentation](https://github.com/500px/api-documentation)

# 使用一：MVP+RxJava+Retrofit的基本使用
- 添加依赖
```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:24.2.0'

    //RxJava相关
    compile 'io.reactivex:rxandroid:1.2.1'
    // Because RxAndroid releases are few and far between, it is recommended you also
    // explicitly depend on RxJava's latest version for bug fixes and new features.
    compile 'io.reactivex:rxjava:1.1.6'

    //retrofit相关
    compile 'com.squareup.retrofit2:retrofit:2.1.0'

    //log相关
    compile 'com.orhanobut:logger:1.15'
}

```
- 添加网络请求权限
```
<uses-permission android:name="android.permission.INTERNET"/>
```
- 根据[Api文档][2]创建对应的Api类：./model/A500PxApi
```
public class A500PxApi {
    private static final String BASE_URL = "https://api.500px.com/v1/";
    private static final String CONSUMER_KEY = "zYEzTxATp1TW5WkBHb29SWsWwMyYW7xcG4Cia4dG";
    private String resultStr = "null";

    private Retrofit retrofit;
    private I500PxService i500PxService;

    /**
     * https://github.com/500px/api-documentation/blob/master/endpoints/photo/GET_photos.md
     */
    public  Call<ResponseBody> getPhotoPopular() {
        return i500PxService.getPhoto(CONSUMER_KEY, "popular");
    }

    //单例
    private A500PxApi() {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
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
```
- 在Presenter(./presenter/MainViewPresenter)中对数据进行处理
```
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

```


  [1]: http://www.tinmegali.com/en/model-view-presenter-android-part-1/
  [2]: https://github.com/500px/api-documentation/blob/master/endpoints/photo/GET_photos.md