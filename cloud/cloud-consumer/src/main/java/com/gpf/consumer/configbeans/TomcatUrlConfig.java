package com.gpf.consumer.configbeans;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 解决tomcat7以上版本的特殊字符串校验
 * @package: com.gpf.consumer.configbeans
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/11/6 10:27
 */
@Configuration
public class TomcatUrlConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
    @Override
    public void customize(TomcatServletWebServerFactory tomcatServletWebServerFactory) {
        tomcatServletWebServerFactory.addConnectorCustomizers(connector -> connector.setAttribute("relaxedQueryChars", "{}[]|:\\"));
    }
}
