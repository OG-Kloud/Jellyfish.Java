package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.AppointOracleOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.OraclePriceFeedOption;

public class AppointOracleRequest implements IRpcRequest<String> {

	private final String address;
	private final OraclePriceFeedOption priceFeeds;
	private final AppointOracleOptions options;
	private final Number weightage;

	public AppointOracleRequest(String address, OraclePriceFeedOption priceFeeds, AppointOracleOptions options,
			Number weightage) {
		this.address = address;
		this.priceFeeds = priceFeeds;
		this.options = options;
		this.weightage = weightage;
	}

	@Override
	public String getName() {
		return "appointoracle";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.address + "\"," + this.priceFeeds.getAsParameter() + "," + this.options.getAsParameter()
				+ "," + this.weightage + "]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
