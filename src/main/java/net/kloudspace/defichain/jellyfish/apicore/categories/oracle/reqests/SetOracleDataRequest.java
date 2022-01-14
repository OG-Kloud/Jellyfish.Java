package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.SetOracleDataOptions;

public class SetOracleDataRequest implements IRpcRequest<String> {
	
	private final String oracleId;
	private final Number timestamp;
	private final SetOracleDataOptions options;
	public SetOracleDataRequest(String oracleId, Number timestamp, SetOracleDataOptions options) {
		this.oracleId = oracleId;
		this.timestamp = timestamp;
		this.options = options;
	}
	@Override
	public String getName() {
		return "setoracledata";
	}
	@Override
	public String getParameters() {
		return "[\"" + this.oracleId + "\"," + this.timestamp + "," + this.options.getAsParameter()+"]";
	}
	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}
	
	
	
	

}
