package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.options.AddPoolLiquiditySourceOptions;

public class AddPoolLiquidityRequest implements IRpcRequest<String> {
	
	private final AddPoolLiquiditySourceOptions options;
	private final String shareaddress;
	
	public AddPoolLiquidityRequest(AddPoolLiquiditySourceOptions opts, String reciveAddress) {
		this.options = opts;
		this.shareaddress = reciveAddress;
	}

	@Override
	public String getName() {
		return "addpoolliquidity";
	}

	@Override
	public String getParameters() {
		return "["+this.options.getAsParameter()+",\"" + this.shareaddress+"\"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
