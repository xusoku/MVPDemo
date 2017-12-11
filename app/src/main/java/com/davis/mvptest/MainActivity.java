package com.davis.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.davis.mvptest.model.IGirlModel;
import com.davis.mvptest.presenter.BasePresenter;
import com.davis.mvptest.presenter.GirlPresenter;
import com.davis.mvptest.view.IGrilView;

import java.util.List;

public class MainActivity extends BaseActivity<IGrilView,GirlPresenter<IGrilView>> implements IGrilView {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        girlPresenter.fetch();
    }

    @Override
    protected GirlPresenter<IGrilView> creatPresenter() {
        return new GirlPresenter<>();
    }

    @Override
    public void showLoading() {
        //加载Loading
    }

    @Override
    public void showGrils(List<Girl> girls) {
//        适配器加载数据
        myAdapter adapter = new myAdapter(this, girls);
        gridView.setAdapter(adapter);

    }
}
