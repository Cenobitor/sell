package com.cenobitor.sell.utils;

import com.cenobitor.sell.vo.ResultVO;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 12:09 AM 2018/4/14
 * @Modified By:
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code,String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
