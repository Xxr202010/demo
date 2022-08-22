package com.yjy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 徐晓瑞
 * @date 2022/8/19 19:52
 * @describe:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayuiPage<T> {
    private int code;
    private String msg;
    private Long count;
    private List<T> data;

    /**
     * 只有总条数和分页数据的构造方法
     * @param count 总条数
     * @param data 分页数据
     */
    public LayuiPage( Long count, List<T> data) {
        this.count = count;
        this.data = data;
    }
}
