package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.Vault;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultActive;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultLiquidation;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultState;

public class GetVaultRequest<T> implements IRpcRequest<T> {

	private final String vaultID;

	public GetVaultRequest(String vaultid) {
		this.vaultID = vaultid;
	}

	@Override
	public String getName() {
		return "getvault";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.vaultID + "\"]";
	}

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		JsonObject result = obj.get("result").getAsJsonObject();
		if (result.get("state").getAsString().equals(VaultState.IN_LIQUIDATION.getState()))
			return new RpcResponse<>((T) new Gson().fromJson(result, VaultLiquidation.class), 0);
		else if (result.get("state").getAsString().equals(VaultState.ACTIVE.getState()))
			return new RpcResponse<>((T) new Gson().fromJson(result, VaultActive.class), 0);
		else
			return new RpcResponse<>((T) new Gson().fromJson(result, Vault.class), 0);

	}

}
