package indi.liyi.lib.common.utils.http;

import android.support.annotation.NonNull;

import indi.liyi.scaffold.http.response.HttpResponse;

/**
 * 请求响应类
 *
 * @param <T>
 */
public class ApiResponse<T> extends HttpResponse<T> {

    public ApiResponse(HttpCallback<T> callback) {
        super(callback);
    }

    public ApiResponse(@NonNull Object tag, HttpCallback<T> callback) {
        super(tag, callback);
    }

    @Override
    public void onNext(T t) {
        super.onNext(t);
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);
    }
}
