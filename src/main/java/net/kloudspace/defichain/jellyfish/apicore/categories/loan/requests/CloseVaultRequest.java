package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.CloseVaultOptions;

public class CloseVaultRequest<T> implements IRpcRequest<T> {
	
	public final CloseVaultOptions options;
	
	public CloseVaultRequest(CloseVaultOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "closevault";
	}

	@Override
	public String getParameters() {
		return "["+this.options.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		System.out.println(obj);
		// TODO Auto-generated method stub
		return null;
	}

}
