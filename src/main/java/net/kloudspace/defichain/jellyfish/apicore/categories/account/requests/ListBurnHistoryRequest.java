package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountHistory;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.BurnHistory;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.options.BurnHistoryOptions;

public class ListBurnHistoryRequest implements IRpcRequest<BurnHistory[]> {

	private final BurnHistoryOptions options;

	public ListBurnHistoryRequest(BurnHistoryOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "listburnhistory";
	}

	@Override
	public String getParameters() {
		return "[" + this.options.getAsParameter() + "]";
	}

	@Override
	public RpcResponse<BurnHistory[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<BurnHistory> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(new Gson().fromJson(ele.getAsJsonObject(), BurnHistory.class));
		});

		return new RpcResponse<>(list.toArray(new BurnHistory[list.size()]), 0);
	}

}
