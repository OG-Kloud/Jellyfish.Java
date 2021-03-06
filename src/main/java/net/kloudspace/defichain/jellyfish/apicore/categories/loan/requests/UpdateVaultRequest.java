package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.UpdateVaultOptions;

public class UpdateVaultRequest implements IRpcRequest<String> {
	
	private final String vaultid;
	private final UpdateVaultOptions options;
	
	public UpdateVaultRequest(String vaultID, UpdateVaultOptions options) {
		this.vaultid = vaultID;
		this.options = options;
	}

	@Override
	public String getName() {
		return "updatevault";
	}

	@Override
	public String getParameters() {
		return "["+this.vaultid+",{ownerAddress:"+this.options.getVaultOwnersAddress()+",loanSchemeId:"+this.options.getLoanSchemeId()+"}]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result"), String.class), 0);
	}

}
