package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.CollateralTokenDetail;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.Token;

public class GetCollateralTokenRequest implements IRpcRequest<CollateralTokenDetail> {

	private final String tokenid;

	public GetCollateralTokenRequest(String tokenid) {
		this.tokenid = tokenid;

	}

	@Override
	public String getName() {
		return "getcollateraltoken";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.tokenid + "\"]";
	}

	@Override
	public RpcResponse<CollateralTokenDetail> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), CollateralTokenDetail.class),
				0);
	}

}
