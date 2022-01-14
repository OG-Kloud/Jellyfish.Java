package net.kloudspace.defichain.jellyfish.apicore.categories.mining.requests;

import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetNetworkHashRequest implements IRpcRequest<BigDecimal> {
	
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

	@Override
	public RpcResponse<BigDecimal> parse(JsonObject obj) {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result"), BigDecimal.class), 0);
	}

}
