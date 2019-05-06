package com.gzq.vo;

import lombok.Data;

@Data
public class ResultVo<T> {
    private String success;
    /** 错误码. */
    private Integer errorCode;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */

    private T body;
}
