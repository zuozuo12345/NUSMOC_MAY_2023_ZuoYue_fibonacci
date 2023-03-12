package com.zuo;

import com.zuo.config.fibonacciConfiguration;
import com.zuo.resources.FibonacciResource;
import com.zuo.service.IFibonacciService;
import com.zuo.service.impl.FibonacciServiceImpl;
import io.dropwizard.Application;
import io.dropwizard.configuration.ConfigurationFactoryFactory;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.configuration.YamlConfigurationFactory;
import io.dropwizard.jackson.Jackson;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class fibonacciApplication extends Application<fibonacciConfiguration> {

    public static void main(final String[] args) throws Exception {
        new fibonacciApplication().run(args);
    }

    @Override
    public String getName() {
        return "fibonacci";
    }

    @Override
    public void initialize(final Bootstrap<fibonacciConfiguration> bootstrap) {
        // Load the configuration file
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
    }

    @Override
    public void run(final fibonacciConfiguration configuration, final Environment environment) {
        String configFilePath = configuration.getConfigFilePath();
        IFibonacciService fibonacciService = new FibonacciServiceImpl();
        FibonacciResource fibonacciResource = new FibonacciResource(fibonacciService);
        environment.jersey().register(fibonacciResource);
    }

}