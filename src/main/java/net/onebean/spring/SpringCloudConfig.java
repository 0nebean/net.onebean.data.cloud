package net.onebean.spring;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;

/**
 * spring cloud 配置类
 * @author 0neBean
 */
@Configuration
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = "net.onebean.*.**.api.**")
public class SpringCloudConfig {

    public static void main(String[] args) {

    }
}
