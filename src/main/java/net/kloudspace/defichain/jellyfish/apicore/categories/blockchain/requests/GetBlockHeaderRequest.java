package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.BlockHeader;

public class GetBlockHeaderRequest implements IRpcRequest<BlockHeader> {
	
private final String blockHash;
	
	public GetBlockHeaderRequest(String blockhash) {
		this.blockHash = blockhash;
	}

	@Override
	public String getName() {
		return "getblockheader";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.blockHash + "\",true" +"]";
	}

	@Override
	public RpcResponse<BlockHeader> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), BlockHeader.class), 0);
	}

}
