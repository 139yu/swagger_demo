package com.xj.swagger.controller;


import com.xj.swagger.api.CarLogControllerApi;
import com.xj.swagger.model.CarInfo;
import com.xj.swagger.model.response.CommonCode;
import com.xj.swagger.model.response.QueryResponseResult;
import com.xj.swagger.model.response.QueryResult;
import com.xj.swagger.model.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v2/ims/ImsCarLogList")
public class CarLogController implements CarLogControllerApi {

    @Override
    @PostMapping("ImsCarLogList")
    public ResponseResult getCarLogList(String worksitId, String startTime, String endTime, int pageIndex, int pageSize) {
        List<CarInfo> carInfoList = new ArrayList<>();
        carInfoList.add(new CarInfo("2020年10月","2020年10月"));
        carInfoList.add(new CarInfo("2020年10月","2020年10月"));
        carInfoList.add(new CarInfo("2020年10月","2020年10月"));
        return new QueryResponseResult<CarInfo>(CommonCode.SUCCESS,carInfoList);
    }
    @GetMapping("hello")
    public ResponseResult hello(){
        return new ResponseResult(CommonCode.SUCCESS);
    }
}
