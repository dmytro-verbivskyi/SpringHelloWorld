package com.vedroid.hello;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;
    private Properties props;
    private IMessageRenderer renderer;
    private IMessageProvider provider;

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    private MessageSupportFactory() {
        props = new Properties();
        try {
            props.load(new FileInputStream("src/main/resources/msf.properties"));
            String renderClass = props.getProperty("render.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (IMessageRenderer) Class.forName(renderClass).newInstance();
            provider = (IMessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IMessageRenderer getMessageRenderer() {
        return renderer;
    }

    public IMessageProvider getMessageProvider() {
        return provider;
    }

}
