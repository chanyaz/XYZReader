package com.vpaliy.xyzreader.ui.article;

import android.os.Bundle;

import com.vpaliy.xyzreader.App;
import com.vpaliy.xyzreader.R;
import com.vpaliy.xyzreader.ui.base.BaseActivity;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class ArticleActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
    }

    @Override
    public void handleEvent(@NonNull Object event) {

    }

    @Override
    public void injectDependencies() {
        App.app().component().inject(this);
    }
}