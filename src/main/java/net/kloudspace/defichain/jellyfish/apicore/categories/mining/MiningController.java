package net.kloudspace.defichain.jellyfish.apicore.categories.mining;

import java.io.IOException;
import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.mining.model.MiningInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.mining.requests.GetMiningInfoRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.mining.requests.GetNetworkHashRequest;

public class MiningController {
	
	private final RpcClient client;
	
	public MiningController(RpcClient client) {
		this.client = client;
	}
	
	public BigDecimal getNetworkHashPerSecond() throws IOException, ApiError {
		return getNetworkHashPerSecond(120, -1).get();
	}
	
	@SuppressWarnings("unchecked")//????????
	public RpcResponse<BigDecimal> getNetworkHashPerSecond(Number nBlocks, Number height) throws IOException, ApiError {
		RpcResponse<BigDecimal> result = (RpcResponse<BigDecimal>) client.call(new GetNetworkHashRequest<>(nBlocks, height));
		System.out.println("\nNetworkHashPerSecond: "+ result.get() + "\n");
		return result;
	}
	
	@SuppressWarnings("unchecked")//???????????
	public RpcResponse<MiningInfo> getMiningInfo() throws IOException, ApiError {
		return (RpcResponse<MiningInfo>) client.call(new GetMiningInfoRequest<>());
	}
	
	/**
	 * 	TODO:
	 * DONE 1. getmininginfo
	 *  2. estimatesmartfees
	 */

}
