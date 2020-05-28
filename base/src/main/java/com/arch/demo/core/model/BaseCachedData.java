package com.arch.demo.core.model;

import java.io.Serializable;

//对数据实体类T进行包装，增加了updateTimeInMills这个字段
public class BaseCachedData<T> implements Serializable {
    public long updateTimeInMills;
    public T data;
}
