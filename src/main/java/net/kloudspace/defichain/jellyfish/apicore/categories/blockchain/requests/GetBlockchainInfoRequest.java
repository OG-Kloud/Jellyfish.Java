package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.BlockchainInfo;

public class GetBlockchainInfoRequest<T> implements IRpcRequest<T> {

	@Override
	public String getName() {
		return "getblockchaininfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<T> parse(JsonObject obj) {
		//TODO
		BlockchainInfo data = new BlockchainInfo("test", 50);
		return new RpcResponse<>((T)data, 1);
	}

}
