package com.chevrolet.api.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by suclogger on 2017/5/16.
 */
@Data
public class CarModelGuidePriceRequest implements Serializable {

    private static final long serialVersionUID = 8170604923118224684L;

    @ApiModelProperty(value = "指导价")
    private String guidePrice;

    @ApiModelProperty(value = "起始页")
    private Integer start = 0;

    @ApiModelProperty(value = "页size")
    private Integer pageSize = 20;

    @ApiModelProperty(value = "状态")
    private Integer status;
}
