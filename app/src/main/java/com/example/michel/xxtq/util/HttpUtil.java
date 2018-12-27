package com.example.michel.xxtq.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 服务器工具类
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
