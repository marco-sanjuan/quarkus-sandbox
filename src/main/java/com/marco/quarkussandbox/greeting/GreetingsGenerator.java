package com.marco.quarkussandbox.greeting;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingsGenerator {

    @ConfigProperty(name = "greeting.message",defaultValue = "Hello")
    String greeting;


    public String generate(){
        return greeting.toUpperCase();
    }
}
