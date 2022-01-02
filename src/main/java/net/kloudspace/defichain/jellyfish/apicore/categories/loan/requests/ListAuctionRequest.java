package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultLiquidation;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.AuctionPagination;

public class ListAuctionRequest implements IRpcRequest<List<VaultLiquidation>> {
	
	private AuctionPagination pagination;
	
	public ListAuctionRequest(AuctionPagination page) {
		this.pagination = page;
	}

	@Override
	public String getName() {
		return "listauctions";
	}

	@Override
	public String getParameters() {
		return "["+this.pagination.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<List<VaultLiquidation>> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<VaultLiquidation> data = new ArrayList<>();
		array.forEach(ele ->{
			data.add(new Gson().fromJson(ele.getAsJsonObject(), VaultLiquidation.class));
		});
		
		return new RpcResponse<>(data, obj.get("id").getAsInt());
	}

}
