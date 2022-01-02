package net.kloudspace.defichain.jellyfish.apicore.categories.server;

import java.io.IOException;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.server.model.RpcInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.server.requests.GetRpcInfoRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.server.requests.UptimeRequest;

public class Server {
	
	
	private RpcClient client;
	
	public Server(RpcClient client) {
		this.client = client;
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<RpcInfo> getRpcInfo() throws IOException, ApiError {
		return (RpcResponse<RpcInfo>) client.call(new GetRpcInfoRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<Number> uptime() throws IOException, ApiError {
		return (RpcResponse<Number>) client.call(new UptimeRequest());
	}
	
	/**
	 * 	TODO:
	 * 	1. getrpcinfo
	 * 	2. uptime
	 */

}
