package com.davis.mvptest.view;

import com.davis.mvptest.Girl;

import java.util.List;

/**
 * Created by xushengfu on 2017/12/10.
 * 定义出所有的Ui逻辑
 */

public interface IGrilView {
    void showLoading();

    void showGrils(List<Girl> girls);
}
