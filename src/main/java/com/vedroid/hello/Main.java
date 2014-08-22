package com.vedroid.hello;

public class Main {
    public static void main(String[] args) {
        IMessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        mr.setMessageProvider(MessageSupportFactory.getInstance().getMessageProvider());
        mr.render();
    }
}
