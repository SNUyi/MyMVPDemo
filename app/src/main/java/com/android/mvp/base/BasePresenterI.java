package com.android.mvp.base;

import android.content.Context;

/**
 * Created by Administrator on 2016/9/7 0007.
 */
public interface BasePresenterI {


    /**
     * 判断网络连接
     * */
    boolean checkNetWork(Context context);

    void unsubcrible();



}
