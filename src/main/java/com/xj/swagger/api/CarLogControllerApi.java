package com.xj.swagger.api;

import com.xj.swagger.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "车辆进出口记录",description = "车辆进出口日志接口")
public interface CarLogControllerApi {
    @ApiOperation("获取指定工点车辆进出信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "wroksitId",value = "工点id",required = true,paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "startTime",value = "开始时间",required = true,paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "endTime",value = "结束时间",required = true,paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "pageIndex",value = "当前页",required = true,paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "pageSize",value = "每页显示的条数",required = true,paramType = "query",dataType = "int")
    })
    ResponseResult getCarLogList(String worksitId,String startTime,String endTime,int pageIndex,int pageSize);
}
