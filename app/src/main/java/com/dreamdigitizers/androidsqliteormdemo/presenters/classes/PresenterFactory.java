package com.dreamdigitizers.androidsqliteormdemo.presenters.classes;

import com.dreamdigitizers.androidbaselibrary.presenters.interfaces.IPresenterBase;
import com.dreamdigitizers.androidbaselibrary.views.interfaces.IViewBase;
import com.dreamdigitizers.androidsqliteormdemo.views.interfaces.IViewMain;
import com.dreamdigitizers.androidsqliteormdemo.presenters.interfaces.IPresenterMain;

public class PresenterFactory {
    public static IPresenterBase createPresenter(Class pPresenterClass, IViewBase pView) {
        if (pPresenterClass.isAssignableFrom(IPresenterMain.class)) {
            return new PresenterMain((IViewMain) pView);
        }

        throw new RuntimeException("There is no such Presenter class.");
    }
}
