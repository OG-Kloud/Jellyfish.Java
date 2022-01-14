package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.CreateWalletResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.CreateWalletOptions;

public class CreateWalletRequest implements IRpcRequest<CreateWalletResult> {

	private final CreateWalletOptions options;
	private final String walletName;
	private final boolean disablePrivKeys;
	
	public CreateWalletRequest(String walletName, boolean disablePrivateKeys, CreateWalletOptions opts) {
		this.options = opts;
		this.walletName = walletName;
		this.disablePrivKeys = disablePrivateKeys;
	}
	
	@Override
	public String getName() {
		return "createwallet";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.walletName + "\"," + this.disablePrivKeys + ","+ this.options.getAsParameter() + "]";
	}

	@Override
	public RpcResponse<CreateWalletResult> parse(JsonObject obj) throws ApiError {
		// TODO Auto-generated method stub
		return null;
	}

}
