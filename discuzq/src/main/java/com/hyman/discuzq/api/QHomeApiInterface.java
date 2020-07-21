package com.hyman.discuzq.api;


import com.arch.demo.network_api.beans.NewsChannelsBean;
import com.arch.demo.network_api.beans.NewsListBean;
import com.hyman.discuzq.bean.QTabBean;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
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


    /**
     * 首页Tab列表数据
     * @param thread
     * @return
     */
    @GET("api/categories")
    Observable<QTabBean> getTabList(
//            @Header("Source") String source,
//            @Header("Authorization") String authorization,
//            @Header("Date") String date,
//            @Query("filter") List list,

            @Query("createThread")int thread);
}
