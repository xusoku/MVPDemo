package com.davis.mvptest.model;

import com.davis.mvptest.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xushengfu on 2017/12/10.
 */

public class GirlModelImpl implements IGirlModel{
    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {

        List<Girl> data=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            data.add(new Girl("wosho","1"+i));
        }

        girlOnLoadListener.onComplete(data);
    }
}
