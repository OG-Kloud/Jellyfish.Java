package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.AddressInfo;

public class GetAddressInfo implements IRpcRequest<AddressInfo> {

	private final String address;
	
	public GetAddressInfo(String address) {
		this.address = address;
	}
	
	@Override
	public String getName() {
		return "getaddressinfo";
	}

	@Override
	public String getParameters() {
		return "[\""+this.address+"\"]";
	}

	@Override
	public RpcResponse<AddressInfo> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), AddressInfo.class), 0);
	}

}
