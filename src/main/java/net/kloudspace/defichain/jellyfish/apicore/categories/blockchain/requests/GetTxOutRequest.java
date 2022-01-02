package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.UTXODetails;

public class GetTxOutRequest implements IRpcRequest<UTXODetails> {
	
	private final String txId;
	private final Number n;
	private final boolean includeMempool;
	
	public GetTxOutRequest(String txId, Number n, boolean includeMempool) {
		this.txId = txId;
		this.n = n;
		this.includeMempool = includeMempool;
	}

	@Override
	public String getName() {
		return "gettxout";
	}

	@Override
	public String getParameters() {
		return "[\""+this.txId+"\","+this.n+"," + this.includeMempool +"]";
	}

	@Override
	public RpcResponse<UTXODetails> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), UTXODetails.class), 0);
	}

}
