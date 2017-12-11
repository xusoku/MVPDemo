package com.davis.mvptest.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by xushengfu on 2017/12/10.
 */

public class BasePresenter<T>{
    protected WeakReference<T> mViewRef;//解决内存泄漏


    //进行绑定
    public void attachView(T View){
        mViewRef=new WeakReference<T>(View);
    }
    //进行解绑

    public void detachView(){
        if(mViewRef!=null){
            mViewRef.clear();
        }
    }
}
