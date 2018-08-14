package com.chevrolet.api.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by maihe on 2017/7/3.
 */
public final class CarHisDTO implements Serializable {
    private static final long serialVersionUID = -8324186731413341917L;
    /**
     * database column cc_car_his.car_id
     */
    @ApiModelProperty(value = "车辆ID")
    private Long carId;

    /**
     * database column cc_car_his.brand_id
     */
    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    /**
     * database column cc_car_his.brand_name
     */
    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    /**
     * database column cc_car_his.car_unique
     */
    @ApiModelProperty(value = "车架号")
    private String carUnique;

    /**
     * database column cc_car_his.inner_color_id
     */
    @ApiModelProperty(value = "内饰Id")
    private Long innerColorId;

    /**
     * database column cc_car_his.inner_color_name
     */
    @ApiModelProperty(value = "内饰颜色名称")
    private String innerColorName;

    /**
     * database column cc_car_his.model_id
     */
    @ApiModelProperty(value = "车型id")
    private Long modelId;

    /**
     * database column cc_car_his.model_name
     */
    @ApiModelProperty(value = "车型名称")
    private String modelName;

    /**
     * database column cc_car_his.odometer
     */
    @ApiModelProperty(value = "车辆里程")
    private String odometer;

    /**
     * database column cc_car_his.outer_color_id
     */
    @ApiModelProperty(value = "外饰id")
    private Long outerColorId;

    /**
     * database column cc_car_his.outer_color_name
     */
    @ApiModelProperty(value = "外饰名称")
    private String outerColorName;

    /**
     * database column cc_car_his.series_id
     */
    @ApiModelProperty(value = "车系id")
    private Long seriesId;

    /**
     * database column cc_car_his.series_name
     */
    @ApiModelProperty(value = "车系名称")
    private String seriesName;

    /**
     * database column cc_car_his.spec_id
     */
    @ApiModelProperty(value = "车规id")
    private Integer specId;

    /**
     * database column cc_car_his.spec_name
     */
    @ApiModelProperty(value = "车规名称")
    private String specName;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCarUnique() {
        return carUnique;
    }

    public void setCarUnique(String carUnique) {
        this.carUnique = carUnique;
    }

    public Long getInnerColorId() {
        return innerColorId;
    }

    public void setInnerColorId(Long innerColorId) {
        this.innerColorId = innerColorId;
    }

    public String getInnerColorName() {
        return innerColorName;
    }

    public void setInnerColorName(String innerColorName) {
        this.innerColorName = innerColorName;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public Long getOuterColorId() {
        return outerColorId;
    }

    public void setOuterColorId(Long outerColorId) {
        this.outerColorId = outerColorId;
    }

    public String getOuterColorName() {
        return outerColorName;
    }

    public void setOuterColorName(String outerColorName) {
        this.outerColorName = outerColorName;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }
}
