package com.dzx.myspringbootnetty.utils;

import com.dzx.myspringbootnetty.protocol.protobuf.MessageBase;

import java.util.UUID;

public class MessageBaseTest {
    public static void main(String[] args) {
        MessageBase.Message message = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setContent("hello world").build();
        System.out.println("message: "+message.toString());
    }
}
