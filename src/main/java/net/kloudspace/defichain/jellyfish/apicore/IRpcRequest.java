package net.kloudspace.defichain.jellyfish.apicore;

import javax.annotation.Nullable;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;

public interface IRpcRequest<T> {
	
	String getName();
	@Nullable String getParameters();

	RpcResponse<T> parse(JsonObject obj) throws ApiError;

}
