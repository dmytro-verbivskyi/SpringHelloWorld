package com.vedroid.hello;

public class StandartOutMessageRenderer implements IMessageRenderer {
    private IMessageProvider provider;

    @Override
    public void render() {
        if (provider == null) {
            String ex = "You must set property provider of class: " +
                    StandartOutMessageRenderer.class.getName();
            throw new RuntimeException(ex);
        }
        System.out.println(provider.getMessage());
    }

    @Override
    public void setMessageProvider(IMessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public IMessageProvider getMessageProvider() {
        return provider;
    }
}
