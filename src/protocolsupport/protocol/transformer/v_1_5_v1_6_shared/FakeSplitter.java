package protocolsupport.protocol.transformer.v_1_5_v1_6_shared;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class FakeSplitter extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf buf, List<Object> list) throws Exception {
		if (!buf.isReadable()) {
			return;
		}
		list.add(buf.readBytes(buf.readableBytes()));
	}

}
