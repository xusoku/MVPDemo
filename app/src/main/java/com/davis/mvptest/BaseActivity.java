package com.davis.mvptest;

import android.app.Activity;
import android.os.Bundle;

import com.davis.mvptest.presenter.BasePresenter;

/**
 * Created by xushengfu on 2017/12/10.
 */

public abstract class BaseActivity<V, P extends BasePresenter<V>> extends Activity {
    public P girlPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        girlPresenter = creatPresenter();
        girlPresenter.attachView((V) this);
    }

    protected abstract P creatPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        girlPresenter.detachView();
    }
}
