package com.cenobitor.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: Cenobitor
 * @Description:
 * @Date: Created in 10:37 PM 2018/4/17
 * @Modified By:
 */
@Entity
@Data
public class SellerInfo {
    @Id
    private String id;

    private String username;

    private String password;

    private String openid;

}
