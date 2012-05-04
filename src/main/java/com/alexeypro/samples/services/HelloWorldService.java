package com.alexeypro.samples.services;

import com.alexeypro.samples.HelloWorldConfiguration;
import com.alexeypro.samples.resources.HelloWorldResource;
import com.alexeypro.samples.health.TemplateHealthCheck;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;

public class HelloWorldService extends Service<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldService().run(args);
    }

    private HelloWorldService() {
        super("hello-world");
        addBundle(new ViewBundle());
    }

    @Override
    protected void initialize(HelloWorldConfiguration configuration,
                              Environment environment) {
        final String template = configuration.getTemplate();
        final String defaultName = configuration.getDefaultName();
        environment.addResource(new HelloWorldResource(template, defaultName));
        environment.addHealthCheck(new TemplateHealthCheck(template));
    }

}