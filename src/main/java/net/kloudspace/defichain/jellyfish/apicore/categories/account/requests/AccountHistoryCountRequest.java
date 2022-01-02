package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class AccountHistoryCountRequest implements IRpcRequest<Number> {
	
	private final String address;
	
	public AccountHistoryCountRequest(String address) {
		this.address = address;
	}

	@Override
	public String getName() {
		return "accounthistorycount";
	}

	@Override
	public String getParameters() {
		return "[\""+this.address+"\"]";
	}

	@Override
	public RpcResponse<Number> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsNumber(), 0);
	}

}
