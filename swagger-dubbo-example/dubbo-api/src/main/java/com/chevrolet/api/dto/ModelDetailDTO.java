package com.chevrolet.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by suclogger on 2017/6/21.
 */
@Data
@ApiModel(description = "车型详细")
public class ModelDetailDTO implements Serializable {

    /**
     * 车型ID
     */
    @ApiModelProperty(value = "车型ID")
    private Long modelId;

    /**
     * 车型名
     */
    @ApiModelProperty(value = "车型名")
    private String modelName;

    /**
     * 车系id
     */
    @ApiModelProperty(value = "车系id")
    private Long seriesId;

    /**
     * 品牌ID
     */
    @ApiModelProperty(value = "品牌ID")
    private Long brandId;

    /**
     * 车规ID
     */
    @ApiModelProperty(value = "车规ID")
    private Integer standard;

    /**
     * 年款
     */
    @ApiModelProperty(value = "年款")
    private String year;

    /**
     * 销售状态 @see com.chevrolet.ModelStatusEnum
     */
    @ApiModelProperty(value = "销售状态 @see com.chevrolet.ModelStatusEnum")
    private Integer status;

    /**
     * 排量
     */
    @ApiModelProperty(value = "排量")
    private String displacement;

    /**
     * 前驱后驱
     */
    @ApiModelProperty(value = "前驱后驱")
    private String drive;

    /**
     * 汽油柴油
     */
    @ApiModelProperty(value = "汽油柴油")
    private String fuel;

    /**
     * 几座
     */
    @ApiModelProperty(value = "几座")
    private String seat;

    /**
     * 指导价
     */
    @ApiModelProperty(value = "指导价")
    private String guidePrice;

    /**
     * 短名称，一般是modelName去除品牌车系后的名字，用于层级菜单展示
     * <p>
     * 比如：
     * modelName: 宝马7系 2014款 730Li 臻享型
     * wapName: 730Li 臻享型
     */
    @ApiModelProperty(value = "短名称，一般是modelName去除品牌车系后的名字，用于层级菜单展示")
    private String wapName;

    @ApiModelProperty(value = "长度")
    private Integer length;

    @ApiModelProperty(value = "宽度")
    private Integer width;

    @ApiModelProperty(value = "高度")
    private Integer height;

}
