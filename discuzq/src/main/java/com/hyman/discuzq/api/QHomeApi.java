package com.hyman.discuzq.api;

import com.arch.demo.network_api.ApiBase;
import com.arch.demo.network_api.beans.NewsChannelsBean;
import com.arch.demo.network_api.beans.NewsListBean;
import com.arch.demo.network_api.utils.TecentUtil;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;

/**
 * Created by Allen on 2017/7/20.
 * 保留所有版权，未经允许请不要分享到互联网和其他人
 */
public final class QHomeApi extends ApiBase {
    private static volatile QHomeApi instance = null;
    private QHomeApiInterface newsApiInterface;
    public static final String PAGE = "page";

    private QHomeApi() {
        super("https://discuz.chat/");
        newsApiInterface = retrofit.create(QHomeApiInterface.class);
    }

    public static QHomeApi getInstance() {
        if (instance == null) {
            synchronized (QHomeApi.class) {
                if (instance == null) {
                    instance = new QHomeApi();
                }
            }
        }
        return instance;
    }



    public void getQTopicList(Observer<NewsChannelsBean> observer) {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("filter",null);
        requestMap.put("createThread","1");
        String timeStr = TecentUtil.getTimeStr();
        ApiSubscribe(newsApiInterface.getQTopicList(requestMap), observer);
    }

    public void getQHomeThemeList(Observer<NewsListBean> observer) {
        Map<String, String> requestMap = new HashMap<>();
//        String timeStr = TecentUtil.getTimeStr();
//        requestMap.put("channelId", channelId);
//        requestMap.put("channelName", channelName);
//        requestMap.put(PAGE, page);
        ApiSubscribe(newsApiInterface.getQHomeThemeList(requestMap), observer);
    }
}
