package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.Block;

public class GetBlockRequest implements IRpcRequest<Block> {
	
	private final String blockHash;
	
	public GetBlockRequest(String blockhash) {
		this.blockHash = blockhash;
	}

	@Override
	public String getName() {
		return "getblock";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.blockHash + "\",2" +"]";
	}

	@Override
	public RpcResponse<Block> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), Block.class), 0);
	}
	
	

}
