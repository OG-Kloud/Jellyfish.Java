package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.InWalletTransaction;

public class GetTransactionRequest implements IRpcRequest<InWalletTransaction> {
	
	private final String txID;
	
	public GetTransactionRequest(String txid) {
		this.txID = txid;
	}

	@Override
	public String getName() {
		return "gettransaction";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.txID + "\"]";
	}

	@Override
	public RpcResponse<InWalletTransaction> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), InWalletTransaction.class), 0);
	}
	
	

}
