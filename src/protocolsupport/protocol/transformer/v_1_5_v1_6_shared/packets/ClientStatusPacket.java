package protocolsupport.protocol.transformer.v_1_5_v1_6_shared.packets;

import net.md_5.bungee.protocol.packet.ClientStatus;
import protocolsupport.protocol.transformer.TransformedPacket;

public class ClientStatusPacket extends ClientStatus implements TransformedPacket {

	@Override
	public boolean shouldWrite() {
		return true;
	}

	@Override
	public int getId() {
		return 0xCD;
	}

}
