package com.zz.work.service;

import com.zz.work.config.MonitorProperties;

import java.util.Date;
import java.util.function.Consumer;

public class MonitorService {

    private MonitorProperties properties;

    public MonitorService(MonitorProperties properties) {
        this.properties = properties;
    }

    public void subscribe(String url, Consumer<String> callback) {
        System.out.println("login to security center:");
        System.out.println("loginUrl=" + properties.getLoginUrl());
        System.out.println("username=" + properties.getUsername());
        System.out.println("password=" + properties.getPassword());
        System.out.println("connect to monitor:");
        System.out.println("serverUrl=" + properties.getServerUrl());

        System.out.println("receive monitor data");
        callback.accept("current time:" + new Date().toString());
        callback.accept("current time:" + new Date().toString());
        callback.accept("current time:" + new Date().toString());
    }

    public void unsubscribe(String url) {
        System.out.println("unsubscribe:" + url);
    }

}
