package com.zuo.config;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotEmpty;

public class fibonacciConfiguration extends Configuration {

    @JsonProperty("configFilePath")
    @NotEmpty
    private String configFilePath = "./config.yml";

    @JsonProperty("configFilePath")
    public String getConfigFilePath() {
        return configFilePath;
    }

    @JsonProperty("configFilePath")
    public void setConfigFilePath(String configFilePath) {
        this.configFilePath = configFilePath;
    }
}
