package com.junda.common.eunm;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum DateEnum {
    Timestamp("Timestamp","时间戳"),
    DateString("DateString","日期字符串"),
    ;

    private String value;
    private String description;
    public static Map<String, String> GETMAP = new HashMap<>();

    static {
        for (DateEnum type : DateEnum.values()) {
            GETMAP.put(type.getValue(), type.getDescription());
        }
    }
}
