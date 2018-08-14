package com.chevrolet.api.service;

import com.chevrolet.api.dto.*;
import com.chevrolet.api.dto.request.CarModelGuidePriceRequest;
import com.chevrolet.api.support.BaseValue;
import com.subaru.common.entity.BizResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.List;
import java.util.Map;

/**
 * Created by suclogger on 2017/5/16.
 * <p>
 * 车辆信息的工具箱应用，包含品牌，车系，车型信息的获取等
 */
@Api(description = "品牌车系车型服务")
public interface CarToolBoxService {

    /**
     * 基础校验车架号
     *
     * @param vin
     * @return 校验结果
     */
    @ApiOperation("基础校验车架号")
    BizResult<Boolean> verifyVIN(@ApiParam(value = "车架号")String vin);


    /**
     * 批量校验车架号
     *
     * @param vins 车架号
     * @return 校验结果
     */
    @ApiOperation("批量校验车架号")
    BizResult<Map<String, Boolean>> verifyVINBatch(@ApiParam(value = "车架号列表")List<String> vins);

    /**
     * 根据车架号返回车型信息
     */
    @ApiOperation("根据车架号返回车型信息")
    BizResult<ModelDTO> getModelByVIN(@ApiParam(value = "基础车id")String vin);

    /**
     * 获取所有品牌
     *
     * @return
     */
    @ApiOperation("获取所有品牌")
    BizResult<List<BrandDTO>> getAllBrand();

    /**
     * 根据系列Id获取车型
     *
     * @param seriesId
     * @return
     */
    @ApiOperation("根据系列Id获取车型")
    BizResult<List<ModelDTO>> getModelsBySeriesId(@ApiParam(value = "车系id")Long seriesId);

    /**
     * 通过品牌ID列表获取指定的品牌
     *
     * @param ids
     * @return
     */
    @ApiOperation("通过品牌ID列表获取指定的品牌")
    BizResult<List<BrandDTO>> getBrandListByIds(@ApiParam(value = "品牌ID列表")List<Long> ids);

    /**
     * 通过车系ID列表获取指定的车系列表
     *
     * @param ids
     * @return
     */
    @ApiOperation("通过车系ID列表获取指定的车系列表")
    BizResult<List<SeriesDTO>> getSeriesListByIds(@ApiParam(value = "车系ID列表")List<Long> ids);

    /**
     * 根据主键查询车厂
     *
     * @param factoryId
     * @return
     */
    @ApiOperation("根据主键查询车厂")
    BizResult<FactoryDTO> getFactoryById(@ApiParam(value = "车厂id")Long factoryId);

    /**
     * 根据品牌ID查询品牌信息
     *
     * @param brandId
     * @return
     */
    @ApiOperation("根据品牌ID查询品牌信息")
    BizResult<BrandDTO> getBrandByBrandId(@ApiParam(value = "品牌id")Long brandId);

    /**
     * 根据车规获取品牌
     *
     * @param standard
     * @return
     */
    @ApiOperation("根据车规获取品牌")
    BizResult<List<BrandDTO>> getBrandListByStandard(@ApiParam(value = "车规id")Integer standard);

    /**
     * 查询所以有效的系列 包括没有车的
     *
     * @param brandId
     * @return
     */
    @ApiOperation("查询所以有效的系列 包括没有车的")
    BizResult<List<SeriesDTO>> getAllSeriesByBrandId(@ApiParam(value = "品牌id")Long brandId);

    /**
     * 根据车系ID查询车系信息
     *
     * @param seriesId
     * @return
     */
    @ApiOperation("根据车系ID查询车系信息")
    BizResult<SeriesDTO> getSeriesBySeriesId(@ApiParam(value = "车系id")Long seriesId);

    /**
     * 根据指导价获取车型(仅限国产和中规)
     *
     * @param guidePrice
     * @return
     */
    @ApiOperation("根据指导价获取车型(仅限国产和中规)")
    BizResult<List<ModelDTO>> getSellingModelsByGuidePrice(@ApiParam(value = "指导价")String guidePrice);

    /**
     * 根据指导价获取车型(仅限国产和中规) (分页)
     *
     * @param request
     * @return
     */
    @ApiOperation("根据指导价获取车型(仅限国产和中规) (分页)")
    BizResult<List<ModelDTO>> getSellingModelsByGuidePriceWithPage(CarModelGuidePriceRequest request);

    /**
     * 根据车型ID获取车型
     *
     * @param modelId
     * @return
     */
    @ApiOperation("根据车型ID获取车型")
    BizResult<ModelDTO> getModelByModelId(@ApiParam(value = "车型id")Long modelId);


    /**
     * 根据车型ID获取车型（详细）
     *
     * @param modelId
     * @return
     */
    @ApiOperation("根据车型ID获取车型（详细）")
    BizResult<ModelDetailDTO> getDetailModelByModelId(@ApiParam(value = "车型id")Long modelId);


    /**
     * 通过车型名获取车型
     *
     * @param modelName
     * @return
     */
    @ApiOperation("通过车型名获取车型")
    BizResult<ModelDetailDTO> getDetailModelByName(@ApiParam(value = "车型名称")String modelName);


    /**
     * 根据指导价查找车型(不过滤状态)
     *
     * @param guidePrice
     * @return
     */
    @ApiOperation("根据指导价查找车型(不过滤状态)")
    BizResult<List<ModelDTO>> getModelsByGuidePrice(@ApiParam(value = "指导价")String guidePrice);

    /**
     * 根据指导价查找车型(不过滤状态)(分页)
     *
     * @param request
     * @return
     */
    @ApiOperation("根据指导价查找车型(不过滤状态)(分页)")
    BizResult<List<ModelDTO>> getModelsByGuidePriceWithPage(CarModelGuidePriceRequest request);

    /**
     * 添加车型
     *
     * @param modelDetailDTO
     * @return
     */
    @ApiOperation("添加车型")
    BizResult<Boolean> addModel(ModelDetailDTO modelDetailDTO);


    /**
     * 添加白名单车架号
     *
     * @return 添加成功或者失败
     */
    @ApiOperation("添加白名单车架号")
    BizResult<Boolean> addWhiteListVIN(WhiteListVINDTO whiteListVINDTO);


    /**
     * 根据车系获取外观内饰颜色
     */
    @ApiOperation("根据车系获取外观内饰颜色")
    BizResult<Map<String, List<SeriesImageColorDTO>>> getColorsBySeriesId(@ApiParam(value = "车系id")Long seriesId);

    /**
     * 根据车系获取外观内饰颜色
     */
    @ApiOperation("根据车系获取外观内饰颜色")
    BizResult<List<SeriesImageColorDTO>> getSeriesImageBySeriesIdAndType(@ApiParam(value = "车系id")Long seriesId, @ApiParam(value = "类型")Integer type);

    /**
     * 根据color id 获取颜色
     */
    @ApiOperation("根据color id 获取颜色")
    BizResult<SeriesImageColorDTO> getSeriesImageByColorId(@ApiParam(value = "颜色id")Long colorId);


    /**
     * 根据车系，车规，外观内饰类型获取车辆颜色
     */
    @ApiOperation("根据车系，车规，外观内饰类型获取车辆颜色")
    BizResult<List<SeriesImageColorDTO>> getSeriesImageBySeriesIdAndType(@ApiParam(value = "车系id")Long seriesId, @ApiParam(value = "类型")Integer type, @ApiParam(value = "车规id")Integer standard);

    /**
     * 根据 车规、品牌ID、状态 获取车系
     *
     * @param brandId
     * @param standard
     * @param status
     * @return
     */
    @ApiOperation("根据 车规、品牌ID、状态 获取车系")
    BizResult<List<SeriesDTO>> getSeriesList(@ApiParam(value = "品牌id")Long brandId, @ApiParam(value = "车规id")Integer standard, @ApiParam(value = "状态")Integer status);


    /**
     * 根据品牌查询有车的车系
     *
     * @param brandId
     * @return
     */
    @ApiOperation("根据品牌查询有车的车系")
    BizResult<List<SeriesDTO>> getHasCarSeriesByBrandId(@ApiParam(value = "品牌id")Long brandId);

    /**
     * 获取有车源的品牌
     *
     * @return
     */
    @ApiOperation("获取有车源的品牌")
    BizResult<List<BrandDTO>> getAllBrandWithCars();


    /**
     * 根据 车系ID、车规、状态 获取车型
     *
     * @param seriesId
     * @param standard
     * @return
     */
    @ApiOperation("根据 车系ID、车规、状态 获取车型")
    BizResult<List<ModelDTO>> getModelList(@ApiParam(value = "车系id")Long seriesId, @ApiParam(value = "车规id")Integer standard, @ApiParam(value = "状态")Integer status);


    /**
     * 获取秒车库热门品牌
     */
    @ApiOperation("获取秒车库热门品牌")
    BizResult<List<BrandDTO>> getSecKillProductHotBrandListByName(@ApiParam(value = "品牌名列表")List<String> brandNameList);

    /**
     * 根据指导价查找车型(不过滤状态)(分页)
     *
     * @param request
     * @return
     */
    @ApiOperation("根据指导价查找车型(不过滤状态)(分页)")
    BizResult<List<ModelDTO>> getModelsByGuidePriceAndStatusWithPage(CarModelGuidePriceRequest request);

    /**
     * 根据车规获取所有有车系的品牌
     *
     * @param standard
     * @return
     */
    @ApiOperation("根据车规获取所有有车系的品牌")
    BizResult<List<BrandDTO>> getBrandListWithSeries(@ApiParam(value = "车规id")Integer standard);

    /**
     * 根据车系id获取对应的外观内饰
     *
     * @param seriesId
     * @return
     */
    @ApiOperation("根据车系id获取对应的外观内饰")
    BizResult<Map<String, List<BaseValue>>> getTrimAndFacade(@ApiParam(value = "车系id")long seriesId);

    /**
     * 获取所有存在有效系列的品牌
     *
     * @return
     */
    @ApiOperation("获取所有存在有效系列的品牌")
    BizResult<List<BrandDTO>> getAllValidSeriesBrand();

    /**
     * 根据系列ID获取有车牌的系列
     *
     * @param seriesId
     * @return
     */
    @ApiOperation("根据系列ID获取有车牌的系列")
    BizResult<SeriesDTO> getSeriesHasBrandBySeriesId(@ApiParam(value = "车系id")Long seriesId);

    /**
     * status为1的查询
     *
     * @return
     */
    @ApiOperation("status为1的查询")
    BizResult<List<ModelDTO>> getModelsByGuidePriceByStatus(@ApiParam(value = "指导价")String guidePrice);

}
