package com.vedroid.hello;

public class HelloWorldMessageProvider implements IMessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
