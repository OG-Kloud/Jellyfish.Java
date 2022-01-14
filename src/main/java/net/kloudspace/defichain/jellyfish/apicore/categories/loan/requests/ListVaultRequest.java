package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.Vault;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultActive;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultLiquidation;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultState;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.ListVaultOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.VaultPagination;

public class ListVaultRequest implements IRpcRequest<Vault[]> {
	
	private final ListVaultOptions options;
	private final VaultPagination pageination;
	
	public ListVaultRequest(ListVaultOptions options, VaultPagination pagination) {
		this.options = options;
		this.pageination = pagination;
	}

	@Override
	public String getName() {
		return "listvaults";
	}

	@Override
	public String getParameters() {
		Gson gson = new GsonBuilder().create();		
		return "["+gson.toJson(this.options)+"," + (pageination != null ? gson.toJson(this.pageination) : "{}") +"]";
	}

	@Override
	public RpcResponse<Vault[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		Gson gson = new Gson();
		List<Vault> data = new ArrayList<Vault>();
		array.forEach(ele ->{
			if(ele.getAsJsonObject().get("state").getAsString().equals(VaultState.ACTIVE.getState()))data.add(gson.fromJson(ele.getAsJsonObject(), VaultActive.class));
			if(ele.getAsJsonObject().get("state").getAsString().equals(VaultState.IN_LIQUIDATION.getState()))data.add(gson.fromJson(ele.getAsJsonObject(), VaultLiquidation.class));
		});
		
		return new RpcResponse<>(data.toArray(new Vault[data.size()]), 0);
	}

}
