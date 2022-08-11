package com.dzx.myspringbootnetty.protocol.message;

import com.dzx.myspringbootnetty.protocol.message.command.Command;
import lombok.Data;

@Data
public class HeartbeatRequestPacket extends Packet{
    @Override
    public Byte getCommand() {
        return Command.HEARTBEAT_REQUEST;
    }
}
