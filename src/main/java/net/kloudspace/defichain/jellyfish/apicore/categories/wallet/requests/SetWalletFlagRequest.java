package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.WalletFlagResult;

public class SetWalletFlagRequest implements IRpcRequest<WalletFlagResult> {
	
	private final String flag;
	private final boolean flagstate;
	
	public SetWalletFlagRequest(String flag, boolean flagState) {
		this.flag = flag;
		this.flagstate = flagState;
	}

	@Override
	public String getName() {
		return "setwalletflag";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.flag + "\"," + this.flagstate + "]";
	}

	@Override
	public RpcResponse<WalletFlagResult> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), WalletFlagResult.class), 0);
	}

}
