package com.junda.good.pojo.eunm;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/3 9:17
 **/
public class GlobalEnum {
    @Getter
    @AllArgsConstructor
    public enum DelStatus {
        IsDel("99", "已删除"),
        NotDel("100", "未删除");

        private String value;
        private String description;
        public static Map<String, String> GETMAP = new HashMap<>();

        static {
            for (GlobalEnum.DelStatus type : GlobalEnum.DelStatus.values()) {
                GETMAP.put(type.getValue(), type.getDescription());
            }
        }
    }

}
