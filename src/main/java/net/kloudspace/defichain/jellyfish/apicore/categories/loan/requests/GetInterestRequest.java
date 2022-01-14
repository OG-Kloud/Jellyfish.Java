package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.Interest;

public class GetInterestRequest implements IRpcRequest<Interest> {

	private final String schemeid;
	
	public GetInterestRequest(String schemeId) {
		this.schemeid = schemeId;
	}
	
	@Override
	public String getName() {
		return "getinterest";
	}

	@Override
	public String getParameters() {
		return "["+this.schemeid+"]";
	}

	@Override
	public RpcResponse<Interest> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), Interest.class), 0);
	}

}
