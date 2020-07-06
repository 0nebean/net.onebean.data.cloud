package net.onebean.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignRequestInterceptor implements RequestInterceptor {

    private final static String CALL_CLIENT_TYPE_KEY = "CALL_CLIENT_TYPE_KEY";
    private final static String CALL_CLIENT_TYPE_FEIGN = "FEIGN";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        //这里可以添加feign请求的全局参数
        requestTemplate.header(CALL_CLIENT_TYPE_KEY,CALL_CLIENT_TYPE_FEIGN);
    }
}