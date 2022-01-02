package net.kloudspace.defichain.jellyfish.apicore.categories.mining.requests;

import java.math.BigDecimal;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetNetworkHashRequest<T> implements IRpcRequest<T> {
	
	private Number nBlocks;
	private Number height;
	
	public GetNetworkHashRequest(Number nBlocks, Number height) {
		this.nBlocks = nBlocks;
		this.height = height;
	}

	public GetNetworkHashRequest() {
		this(120, -1);
	}
	
	@Override
	public String getName() {
		return "getnetworkhashps";
	}

	@Override
	public String getParameters() {
		return "["+nBlocks+","+height+"]";
	}

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<T> parse(JsonObject obj) {
		System.out.println(obj.toString());
		BigDecimal value = obj.get("result").getAsBigDecimal();
		RpcResponse<T> response = new RpcResponse<>((T)value, 1);
		return response;
	}

}
