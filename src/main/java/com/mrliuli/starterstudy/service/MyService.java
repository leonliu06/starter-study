package com.mrliuli.starterstudy.service;

/**
 * Created by liuli on 2019/12/13.
 */
public class MyService {
    private String config;

    public MyService(String config) {
        this.config = config;
    }

    public String[] split(String splitChar) {
        return config.split(splitChar);
    }
}