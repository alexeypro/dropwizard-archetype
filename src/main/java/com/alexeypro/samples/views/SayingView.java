package com.alexeypro.samples.views;

import com.alexeypro.samples.Saying;
import com.yammer.dropwizard.views.View;

public class SayingView extends View {
    private final Saying saying;

    public SayingView(Saying saying) {
        super("saying.ftl");
        this.saying = saying;
    }

    public Saying getSaying() {
        return saying;
    }
}