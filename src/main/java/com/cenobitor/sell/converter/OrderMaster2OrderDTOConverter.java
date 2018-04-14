package com.cenobitor.sell.converter;

import com.cenobitor.sell.dataobject.OrderMaster;
import com.cenobitor.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 4:47 PM 2018/4/14
 * @Modified By:
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream()
                .map(e->convert(e))
                .collect(Collectors.toList());
    }



}
