package com.alexeypro.samples.resources;

import com.alexeypro.samples.Saying;
import com.alexeypro.samples.views.SayingView;
import com.google.common.base.Optional;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;


@Path("/hello-world")
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    @Path("/hi.json")
    @Produces(MediaType.APPLICATION_JSON)
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        return new Saying(counter.incrementAndGet(),
                          String.format(template, name.or(defaultName)));
    }

    @GET
    @Timed
    @Path("/hi.html")
    @Produces(MediaType.TEXT_HTML)
    public SayingView sayHelloView(@QueryParam("name") Optional<String> name) {
        return new SayingView(new Saying(counter.incrementAndGet(),
                String.format(template, name.or(defaultName))));
    }

}