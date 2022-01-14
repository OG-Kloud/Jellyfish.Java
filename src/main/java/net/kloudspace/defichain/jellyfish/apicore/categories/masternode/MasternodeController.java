package net.kloudspace.defichain.jellyfish.apicore.categories.masternode;

import java.io.IOException;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model.MasternodeAnchor;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model.MasternodeInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options.CreateMasternodeOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options.Flag;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options.MasternodePagination;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests.CreateMasterNodeRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests.GetActiveMasternodeCount;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests.GetMasternodeRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests.ListAnchorsRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests.ListMasternodesRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests.ResignMasternodeRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests.SetGovHeightRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.masternode.requests.SetGovRequest;


/**
 * Implementation in progress
 * @author Kloudspace
 *
 */
public class MasternodeController {

	private RpcClient client;

	public MasternodeController(RpcClient client) {
		this.client = client;
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<String> createMasternode(String ownerAddress, String operatorAddress,
			CreateMasternodeOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new CreateMasterNodeRequest(ownerAddress, operatorAddress, options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<MasternodeInfo[]> listMasternodes(MasternodePagination pagination) throws IOException, ApiError {
		return (RpcResponse<MasternodeInfo[]>) client.call(new ListMasternodesRequest(pagination));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<MasternodeInfo> getMasternode(String masternodeId) throws IOException, ApiError {
		return (RpcResponse<MasternodeInfo>) client.call(new GetMasternodeRequest(masternodeId));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<String> resignMasternode(String masternodeId) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new ResignMasternodeRequest(masternodeId));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<String> setGov(Flag<?> flag) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new SetGovRequest(flag));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> setGovHeight(Flag<?> flag, Number height) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new SetGovHeightRequest(flag, height));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<MasternodeAnchor[]> listAnchors() throws IOException, ApiError {
		return (RpcResponse<MasternodeAnchor[]>)client.call(new ListAnchorsRequest());
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<Number> getActiveMasternodeCount() throws IOException, ApiError {
		return (RpcResponse<Number>) client.call(new GetActiveMasternodeCount());
	}

	/**
	 * TODO: 
	 * 1. createmasternode			-Done 
	 * 2. listmasternodes 			-Done 
	 * 3. getmasternode				-Done 
	 * 4. resignmasternode 			-Done 
	 * 5. setgov 					-Done
	 * 6. setgovheight 				-Done
	 * 7. getgov 					
	 * 8. listgovs 					
	 * 9. getactivemasternodecount  -Done
	 * 10. getAnchorTeams			
	 * 11. listAnchors				-Done
	 */

}
