package com.cenobitor.sell.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


/**
 * @Description:
 * @Date: Created in 1:10 PM 2018/4/18
 * @Author: Cenobitor
 * @Modified By:
 */
@Component
public class WebSocketConfig {

    @Autowired
    private ServerEndpointExporter serverEndpointExporter;

    @Bean
    public ServerEndpointExporter serverEndpointExporter(){
        return serverEndpointExporter;
    }

}
