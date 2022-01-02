package net.kloudspace.defichain.jellyfish.apicore.categories.net;

import java.io.IOException;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.net.model.NetworkInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.net.requests.GetConnectionCountRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.net.requests.GetNetworkInfoRequest;

public class NetworkController {
	
	private RpcClient client;
	
	public NetworkController(RpcClient client) {
		this.client = client;
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> getConnectionCount() throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new GetConnectionCountRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<NetworkInfo> getNetworkInfo() throws IOException, ApiError {
		return (RpcResponse<NetworkInfo>) client.call(new GetNetworkInfoRequest());
	}
	
	/**
	 * 	TODO:
	 * 	1. getconnectioncount
	 * 	2. getnetworkinfo
	 */

}
