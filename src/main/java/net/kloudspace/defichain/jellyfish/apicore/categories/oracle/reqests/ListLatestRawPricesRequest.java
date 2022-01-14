package net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model.OracleRawPrice;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.OraclePriceFeed;

public class ListLatestRawPricesRequest implements IRpcRequest<OracleRawPrice[]> {
	
	private final OraclePriceFeed priceFeed;
	
	public ListLatestRawPricesRequest(OraclePriceFeed priceFeed) {
		this.priceFeed = priceFeed;
	}

	@Override
	public String getName() {
		return "listlatestrawprices";
	}

	@Override
	public String getParameters() {
		return "["+this.priceFeed.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<OracleRawPrice[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<OracleRawPrice> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(new Gson().fromJson(ele.getAsJsonObject(), OracleRawPrice.class));
		});

		return new RpcResponse<>(list.toArray(new OracleRawPrice[list.size()]), 0);
	}

}
