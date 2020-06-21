package net.onebean.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = "net.onebean.*.**.api.**")
public class SpringCloudConfig {
}
