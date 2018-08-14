package com.chevrolet.api.service;

import com.chevrolet.api.dto.CarLockStatusDTO;
import com.chevrolet.api.dto.CarStatusLockResultDTO;
import com.chevrolet.api.dto.request.CarLockReq;
import com.chevrolet.api.enums.lock.CarLockBizTypeEnum;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import com.subaru.common.entity.BizResult;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @author maihe
 */
public interface CarStatusLockService {

    //车辆冻结
    @ApiOperation("车辆冻结")
    BizResult<Boolean> lock(CarLockReq carLockReq);

    //车辆解冻
    @ApiOperation("车辆解冻")
    BizResult<Boolean> unlock(CarLockReq carLockReq);

    //查询冻结状态
    @ApiOperation("查询冻结状态")
    BizResult<Boolean> isLock(CarLockReq carLockReq);

    /**
     * <p> 根据车辆id列表批量查询车辆状态锁列表 </p>
     * @param carIds
     * @return BizResult<List<AssetRightChgResultDTO>>
     * @throws
     * @author
     * @date
     * @since
     *
     */
    @ApiOperation("根据车辆id列表批量查询车辆状态锁列表")
    BizResult<List<CarStatusLockResultDTO>> queryCarLocks(List<Long> carIds);

    /**
     * <p> 根据车辆id列表及类型批量查询车辆状态锁列表 </p>
     * @param carIds
     * @param types
     * @return BizResult<List<AssetRightChgResultDTO>>
     * @throws
     * @author
     * @date
     * @since
     *
     */
    @ApiOperation("根据车辆id列表及类型批量查询车辆状态锁列表")
    BizResult<List<CarStatusLockResultDTO>> queryCarLocks(List<Long> carIds, List<Integer> types);

    /**
     * <p> 根据车架号列表批量查询车辆状态锁 </p>
     * @param carUniques
     * @return BizResult<List<AssetRightChgResultDTO>>
     * @throws
     * @author
     * @date
     * @since
     *
     */
    @ApiOperation("根据车架号列表批量查询车辆状态锁")
    BizResult<List<CarStatusLockResultDTO>> queryCarUniqueLocks(List<String> carUniques);

    /**
     * <p> 根据车架号列表及状态列表批量查询车辆状态锁 </p>
     * @param carUniques
     * @param types
     * @return BizResult<List<AssetRightChgResultDTO>>
     * @throws
     * @author
     * @date
     * @since
     *
     */
    @ApiOperation("根据车架号列表及状态列表批量查询车辆状态锁")
    BizResult<List<CarStatusLockResultDTO>> queryCarUniqueLocks(List<String> carUniques, List<Integer> types);

    /**
     * <p> 根据车辆id列表及状态列表批量查询车辆回款状态 </p>
     * @param carIds
     * @param types
     * @return BizResult<List<AssetRightChgResultDTO>>
     * @throws
     * @author
     * @date
     * @since
     *
     */
    @ApiOperation("根据车辆id列表及状态列表批量查询车辆回款状态")
    BizResult<List<CarLockStatusDTO>> queryAllCarLocks(List<Long> carIds, List<Integer> types);

    /**
     * <p> 根据车辆id列表及锁状态查询是否允许放款 </p>
     * @param carIds
     * @param statusEnum
     * @return BizResult<List<AssetRightChgResultDTO>>
     * @throws
     * @author
     * @date
     * @since
     *
     */
    @ApiOperation("根据车辆id列表及锁状态查询是否允许放款")
    BizResult<Boolean> allowLoanCar(List<Long> carIds, CarLockExtStatusEnum statusEnum);

    /**
     * <p> 根据车辆id列表、锁状态、车辆锁业务类型查询是否允许放款 </p>
     * @param carIds
     * @param statusEnum
     * @param carLockBizTypeEnum
     * @return BizResult<List<AssetRightChgResultDTO>>
     * @throws
     * @author
     * @date
     * @since
     *
     */
    @ApiOperation("根据车辆id列表、锁状态、车辆锁业务类型查询是否允许放款")
    BizResult<Boolean> allowLoanCar(List<Long> carIds, CarLockExtStatusEnum statusEnum, List<CarLockBizTypeEnum> carLockBizTypeEnum);

}
