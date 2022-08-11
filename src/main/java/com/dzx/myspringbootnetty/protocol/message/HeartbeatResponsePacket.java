package com.dzx.myspringbootnetty.protocol.message;

import com.dzx.myspringbootnetty.protocol.message.command.Command;

public class HeartbeatResponsePacket extends Packet{
    @Override
    public Byte getCommand() {
        return Command.HEARTBEAT_RESPONSE;
    }
}
