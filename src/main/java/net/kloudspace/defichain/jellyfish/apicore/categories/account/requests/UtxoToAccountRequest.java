package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.options.BalanceTransferOptions;

public class UtxoToAccountRequest implements IRpcRequest<String> {
	
	private final BalanceTransferOptions options;

	public UtxoToAccountRequest(BalanceTransferOptions opts) {
		this.options = opts;
	}
	
	@Override
	public String getName() {
		return "utxostoaccount";
	}

	@Override
	public String getParameters() {
		return "[{\""+this.options.getAddress()+"\":\""+this.options.getAmount()+"\"}]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
