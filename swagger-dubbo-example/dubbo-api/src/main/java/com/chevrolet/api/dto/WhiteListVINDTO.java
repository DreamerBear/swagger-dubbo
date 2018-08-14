package com.chevrolet.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by suclogger on 2017/12/5
 * Modified by
 * Description:
 */
@Data
@ApiModel(description = "车架号白名单")
public class WhiteListVINDTO implements Serializable {

    @ApiModelProperty(value = "车架号")
    private String vin;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    @ApiModelProperty(value = "车系id")
    private Long seriesId;

    @ApiModelProperty(value = "车型id")
    private Long modelId;

}
