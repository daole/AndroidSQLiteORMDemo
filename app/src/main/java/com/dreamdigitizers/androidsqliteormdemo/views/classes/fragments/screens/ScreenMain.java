package com.dreamdigitizers.androidsqliteormdemo.views.classes.fragments.screens;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dreamdigitizers.androidbaselibrary.views.classes.fragments.screens.ScreenBase;
import com.dreamdigitizers.androidsqliteorm.utilities.UtilsQuery;
import com.dreamdigitizers.androidsqliteormdemo.R;
import com.dreamdigitizers.androidsqliteormdemo.models.local.sqlite.User;
import com.dreamdigitizers.androidsqliteormdemo.views.interfaces.IViewMain;
import com.dreamdigitizers.androidsqliteormdemo.presenters.classes.PresenterFactory;
import com.dreamdigitizers.androidsqliteormdemo.presenters.interfaces.IPresenterMain;

import java.util.ArrayList;
import java.util.List;

public class ScreenMain extends ScreenBase<IPresenterMain> implements IViewMain {
    @Override
    public void onResume() {
        List<String> projections = new ArrayList<>();
        StringBuilder tableClauseBuilder = new StringBuilder();
        UtilsQuery.buildProjectionsAndTableClause(projections, tableClauseBuilder, User.class);
        String tableClause = tableClauseBuilder.toString();
        Log.d("AndroidSQLiteORMDemo", tableClause);
    }

    @Override
    public int getScreenId() {
        return 0;
    }

    @Override
    protected IPresenterMain createPresenter() {
        return (IPresenterMain) PresenterFactory.createPresenter(IPresenterMain.class, this);
    }

    @Override
    protected View loadView(LayoutInflater pInflater, ViewGroup pContainer) {
        View rootView = pInflater.inflate(R.layout.screen__main, pContainer, false);
        return rootView;
    }

    @Override
    protected void retrieveScreenItems(View pView) {
    }

    @Override
    protected void mapInformationToScreenItems(View pView) {
    }

    @Override
    protected int getTitle() {
        return 0;
    }
}
