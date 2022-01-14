package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.UpdateOracleOptions;

public class UpdateOracleRequest implements IRpcRequest<String> {

	private final String address;
	private final String oracleId;
	private final UpdateOracleOptions options;

	public UpdateOracleRequest(String address, String oracleId, UpdateOracleOptions options) {
		this.address = address;
		this.oracleId = oracleId;
		this.options = options;
	}

	@Override
	public String getName() {
		return "updateoracle";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.oracleId + "\",\"" + this.address + "\"," + this.options.getAsParameter() + "]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
