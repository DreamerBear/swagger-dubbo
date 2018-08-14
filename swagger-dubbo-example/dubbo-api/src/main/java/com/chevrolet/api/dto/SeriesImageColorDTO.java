package com.chevrolet.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author maihe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "外观内饰颜色")
public class SeriesImageColorDTO implements Serializable {
    private static final long serialVersionUID = -5651358422360046482L;

    //颜色id
    @ApiModelProperty(value = "颜色id")
    private Long colorId;
    //颜色name
    @ApiModelProperty(value = "颜色name")
    private String colorName;

}
