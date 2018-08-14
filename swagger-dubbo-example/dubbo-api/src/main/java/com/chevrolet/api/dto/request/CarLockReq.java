package com.chevrolet.api.dto.request;

import com.chevrolet.api.enums.lock.CarLockBizTypeEnum;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author maihe
 */
@Data
public class CarLockReq implements Serializable {
    private static final long serialVersionUID = -7988854138569182261L;
    //车辆id
    @ApiModelProperty(value = "车辆id")
    private Long carId;

    //批量加锁时传carIds
    @ApiModelProperty(value = "批量加锁时传carIds")
    private List<Long> carIds;

    //业务类型
    @ApiModelProperty(value = "业务类型")
    private CarLockBizTypeEnum bizType;
    //业务no
    @ApiModelProperty(value = "业务no")
    private String bizNo;
    //到期时间
    @ApiModelProperty(value = "到期时间")
    private Date expireTime;
    //车辆所状态
    @ApiModelProperty(value = "车辆所状态")
    private CarLockExtStatusEnum ext1;
}
