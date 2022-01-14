package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options.Flag;

public class SetGovRequest implements IRpcRequest<String> {

	private final Flag<?> flag;

	public SetGovRequest(Flag<?> flag) {
		this.flag = flag;
	}

	@Override
	public String getName() {
		return "setgov";
	}

	@Override
	public String getParameters() {
		return "[" + this.flag.getAsParameter() + "]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
