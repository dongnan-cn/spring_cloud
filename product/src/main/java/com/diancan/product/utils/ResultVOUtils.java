package com.diancan.product.utils;

import com.diancan.product.VO.ResultVO;

public class ResultVOUtils {
    public static ResultVO success(Object obj){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(obj);
        resultVO.setCode(0);
        resultVO.setMsg("success");
        return resultVO;
    }
}
