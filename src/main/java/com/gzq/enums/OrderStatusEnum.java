package com.gzq.enums;

import lombok.Getter;

/**
 * Created by Bsea
 * 2017-06-11 17:12
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {

    SUCCESS(-1, "成功"),;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
