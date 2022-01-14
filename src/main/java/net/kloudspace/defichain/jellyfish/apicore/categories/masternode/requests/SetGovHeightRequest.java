package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options.Flag;

public class SetGovHeightRequest implements IRpcRequest<String> {

	private final Flag<?> flag;
	private final Number activationHeight;
	
	public SetGovHeightRequest(Flag<?> flag, Number height) {
		this.flag = flag;
		this.activationHeight = height;
	}

	@Override
	public String getName() {
		return "setgov";
	}

	@Override
	public String getParameters() {
		return "[" + this.flag.getAsParameter() + ","+this.activationHeight+ "]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
