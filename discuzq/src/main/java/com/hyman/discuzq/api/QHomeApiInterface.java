package com.hyman.discuzq.api;


import com.arch.demo.network_api.beans.NewsChannelsBean;
import com.arch.demo.network_api.beans.NewsListBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;

public interface QHomeApiInterface {
    /**
     *查询主题列表
     * @return
     */
    @GET("api/threads")
    Observable<NewsListBean> getQHomeThemeList(
            @QueryMap Map<String, String> options);

    /**
     * 话题列表
     * @param source
     * @param authorization
     * @param date
     * @param options
     * @return
     */
//    @GET("api/topics")
//    Observable<NewsChannelsBean> getQTopicList(
//            @Header("Source") String source,
//            @Header("Authorization") String authorization,
//            @Header("Date") String date,
//            @QueryMap Map<String, String> options);

    @GET("api/categories")
    Observable<NewsChannelsBean> getQTopicList(
//            @Header("Source") String source,
//            @Header("Authorization") String authorization,
//            @Header("Date") String date,
            @QueryMap Map<String, String> options);
}
