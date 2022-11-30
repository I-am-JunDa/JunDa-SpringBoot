package com.junda.common;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 15:53
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class PageResult<T> extends Result<T> {

    /** 总数据条数*/
    private Long count;

    /** 当前页码*/
    private Long currentNum;

    /** 总页码*/
    private Long totalNum;
    /**
     * 是否存在上一页
     * @return true / false
     */
    @Builder.Default
    public boolean hasPrevious = false;

    /**
     * 是否存在下一页
     * @return true / false
     */
    @Builder.Default
    public boolean hasNext = false;

    /**当前页结果集 */
    private List<T> list;

    public static <T> PageResult<T> empty() {
        return new PageResult<>(0L, 0L, 0L, false, false, null);
    }
}
