package com.davis.mvptest.presenter;

import android.widget.BaseAdapter;

import com.davis.mvptest.Girl;
import com.davis.mvptest.model.GirlModelImpl;
import com.davis.mvptest.model.IGirlModel;
import com.davis.mvptest.view.IGrilView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by xushengfu on 2017/12/10.
 */

public class GirlPresenter<T extends IGrilView>  extends BasePresenter<T>{

    private IGirlModel iGirlModel = new GirlModelImpl();


    public GirlPresenter() {
    }


    //真正加载数据
    public void fetch() {
        if (mViewRef.get() != null) {
            mViewRef.get().showLoading();

            if (iGirlModel != null) {
                iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if (mViewRef.get() != null) {
                            mViewRef.get().showGrils(girls);
                        }
                    }
                });
            }
        }


    }


}
