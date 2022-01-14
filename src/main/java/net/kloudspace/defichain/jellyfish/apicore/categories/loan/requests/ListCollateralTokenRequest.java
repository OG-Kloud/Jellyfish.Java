package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.CollateralTokenDetail;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.ListCollateralTokenOptions;

public class ListCollateralTokenRequest implements IRpcRequest<CollateralTokenDetail[]> {
	
	private final ListCollateralTokenOptions options;
	
	public ListCollateralTokenRequest() {
		this.options = null;
	}
	
	public ListCollateralTokenRequest(ListCollateralTokenOptions opts) {
		this.options = opts;
	}
	

	@Override
	public String getName() {
		return "listcollateraltokens";
	}

	@Override
	public String getParameters() {
		if(this.options == null)return "[]";
		else return "[{\"height\":" + options.getHeight() + ",\"all\":" + options.isAll()+"}]";
	}

	@Override
	public RpcResponse<CollateralTokenDetail[]> parse(JsonObject obj) {
		JsonObject results = obj.get("result").getAsJsonObject();
		List<CollateralTokenDetail> list = new ArrayList<>();
		Set<String> keys = results.keySet();
		keys.forEach(key ->{
			list.add(new Gson().fromJson(results.get(key).getAsJsonObject(), CollateralTokenDetail.class));
		});
		return new RpcResponse<>(list.toArray(new CollateralTokenDetail[list.size()]), 0);
	}

}
