package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model.MasternodeInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options.MasternodePagination;

public class ListMasternodesRequest implements IRpcRequest<MasternodeInfo[]> {

	private final MasternodePagination pagination;

	public ListMasternodesRequest(MasternodePagination pagination) {

		this.pagination = pagination;
	}

	@Override
	public String getName() {
		return "listmasternodes";
	}

	@Override
	public String getParameters() {
		return "[" + (this.pagination == null ? "" : this.pagination.getAsParameter() + ",true")+"]";
	}

	@Override
	public RpcResponse<MasternodeInfo[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<MasternodeInfo> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(new Gson().fromJson(ele.getAsJsonObject(), MasternodeInfo.class));
		});

		return new RpcResponse<>(list.toArray(new MasternodeInfo[list.size()]), 0);
	}

}
