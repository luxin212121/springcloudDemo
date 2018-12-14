package com.springcloud.client.eurekaclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/dc")
    public String index() throws InterruptedException {
        Thread.sleep(5000L);
        String services ="server: " + discoveryClient.getServices();
        return services;
    }


}
