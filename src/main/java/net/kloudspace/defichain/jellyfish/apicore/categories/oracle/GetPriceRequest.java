package net.kloudspace.defichain.jellyfish.apicore.categories.oracle;

import java.math.BigDecimal;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.OraclePriceFeed;

public class GetPriceRequest implements IRpcRequest<BigDecimal> {
	
	private final OraclePriceFeed options;

	public GetPriceRequest(OraclePriceFeed options) {
		this.options = options;
	}

	@Override
	public String getName() {
		return "getprice";
	}

	@Override
	public String getParameters() {
		return "[" +this.options.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<BigDecimal> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsBigDecimal(), 0);
	}
	
	

}
