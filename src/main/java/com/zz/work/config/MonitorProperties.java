package com.zz.work.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "demo.monitor")
public class MonitorProperties {

    private String loginUrl;
    private String username;
    private String password;
    private String serverUrl;

}
