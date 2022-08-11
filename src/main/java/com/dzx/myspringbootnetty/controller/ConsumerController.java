package com.dzx.myspringbootnetty.controller;

import com.dzx.myspringbootnetty.client.NettyClient;
import com.dzx.myspringbootnetty.protocol.protobuf.MessageBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
public class ConsumerController {
    @Resource
    private NettyClient nettyClient;

    @GetMapping("/send")
    public String send(){
        //Message 有问题
        MessageBase.Message message = new MessageBase.Message();
        //这里message content为空
        message.toBuilder().setCmd(MessageBase.Message.CommandType.NORMAL)
                .setContent("hello Netty!!")
                .setRequestId(UUID.randomUUID().toString())
                .build();//发送正常消息
        nettyClient.sendMsg(message);
        return "ok";
    }
}
