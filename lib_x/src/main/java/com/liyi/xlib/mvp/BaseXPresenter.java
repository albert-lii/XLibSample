package com.liyi.xlib.mvp;

import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;


public class BaseXPresenter<V extends IBaseXView> implements IBaseXPresenter {
    private WeakReference<V> mViewRef;

    public BaseXPresenter(@NonNull V view) {
        attachView(view);
    }

    private void attachView(V view) {
        mViewRef = new WeakReference<V>(view);
    }

    public V getView() {
        return mViewRef.get();
    }

    @Override
    public boolean isViewAttach() {
        return mViewRef != null && mViewRef.get() != null;
    }

    @Override
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
