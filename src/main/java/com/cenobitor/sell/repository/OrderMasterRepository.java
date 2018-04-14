package com.cenobitor.sell.repository;

import com.cenobitor.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 9:42 PM 2018/4/11
 * @Modified By:
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String>{

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}
