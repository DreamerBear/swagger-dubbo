package com.chevrolet.api.service;

import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.CarFuzzyQuery;
import com.subaru.common.entity.BizResult;
import io.swagger.annotations.ApiOperation;

import java.util.List;

public interface CarSearchService {
    /**
     * 通过modelName carUnique 模糊查询车辆
     *
     * @param carFuzzyQuery
     * @return
     */
    @ApiOperation("通过modelName carUnique 模糊查询车辆")
    BizResult<List<BaseCarDTO>> queryCarDetailPagination(CarFuzzyQuery carFuzzyQuery);
}
