package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.Interest;

public class GetInterestRequest<T> implements IRpcRequest<T> {

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

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		JsonObject result = obj.get("result").getAsJsonObject();
		Interest data = new Interest(result.get("token").getAsString(), result.get("totalInterest").getAsBigDecimal(), result.get("interestPerBlock").getAsBigDecimal());
		return new RpcResponse<>((T)data, 0);
	}

}
