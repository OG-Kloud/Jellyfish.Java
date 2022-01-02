package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetBlockHashRequest implements IRpcRequest<String> {

	private final Number blockHeight;
	
	public GetBlockHashRequest(Number blockheight) {
		this.blockHeight = blockheight;
	}
	
	@Override
	public String getName() {
		return "getblockhash";
	}

	@Override
	public String getParameters() {
		return "["+this.blockHeight+"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<String>(new Gson().fromJson(obj.get("result").getAsJsonObject(), String.class), 0);
	}

}
