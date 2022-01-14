package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;

public class GetOracleDataRequest implements IRpcRequest<String> {
	
	private final String oracleId;

	public GetOracleDataRequest(String oracleId) {
		super();
		this.oracleId = oracleId;
	}

	@Override
	public String getName() {
		return "getoracledata";
	}

	@Override
	public String getParameters() {
		return "[\""+ this.oracleId +"\"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}
	
	

}
