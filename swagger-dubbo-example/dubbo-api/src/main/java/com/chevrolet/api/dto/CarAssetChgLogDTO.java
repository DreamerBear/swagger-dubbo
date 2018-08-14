package com.chevrolet.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author maihe
 *
 */
@Data
public class CarAssetChgLogDTO implements Serializable {
    private static final long serialVersionUID = 6823461376190731145L;
    /**
     * <p> 更改记录id </p>
     */
    @ApiModelProperty(value = "更改记录id")
    private Long chglogId;
    /**
     * <p> 归属id </p>
     */
    @ApiModelProperty(value = "归属id")
    private Long oid;
    /**
     * <p> 原归属类型 </p>
     */
    @ApiModelProperty(value = "原归属类型")
    private Integer oType;
    /**
     * <p> 新归属id </p>
     */
    @ApiModelProperty(value = "新归属id")
    private Long nid;
    /**
     * <p> 新归属类型 </p>
     */
    @ApiModelProperty(value = "新归属类型")
    private Integer nType;
    /**
     * <p> 车辆id </p>
     */
    @ApiModelProperty(value = "车辆id")
    private Long carId;
    /**
     * <p> 创建时间 </p>
     */
    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;
    /**
     * <p> 更改时间 </p>
     */
    @ApiModelProperty(value = "更改时间")
    private Date gmtModified;
}
