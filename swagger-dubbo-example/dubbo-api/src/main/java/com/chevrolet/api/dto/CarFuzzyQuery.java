package com.chevrolet.api.dto;

import com.subaru.common.model.request.BaseDubboRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author maihe
 */
@Data
public class CarFuzzyQuery extends BaseDubboRequest {
    private static final long serialVersionUID = 8402828109635176102L;
    //carId
    @ApiModelProperty(value = "carId")
    private List<Long> carIds;
    //批量查询
    @ApiModelProperty(value = "批量查询")
    private List<String> carUniques;
    //车架号
    @ApiModelProperty(value = "车架号")
    private String carUnique;
    //品牌
    @ApiModelProperty(value = "品牌")
    private String brandName;
    //车系
    @ApiModelProperty(value = "车系")
    private String seriesName;
    //车型name
    @ApiModelProperty(value = "车型name")
    private String modelName;
    //物权
    @ApiModelProperty(value = "物权")
    private Long assetRight;
    //物权type
    @ApiModelProperty(value = "物权type")
    private Integer assetRightType;
    //模糊字段 目前支持 caruniuqe modelname
    @ApiModelProperty(value = "模糊字段 目前支持 caruniuqe modelname")
    private String fuzzyField;
    //是否采用分页 0默认不分页 1分页
    @ApiModelProperty(value = "是否采用分页 0默认不分页 1分页")
    private int isPaged = 0;
}
