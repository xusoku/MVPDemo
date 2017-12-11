package com.davis.mvptest.model;

import com.davis.mvptest.Girl;

import java.util.List;

/**
 * Created by xushengfu on 2017/12/10.
 * 加载数据
 */

public interface IGirlModel {
    void loadGirl(GirlOnLoadListener girlOnLoadListener);

    //设计一个内部回调接口
    interface GirlOnLoadListener{
        void onComplete(List<Girl> girls);
    }
}
