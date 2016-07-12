package com.dreamdigitizers.androidsqliteormdemo.presenters.classes;

import com.dreamdigitizers.androidbaselibrary.presenters.classes.PresenterBase;
import com.dreamdigitizers.androidsqliteormdemo.views.interfaces.IViewMain;
import com.dreamdigitizers.androidsqliteormdemo.presenters.interfaces.IPresenterMain;

class PresenterMain extends PresenterBase<IViewMain> implements IPresenterMain {
    public PresenterMain(IViewMain pView) {
        super(pView);
    }
}
